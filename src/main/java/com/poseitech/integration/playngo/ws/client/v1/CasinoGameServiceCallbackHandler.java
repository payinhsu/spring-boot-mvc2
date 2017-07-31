/**
 * CasinoGameServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package com.poseitech.integration.playngo.ws.client.v1;

import com.poseitech.integration.playngo.ws.client.model.user.BalanceResponse;
import com.poseitech.integration.playngo.ws.client.model.user.CreditResponse;
import com.poseitech.integration.playngo.ws.client.model.user.DebitResponse;
import com.poseitech.integration.playngo.ws.client.model.user.GetTicketResponse;
import com.poseitech.integration.playngo.ws.client.model.user.GetUnfinishedGamesResponse;
import com.poseitech.integration.playngo.ws.client.model.user.RegisterUserResponse;

/**
 * CasinoGameServiceCallbackHandler Callback class, Users can extend this class
 * and implement their own receiveResult and receiveError methods.
 */
public abstract class CasinoGameServiceCallbackHandler {
   protected Object clientData;

   /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is
    * called.
    * 
    * @param clientData
    *           Object mechanism by which the user can pass in user data that
    *           will be avilable at the time this callback is called.
    */
   public CasinoGameServiceCallbackHandler(Object clientData) {
      this.clientData = clientData;
   }

   /**
    * Please use this constructor if you don't want to set any clientData
    */
   public CasinoGameServiceCallbackHandler() {
      this.clientData = null;
   }

   /**
    * Get the client data
    */
   public Object getClientData() {
      return clientData;
   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from getTriggeredAchievementsByPlayer operation
    */
//   public void receiveErrorgetTriggeredAchievementsByPlayer(java.lang.Exception e) {
//   }

   /**
    * auto generated Axis2 call back method for balance method override this
    * method for handling normal response from balance operation
    */
   public void receiveResultbalance(BalanceResponse result) {
   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from balance operation
    */
   public void receiveErrorbalance(java.lang.Exception e) {
   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from cancelFreegame operation
    */
//   public void receiveErrorcancelFreegame(java.lang.Exception e) {
//   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from getFreegameOffers operation
    */
//   public void receiveErrorgetFreegameOffers(java.lang.Exception e) {
//   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from addFreegameOffers operation
    */
//   public void receiveErroraddFreegameOffers(java.lang.Exception e) {
//   }

   /**
    * auto generated Axis2 call back method for getUnfinishedGames method
    * override this method for handling normal response from getUnfinishedGames
    * operation
    */
   public void receiveResultgetUnfinishedGames(GetUnfinishedGamesResponse result) {
   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from getUnfinishedGames operation
    */
   public void receiveErrorgetUnfinishedGames(java.lang.Exception e) {
   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from getAchievementSummary operation
    */
//   public void receiveErrorgetAchievementSummary(java.lang.Exception e) {
//   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from getAchievements operation
    */
//   public void receiveErrorgetAchievements(java.lang.Exception e) {
//   }

   /**
    * auto generated Axis2 call back method for credit method override this
    * method for handling normal response from credit operation
    */
   public void receiveResultcredit(CreditResponse result) {
   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from credit operation
    */
   public void receiveErrorcredit(java.lang.Exception e) {
   }

   /**
    * auto generated Axis2 call back method for getTicket method override this
    * method for handling normal response from getTicket operation
    */
   public void receiveResultgetTicket(GetTicketResponse result) {
   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from getTicket operation
    */
   public void receiveErrorgetTicket(java.lang.Exception e) {
   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from getTriggeredAchievements operation
    */
//   public void receiveErrorgetTriggeredAchievements(java.lang.Exception e) {
//   }

   /**
    * auto generated Axis2 call back method for registerUser method override
    * this method for handling normal response from registerUser operation
    */
   public void receiveResultregisterUser(RegisterUserResponse result) {
   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from registerUser operation
    */
   public void receiveErrorregisterUser(java.lang.Exception e) {
   }

   /**
    * auto generated Axis2 call back method for debit method override this
    * method for handling normal response from debit operation
    */
   public void receiveResultdebit(DebitResponse result) {
   }

   /**
    * auto generated Axis2 Error handler override this method for handling error
    * response from debit operation
    */
   public void receiveErrordebit(java.lang.Exception e) {
   }
}
