/**
 * CasinoGameService_Credit_ValidationFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package com.poseitech.integration.playngo.ws.client.v1;

import com.poseitech.integration.playngo.ws.client.model.ValidationFaultE;

public class CasinoGameService_Credit_ValidationFaultFault_FaultMessage extends java.lang.Exception {
   private static final long serialVersionUID = 1478140917610L;
   private ValidationFaultE faultMessage;

   public CasinoGameService_Credit_ValidationFaultFault_FaultMessage() {
      super("CasinoGameService_Credit_ValidationFaultFault_FaultMessage");
   }

   public CasinoGameService_Credit_ValidationFaultFault_FaultMessage(java.lang.String s) {
      super(s);
   }

   public CasinoGameService_Credit_ValidationFaultFault_FaultMessage(java.lang.String s, java.lang.Throwable ex) {
      super(s, ex);
   }

   public CasinoGameService_Credit_ValidationFaultFault_FaultMessage(java.lang.Throwable cause) {
      super(cause);
   }

   public void setFaultMessage(ValidationFaultE msg) {
      faultMessage = msg;
   }

   public ValidationFaultE getFaultMessage() {
      return faultMessage;
   }
}
