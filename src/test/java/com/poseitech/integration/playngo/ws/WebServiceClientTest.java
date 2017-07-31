package com.poseitech.integration.playngo.ws;

import java.net.InetAddress;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.impl.httpclient4.HttpTransportPropertiesImpl;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poseitech.integration.playngo.config.MicroserviceApplication;
import com.poseitech.integration.playngo.model.EnumPlaynGoUserGender;
import com.poseitech.integration.playngo.model.PlaynGoUser;
import com.poseitech.integration.playngo.ws.client.WebServiceCientCallBackHandler;
import com.poseitech.integration.playngo.ws.client.model.user.Balance;
import com.poseitech.integration.playngo.ws.client.model.user.BalanceResponse;
import com.poseitech.integration.playngo.ws.client.model.user.GetTicket;
import com.poseitech.integration.playngo.ws.client.model.user.GetTicketResponse;
import com.poseitech.integration.playngo.ws.client.model.user.RegisterUser;
import com.poseitech.integration.playngo.ws.client.model.user.RegisterUserResponse;
import com.poseitech.integration.playngo.ws.client.util.WSBeanUtils;
import com.poseitech.integration.playngo.ws.client.v1.CasinoGameServiceStub;
import com.poseitech.utils.DateUtil;

/**
 * Sample junit test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MicroserviceApplication.class, initializers = ConfigFileApplicationContextInitializer.class)
public class WebServiceClientTest {

   private static final Logger log = LoggerFactory.getLogger(WebServiceClientTest.class);
   private final static String SERVICE_ENDPOINT = "http://bsistage.playngonetwork.com:22789/CasinoGameService?wsdl";
   
   @Test
   public void testBalance() {
      try {

         CasinoGameServiceStub servicesStub = new CasinoGameServiceStub(SERVICE_ENDPOINT);
         
         HttpTransportPropertiesImpl.Authenticator auth = new HttpTransportPropertiesImpl.Authenticator(); 
         auth.setPreemptiveAuthentication(true);
         auth.setUsername("pexapi");
         auth.setPassword("02e3e46218");
         
         Options options = servicesStub._getServiceClient().getOptions();
         options.setProperty(HTTPConstants.AUTHENTICATE, auth); 
         options.setProperty(HTTPConstants.CHUNKED, Boolean.FALSE);
         
         String pExternalUserId = "PoseTest";
         Balance balance = new Balance();
         balance.setExternalUserId(pExternalUserId);
         BalanceResponse wsResponse = servicesStub.balance(balance);
         if(wsResponse!=null && wsResponse.getUserBalance()!=null){
            log.info("getCurrency["+wsResponse.getUserBalance().getCurrency()+"]");
            log.info("getReal["+wsResponse.getUserBalance().getReal()+"]");
         }else{
            log.error("wsResponse is empty...");
         }
         
      }catch (AxisFault axisFault) {
         log.error("web service error["+axisFault.getMessage()+"]");
         
      } catch (Exception e) {
         log.error("error...", e);
      }
   }

   @Test
   @Ignore
   public void testRegisterUser() {
      try {

         CasinoGameServiceStub servicesStub = new CasinoGameServiceStub(SERVICE_ENDPOINT);
         
         HttpTransportPropertiesImpl.Authenticator auth = new HttpTransportPropertiesImpl.Authenticator(); 
         auth.setPreemptiveAuthentication(true);
         auth.setUsername("pexapi");
         auth.setPassword("02e3e46218");
         
         Options options = servicesStub._getServiceClient().getOptions();
         options.setProperty(HTTPConstants.AUTHENTICATE, auth); 
         options.setProperty(HTTPConstants.CHUNKED, Boolean.FALSE);
         
         PlaynGoUser pUser = new PlaynGoUser();
         pUser.setPlayerAccount("PoseTest");
         pUser.setUserName("KariTest");
         pUser.setNickName("KariTest");
         pUser.setCurrencyCode("CNY");
         pUser.setCountryCode("CN");
         pUser.setLanguageCode("zh_CN");
         pUser.setBirthday(DateUtil.parseTwDate("20000101"));
         pUser.setRegistrationDate(DateUtil.getNow());
         pUser.setBrandId("TestBrand");
         pUser.setIpAddress(InetAddress.getLocalHost());
         pUser.setGender(EnumPlaynGoUserGender.Female);
         
         RegisterUser registerUser = WSBeanUtils.parseToRegisterUser(pUser);
         RegisterUserResponse wsResponse = servicesStub.registerUser(registerUser);
         
      }catch (AxisFault axisFault) {
         log.error("web service error["+axisFault.getMessage()+"]");
         
      } catch (Exception e) {
         log.error("error...", e);
      }
   }
   
   @Test
   @Ignore
   public void testSync() {
      try {

         CasinoGameServiceStub servicesStub = new CasinoGameServiceStub(SERVICE_ENDPOINT);

         HttpTransportPropertiesImpl.Authenticator auth = new HttpTransportPropertiesImpl.Authenticator();
         auth.setPreemptiveAuthentication(true);
         auth.setUsername("pexapi");
         auth.setPassword("02e3e46218");

         Options options = servicesStub._getServiceClient().getOptions();
         options.setProperty(HTTPConstants.AUTHENTICATE, auth);
         options.setProperty(HTTPConstants.CHUNKED, Boolean.FALSE);

         GetTicket ticketRequest = new GetTicket();
         ticketRequest.setExternalUserId("12345");

         GetTicketResponse ticketResponse = servicesStub.getTicket(ticketRequest);

         String result = ticketResponse.getTicket();

      } catch (Exception e) {
         log.error("error...", e);
      }
   }

   @Test
   @Ignore
   public void testAsync() {
      try {

         CasinoGameServiceStub servicesStub = new CasinoGameServiceStub(SERVICE_ENDPOINT);
         
         HttpTransportPropertiesImpl.Authenticator auth = new HttpTransportPropertiesImpl.Authenticator(); 
         auth.setPreemptiveAuthentication(true);
         auth.setUsername("pexapi");
         auth.setPassword("02e3e46218"); //5J5RS7ZFdmGe
//         auth.setHost("172.16.12.25"); 
//         auth.setDomain("MY-PC");        
//         List<String> authSchemes = new ArrayList<String>();         
//         authSchemes.add(HttpTransportProperties.Authenticator.NTLM);        
//         auth.setAuthSchemes(authSchemes); 
         
         Options options = servicesStub._getServiceClient().getOptions();
         options.setProperty(HTTPConstants.AUTHENTICATE, auth); 
         options.setProperty(HTTPConstants.CHUNKED, Boolean.FALSE);
         
         GetTicket accountDetailsRequest = new GetTicket();
         accountDetailsRequest.setExternalUserId("12345");
         
         WebServiceCientCallBackHandler callBackHandler = new WebServiceCientCallBackHandler();
         servicesStub.startgetTicket(accountDetailsRequest, callBackHandler);

      } catch (Exception e) {
         log.error("error...", e);
      }
   }

}
