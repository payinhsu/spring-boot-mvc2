package com.poseitech.integration.playngo.service.imp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axis2.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.poseitech.integration.playngo.model.PlaynGoBalance;
import com.poseitech.integration.playngo.model.PlaynGoOpenGame;
import com.poseitech.integration.playngo.model.PlaynGoUser;
import com.poseitech.integration.playngo.service.PlaynGoException;
import com.poseitech.integration.playngo.service.PlaynGoService;
import com.poseitech.integration.playngo.ws.client.model.OpenGameId;
import com.poseitech.integration.playngo.ws.client.model.appendix.Money;
import com.poseitech.integration.playngo.ws.client.model.user.Balance;
import com.poseitech.integration.playngo.ws.client.model.user.BalanceResponse;
import com.poseitech.integration.playngo.ws.client.model.user.Credit;
import com.poseitech.integration.playngo.ws.client.model.user.CreditResponse;
import com.poseitech.integration.playngo.ws.client.model.user.Debit;
import com.poseitech.integration.playngo.ws.client.model.user.DebitResponse;
import com.poseitech.integration.playngo.ws.client.model.user.GetTicket;
import com.poseitech.integration.playngo.ws.client.model.user.GetTicketResponse;
import com.poseitech.integration.playngo.ws.client.model.user.GetUnfinishedGames;
import com.poseitech.integration.playngo.ws.client.model.user.GetUnfinishedGamesResponse;
import com.poseitech.integration.playngo.ws.client.model.user.RegisterUser;
import com.poseitech.integration.playngo.ws.client.model.user.RegisterUserResponse;
import com.poseitech.integration.playngo.ws.client.util.WSBeanUtils;
import com.poseitech.integration.playngo.ws.client.v1.CasinoGameServiceStub;

/**
 * @author B.J Lin
 *
 */
@Service
public class PlaynGoServiceImp implements PlaynGoService {
   private static Logger log = LoggerFactory.getLogger(PlaynGoServiceImp.class);
   
   @Value("${poseitech.integration.playngo.service-endpoint}")
   private String playnGoServiceEndPoint;

   @Autowired
   private CasinoGameServiceStub casinoGameServiceStub;
      
   @Transactional
   @Override
   public boolean register(PlaynGoUser pUser) throws PlaynGoException {
      try {         
         // call PlaynGo register api
         RegisterUser registerUser = WSBeanUtils.parseToRegisterUser(pUser);
         log.info("register start --> input:{}", registerUser.getOMElement(null, OMAbstractFactory.getSOAP12Factory()));
         RegisterUserResponse registerUserResponse = casinoGameServiceStub.registerUser(registerUser);
         log.info("register end --> input:{}", registerUserResponse.getOMElement(null, OMAbstractFactory.getSOAP12Factory()));
                  
         return true;
      } catch (AxisFault axisFault) {
         log.error("web service error:{}", axisFault.getMessage());
         throw new PlaynGoException("60ERR99999", axisFault.getMessage(), RegisterUser.MY_QNAME.getNamespaceURI());
      } catch (Exception e) {
         log.error(e.getMessage(), e);
         throw new PlaynGoException("99SYS9999", e.getMessage(), RegisterUser.MY_QNAME.getNamespaceURI());
      }
      
   }

   @Override
   public PlaynGoBalance credit(PlaynGoUser pUser, PlaynGoBalance pBalance) throws PlaynGoException {
      Long userId = pUser.getId();
      Double transferAmount = pBalance.getTransferAmount();
      
      // 3. call PlanGo credit api
      PlaynGoBalance rtnPlaynGoBalance = pBalance;
      try {
         log.info("user id:{}, game account:{}", userId, pUser.getGameAccount());
         Credit credit = new Credit();
         credit.setExternalUserId(pUser.getGameAccount());
         credit.setAmount(new BigDecimal(transferAmount));
         credit.setCurrency("CNY");
         credit.setExternalTransactionId(pBalance.getSn());
         log.info("credit start --> input:{}", credit.getOMElement(null, OMAbstractFactory.getSOAP12Factory()));
         CreditResponse creditResponse = casinoGameServiceStub.credit(credit);
         log.info("credit end --> input:{}", creditResponse.getOMElement(null, OMAbstractFactory.getSOAP12Factory()));
         
         long transactionId = creditResponse.getTransactionId();
         log.info("web service credit success...transactionId is {}", transactionId);
         rtnPlaynGoBalance.setExTransId(transactionId);
                  
      } catch (AxisFault axisFault) {
         log.error("web service error:{}", axisFault.getMessage());
         throw new PlaynGoException("60ERR99999", axisFault.getMessage(), playnGoServiceEndPoint);
      } catch (Exception e) {
         log.error("web service error:{}", e);
         throw new PlaynGoException("99SYS9999", e.getMessage(), playnGoServiceEndPoint);
      }
      
      return rtnPlaynGoBalance;
   }

   @Override
   public PlaynGoBalance debit(PlaynGoUser pUser, PlaynGoBalance pBalance) throws PlaynGoException {
      try {

         Debit debit = new Debit();
         debit.setExternalUserId(pUser.getGameAccount());
         debit.setAmount(BigDecimal.valueOf(pBalance.getTransferAmount()));
         debit.setCurrency("CNY");
         debit.setExternalTransactionId(pBalance.getSn());
         
         log.info("debit start --> input:{}", debit.getOMElement(null, OMAbstractFactory.getSOAP12Factory()));
         DebitResponse debitResponse = casinoGameServiceStub.debit(debit);
         log.info("debit end --> input:{}", debitResponse.getOMElement(null, OMAbstractFactory.getSOAP12Factory()));
         
         long transactionId = debitResponse.getTransactionId();
         log.info("web service Debit success...transactionId is {}", transactionId);
         pBalance.setExTransId(transactionId);

      } catch (AxisFault axisFault) {
         log.error("web service error:{}", axisFault.getMessage());
         throw new PlaynGoException("60ERR99999", axisFault.getMessage(), playnGoServiceEndPoint);
      } catch (Exception e) {
         log.error(e.getMessage(), e);
         throw new PlaynGoException("99SYS9999", e.getMessage(), playnGoServiceEndPoint);
      }
      
      return pBalance;
   }

   @Override
   public PlaynGoBalance getBalance(PlaynGoUser pUser) throws PlaynGoException {
      return getBalance(pUser.getGameAccount());
   }

   @Override
   public PlaynGoBalance getBalance(String pExternalUserId) throws PlaynGoException {
      try {
         Balance balance = new Balance();
         balance.setExternalUserId(pExternalUserId);

         log.info("getBalance start --> input:{}", balance.getOMElement(null, OMAbstractFactory.getSOAP12Factory()));
         BalanceResponse wsResponse = casinoGameServiceStub.balance(balance);
         log.info("getBalance end --> input:{}", wsResponse.getOMElement(null, OMAbstractFactory.getSOAP12Factory()));
         
         PlaynGoBalance playnGoBalance = new PlaynGoBalance();
         playnGoBalance.setTotal(wsResponse.getUserBalance().getReal().doubleValue());
         return playnGoBalance;

      } catch (AxisFault axisFault) {
         log.error("web service error:{}", axisFault.getMessage());
         throw new PlaynGoException("60ERR99999", axisFault.getMessage(), playnGoServiceEndPoint);
      } catch (Exception e) {
         log.error(e.getMessage(), e);
         throw new PlaynGoException("99SYS9999", e.getMessage(), playnGoServiceEndPoint);
      }
   }

   @Override
   public String getTicket(String pExternalUserId) throws PlaynGoException {
      try {

         GetTicket ticketRequest = new GetTicket();
         ticketRequest.setExternalUserId(pExternalUserId);
         
         log.info("getTicket start --> input:{}", ticketRequest.getOMElement(null, OMAbstractFactory.getSOAP12Factory()));
         GetTicketResponse ticketResponse = casinoGameServiceStub.getTicket(ticketRequest);
         log.info("getTicket end --> input:{}", ticketResponse.getOMElement(null, OMAbstractFactory.getSOAP12Factory()));
         
         return ticketResponse.getTicket();
         
      } catch (AxisFault axisFault) {
         log.error("web service[getTicket] error:{}", axisFault.getMessage());
         throw new PlaynGoException("60ERR99999", axisFault.getMessage(), playnGoServiceEndPoint);
         
      } catch (Exception e) {
         log.error(e.getMessage(), e);
         throw new PlaynGoException("99SYS9999", e.getMessage(), playnGoServiceEndPoint);
      }
   }
   
   @Override
   public List<PlaynGoOpenGame> getUnfinishedGames(String pExternalUserId) throws PlaynGoException {
      try {

         GetUnfinishedGames unfinishedGames = new GetUnfinishedGames();
         unfinishedGames.setExternalId(pExternalUserId);
         
         log.info("getUnfinishedGames start --> input:{}", unfinishedGames.getOMElement(null, OMAbstractFactory.getSOAP12Factory()));
         GetUnfinishedGamesResponse unfinishedGamesResponse = casinoGameServiceStub.getUnfinishedGames(unfinishedGames);
         log.info("getUnfinishedGames end --> input:{}", unfinishedGamesResponse.getOMElement(null, OMAbstractFactory.getSOAP12Factory()));
         
         OpenGameId[] openGameIds = unfinishedGamesResponse.getOpenGameIds().getOpenGameId();
         List<PlaynGoOpenGame> ls = new ArrayList<PlaynGoOpenGame>();
         if(openGameIds==null) return ls;
         for(OpenGameId openGame: openGameIds){
            PlaynGoOpenGame playnGoOpenGame = new PlaynGoOpenGame();
            playnGoOpenGame.setGameId(openGame.getGameId());
            playnGoOpenGame.setGameName(openGame.getGameName());
            playnGoOpenGame.setGameType(openGame.getGameType());
            playnGoOpenGame.setGid(openGame.getGid());
            playnGoOpenGame.setMobileGame(openGame.getMobileGame());
            playnGoOpenGame.setSerialized(openGame.getSerialized());
            Money money = openGame.getBet();
            playnGoOpenGame.setCurrency(money.getCurrency().getValue());
            playnGoOpenGame.setBet(new Double(money.getValue()));
            ls.add(playnGoOpenGame);
         }
         
         return ls;
         
      } catch (AxisFault axisFault) {
         log.error("web service[getTicket] error:{}", axisFault.getMessage());
         throw new PlaynGoException("60ERR99999", axisFault.getMessage(), playnGoServiceEndPoint);
         
      } catch (Exception e) {
         log.error(e.getMessage(), e);
         throw new PlaynGoException("99SYS9999", e.getMessage(), playnGoServiceEndPoint);
      }
   }
}
