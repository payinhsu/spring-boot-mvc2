package com.poseitech.integration.playngo.ws.client;

import org.apache.log4j.Logger;

import com.poseitech.integration.playngo.ws.client.model.user.GetTicketResponse;
import com.poseitech.integration.playngo.ws.client.v1.CasinoGameServiceCallbackHandler;

public class WebServiceCientCallBackHandler extends CasinoGameServiceCallbackHandler {

   private static final Logger log = Logger.getLogger(WebServiceCientCallBackHandler.class);

   @Override
   public Object getClientData() {
      return super.getClientData();
   }

   @Override
   public void receiveResultgetTicket(GetTicketResponse result) {
      super.receiveResultgetTicket(result);
      log.info(result.getTicket());
   }

   @Override
   public void receiveErrorgetTicket(Exception e) {
      super.receiveErrorgetTicket(e);
      log.error("An error occurred calling getTicket Service", e);
   }
}