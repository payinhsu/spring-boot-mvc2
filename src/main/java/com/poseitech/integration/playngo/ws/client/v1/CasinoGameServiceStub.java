/**
 * CasinoGameServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package com.poseitech.integration.playngo.ws.client.v1;

import com.poseitech.integration.playngo.ws.client.model.ServiceFaultE;
import com.poseitech.integration.playngo.ws.client.model.ValidationFaultE;
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

/*
 *  CasinoGameServiceStub java implementation
 */
public class CasinoGameServiceStub extends org.apache.axis2.client.Stub {
   private static int counter = 0;
   protected org.apache.axis2.description.AxisOperation[] _operations;

   // hashmaps to keep the fault mapping
   private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
   private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
   private java.util.HashMap faultMessageMap = new java.util.HashMap();

   /////////////////////////////////////////////////////////////////////////
   private javax.xml.namespace.QName[] opNameArray = null;

   /**
    * Constructor that takes in a configContext
    */
   public CasinoGameServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
         java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
      this(configurationContext, targetEndpoint, false);
   }

   /**
    * Constructor that takes in a configContext and useseperate listner
    */
   public CasinoGameServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
         java.lang.String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault {
      // To populate AxisService
      populateAxisService();
      populateFaults();

      _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

      _service.applyPolicy();

      _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
      _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
   }

   /**
    * Default Constructor
    */
   public CasinoGameServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext)
         throws org.apache.axis2.AxisFault {
      this(configurationContext, "http://bsistage.playngonetwork.com:22789/CasinoGameService");
   }

   /**
    * Default Constructor
    */
   public CasinoGameServiceStub() throws org.apache.axis2.AxisFault {
      this("http://bsistage.playngonetwork.com:22789/CasinoGameService");
   }

   /**
    * Constructor taking the target endpoint
    */
   public CasinoGameServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
      this(null, targetEndpoint);
   }

   private static synchronized java.lang.String getUniqueSuffix() {
      // reset the counter if it is greater than 99999
      if (counter > 99999) {
         counter = 0;
      }

      counter = counter + 1;

      return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
   }

   private void populateAxisService() throws org.apache.axis2.AxisFault {
      // creating the Service with a unique name
      _service = new org.apache.axis2.description.AxisService("CasinoGameService" + getUniqueSuffix());
      addAnonymousOperations();

      // creating the operations
      org.apache.axis2.description.AxisOperation __operation;

      _operations = new org.apache.axis2.description.AxisOperation[13];

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "getTriggeredAchievementsByPlayer"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[0] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "balance"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[1] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "cancelFreegame"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[2] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "getFreegameOffers"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[3] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "addFreegameOffers"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[4] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "getUnfinishedGames"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[5] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "getAchievementSummary"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[6] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "getAchievements"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[7] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "credit"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[8] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "getTicket"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[9] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "getTriggeredAchievements"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[10] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "registerUser"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[11] = __operation;

      __operation = new org.apache.axis2.description.OutInAxisOperation();

      __operation.setName(new javax.xml.namespace.QName("http://playngo.com/v1", "debit"));
      _service.addOperation(__operation);

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject()
            .attachPolicy(getPolicy(
                  "<wsp:Policy wsu:Id=\"CasinoGameServiceHttp_policy\" xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"><wsp:ExactlyOne><wsp:All><http:BasicAuthentication xmlns:http=\"http://schemas.microsoft.com/ws/06/2004/policy/http\"></http:BasicAuthentication></wsp:All></wsp:ExactlyOne></wsp:Policy>"));

      _operations[12] = __operation;
   }

   // populates the faults
   private void populateFaults() {
      faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetTriggeredAchievementsByPlayer"),
            "com.playngo.v1.CasinoGameService_GetTriggeredAchievementsByPlayer_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetTriggeredAchievementsByPlayer"),
            "com.playngo.v1.CasinoGameService_GetTriggeredAchievementsByPlayer_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetTriggeredAchievementsByPlayer"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "GetTriggeredAchievementsByPlayer"),
            "com.playngo.v1.CasinoGameService_GetTriggeredAchievementsByPlayer_ValidationFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "GetTriggeredAchievementsByPlayer"),
            "com.playngo.v1.CasinoGameService_GetTriggeredAchievementsByPlayer_ValidationFaultFault_FaultMessage");
      faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
            "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
            "GetTriggeredAchievementsByPlayer"), "com.playngo.v1.CasinoGameServiceStub$ValidationFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "Balance"),
            "com.playngo.v1.CasinoGameService_Balance_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "Balance"),
            "com.playngo.v1.CasinoGameService_Balance_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "Balance"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "CancelFreegame"),
            "com.playngo.v1.CasinoGameService_CancelFreegame_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "CancelFreegame"),
            "com.playngo.v1.CasinoGameService_CancelFreegame_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "CancelFreegame"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "CancelFreegame"),
            "com.playngo.v1.CasinoGameService_CancelFreegame_ValidationFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "CancelFreegame"),
            "com.playngo.v1.CasinoGameService_CancelFreegame_ValidationFaultFault_FaultMessage");
      faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                  "ValidationFault"),
            "CancelFreegame"), "com.playngo.v1.CasinoGameServiceStub$ValidationFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetFreegameOffers"),
            "com.playngo.v1.CasinoGameService_GetFreegameOffers_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetFreegameOffers"),
            "com.playngo.v1.CasinoGameService_GetFreegameOffers_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetFreegameOffers"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "GetFreegameOffers"),
            "com.playngo.v1.CasinoGameService_GetFreegameOffers_ValidationFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "GetFreegameOffers"),
            "com.playngo.v1.CasinoGameService_GetFreegameOffers_ValidationFaultFault_FaultMessage");
      faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                  "ValidationFault"),
            "GetFreegameOffers"), "com.playngo.v1.CasinoGameServiceStub$ValidationFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "AddFreegameOffers"),
            "com.playngo.v1.CasinoGameService_AddFreegameOffers_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "AddFreegameOffers"),
            "com.playngo.v1.CasinoGameService_AddFreegameOffers_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "AddFreegameOffers"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "AddFreegameOffers"),
            "com.playngo.v1.CasinoGameService_AddFreegameOffers_ValidationFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "AddFreegameOffers"),
            "com.playngo.v1.CasinoGameService_AddFreegameOffers_ValidationFaultFault_FaultMessage");
      faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                  "ValidationFault"),
            "AddFreegameOffers"), "com.playngo.v1.CasinoGameServiceStub$ValidationFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetUnfinishedGames"),
            "com.playngo.v1.CasinoGameService_GetUnfinishedGames_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetUnfinishedGames"),
            "com.playngo.v1.CasinoGameService_GetUnfinishedGames_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetUnfinishedGames"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "GetUnfinishedGames"),
            "com.playngo.v1.CasinoGameService_GetUnfinishedGames_ValidationFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "GetUnfinishedGames"),
            "com.playngo.v1.CasinoGameService_GetUnfinishedGames_ValidationFaultFault_FaultMessage");
      faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                  "ValidationFault"),
            "GetUnfinishedGames"), "com.playngo.v1.CasinoGameServiceStub$ValidationFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetAchievementSummary"),
            "com.playngo.v1.CasinoGameService_GetAchievementSummary_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetAchievementSummary"),
            "com.playngo.v1.CasinoGameService_GetAchievementSummary_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetAchievementSummary"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "GetAchievementSummary"),
            "com.playngo.v1.CasinoGameService_GetAchievementSummary_ValidationFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "GetAchievementSummary"),
            "com.playngo.v1.CasinoGameService_GetAchievementSummary_ValidationFaultFault_FaultMessage");
      faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
            "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
            "GetAchievementSummary"), "com.playngo.v1.CasinoGameServiceStub$ValidationFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetAchievements"),
            "com.playngo.v1.CasinoGameService_GetAchievements_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetAchievements"),
            "com.playngo.v1.CasinoGameService_GetAchievements_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetAchievements"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "GetAchievements"),
            "com.playngo.v1.CasinoGameService_GetAchievements_ValidationFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "GetAchievements"),
            "com.playngo.v1.CasinoGameService_GetAchievements_ValidationFaultFault_FaultMessage");
      faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                  "ValidationFault"),
            "GetAchievements"), "com.playngo.v1.CasinoGameServiceStub$ValidationFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "Credit"),
            "com.playngo.v1.CasinoGameService_Credit_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "Credit"),
            "com.playngo.v1.CasinoGameService_Credit_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "Credit"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
            "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
            "Credit"), "com.playngo.v1.CasinoGameService_Credit_ValidationFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
            "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
            "Credit"), "com.playngo.v1.CasinoGameService_Credit_ValidationFaultFault_FaultMessage");
      faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation",
                  "ValidationFault"),
            "Credit"), "com.playngo.v1.CasinoGameServiceStub$ValidationFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetTicket"),
            "com.playngo.v1.CasinoGameService_GetTicket_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetTicket"),
            "com.playngo.v1.CasinoGameService_GetTicket_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetTicket"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetTriggeredAchievements"),
            "com.playngo.v1.CasinoGameService_GetTriggeredAchievements_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetTriggeredAchievements"),
            "com.playngo.v1.CasinoGameService_GetTriggeredAchievements_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "GetTriggeredAchievements"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "GetTriggeredAchievements"),
            "com.playngo.v1.CasinoGameService_GetTriggeredAchievements_ValidationFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
                  "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
                  "GetTriggeredAchievements"),
            "com.playngo.v1.CasinoGameService_GetTriggeredAchievements_ValidationFaultFault_FaultMessage");
      faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
            "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"),
            "GetTriggeredAchievements"), "com.playngo.v1.CasinoGameServiceStub$ValidationFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "RegisterUser"),
            "com.playngo.v1.CasinoGameService_RegisterUser_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "RegisterUser"),
            "com.playngo.v1.CasinoGameService_RegisterUser_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "RegisterUser"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "Debit"),
            "com.playngo.v1.CasinoGameService_Debit_ServiceFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "Debit"),
            "com.playngo.v1.CasinoGameService_Debit_ServiceFaultFault_FaultMessage");
      faultMessageMap.put(
            new org.apache.axis2.client.FaultMapKey(
                  new javax.xml.namespace.QName("http://playngo.com/v1", "ServiceFault"), "Debit"),
            "com.playngo.v1.CasinoGameServiceStub$ServiceFaultE");

      faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
            "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"), "Debit"),
            "com.playngo.v1.CasinoGameService_Debit_ValidationFaultFault_FaultMessage");
      faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
            "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"), "Debit"),
            "com.playngo.v1.CasinoGameService_Debit_ValidationFaultFault_FaultMessage");
      faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName(
            "http://www.microsoft.com/practices/EnterpriseLibrary/2007/01/wcf/validation", "ValidationFault"), "Debit"),
            "com.playngo.v1.CasinoGameServiceStub$ValidationFaultE");
   }

   /**
    * Auto generated method signature <summary>Get the user's account
    * balance</summary>
    * 
    * @see com.playngo.v1.CasinoGameService#balance
    * @param balance2
    * @throws CasinoGameService_Balance_ServiceFaultFault_FaultMessage
    *            :
    */
   public BalanceResponse balance(Balance balance2)
         throws java.rmi.RemoteException, CasinoGameService_Balance_ServiceFaultFault_FaultMessage {
      org.apache.axis2.context.MessageContext _messageContext = null;

      try {
         org.apache.axis2.client.OperationClient _operationClient = _serviceClient
               .createClient(_operations[1].getName());
         _operationClient.getOptions().setAction("http://playngo.com/v1/CasinoGameService/Balance");
         _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

         addPropertyToOperationClient(_operationClient,
               org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

         // create a message context
         _messageContext = new org.apache.axis2.context.MessageContext();

         // create SOAP envelope with that payload
         org.apache.axiom.soap.SOAPEnvelope env = null;

         env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), balance2,
               optimizeContent(new javax.xml.namespace.QName("http://playngo.com/v1", "balance")),
               new javax.xml.namespace.QName("http://playngo.com/v1", "Balance"));

         // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
         // set the message context with that soap envelope
         _messageContext.setEnvelope(env);

         // add the message contxt to the operation client
         _operationClient.addMessageContext(_messageContext);

         // execute the operation client
         _operationClient.execute(true);

         org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
               .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
         org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

         java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), BalanceResponse.class);

         return (BalanceResponse) object;
      } catch (org.apache.axis2.AxisFault f) {
         org.apache.axiom.om.OMElement faultElt = f.getDetail();

         if (faultElt != null) {
            if (faultExceptionNameMap
                  .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Balance"))) {
               // make the fault by reflection
               try {
                  java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Balance"));
                  java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                  java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                  java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                  // message class
                  java.lang.String messageClassName = (java.lang.String) faultMessageMap
                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Balance"));
                  java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                  java.lang.Object messageObject = fromOM(faultElt, messageClass);
                  java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                        new java.lang.Class[] { messageClass });
                  m.invoke(ex, new java.lang.Object[] { messageObject });

                  if (ex instanceof CasinoGameService_Balance_ServiceFaultFault_FaultMessage) {
                     throw (CasinoGameService_Balance_ServiceFaultFault_FaultMessage) ex;
                  }

                  throw new java.rmi.RemoteException(ex.getMessage(), ex);
               } catch (java.lang.ClassCastException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.ClassNotFoundException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.NoSuchMethodException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.reflect.InvocationTargetException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.IllegalAccessException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.InstantiationException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               }
            } else {
               throw f;
            }
         } else {
            throw f;
         }
      } finally {
         if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
         }
      }
   }

   /**
    * Auto generated method signature for Asynchronous Invocations <summary>Get
    * the user's account balance</summary>
    * 
    * @see com.playngo.v1.CasinoGameService#startbalance
    * @param balance2
    */
   public void startbalance(Balance balance2, final CasinoGameServiceCallbackHandler callback)
         throws java.rmi.RemoteException {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
      _operationClient.getOptions().setAction("http://playngo.com/v1/CasinoGameService/Balance");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

      // Style is Doc.
      env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), balance2,
            optimizeContent(new javax.xml.namespace.QName("http://playngo.com/v1", "balance")),
            new javax.xml.namespace.QName("http://playngo.com/v1", "Balance"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // create message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message context to the operation client
      _operationClient.addMessageContext(_messageContext);

      _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
         public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
               org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

               java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), BalanceResponse.class);
               callback.receiveResultbalance((BalanceResponse) object);
            } catch (org.apache.axis2.AxisFault e) {
               callback.receiveErrorbalance(e);
            }
         }

         public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
               org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
               org.apache.axiom.om.OMElement faultElt = f.getDetail();

               if (faultElt != null) {
                  if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Balance"))) {
                     // make the fault by reflection
                     try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                              .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Balance"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                              .getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                              .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Balance"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                              new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof CasinoGameService_Balance_ServiceFaultFault_FaultMessage) {
                           callback.receiveErrorbalance((CasinoGameService_Balance_ServiceFaultFault_FaultMessage) ex);

                           return;
                        }

                        callback.receiveErrorbalance(new java.rmi.RemoteException(ex.getMessage(), ex));
                     } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorbalance(f);
                     } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorbalance(f);
                     } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorbalance(f);
                     } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorbalance(f);
                     } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorbalance(f);
                     } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorbalance(f);
                     } catch (org.apache.axis2.AxisFault e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorbalance(f);
                     }
                  } else {
                     callback.receiveErrorbalance(f);
                  }
               } else {
                  callback.receiveErrorbalance(f);
               }
            } else {
               callback.receiveErrorbalance(error);
            }
         }

         public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                  .getInboundFaultFromMessageContext(faultContext);
            onError(fault);
         }

         public void onComplete() {
            try {
               _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
               callback.receiveErrorbalance(axisFault);
            }
         }
      });

      org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

      if ((_operations[1].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
         _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
         _operations[1].setMessageReceiver(_callbackReceiver);
      }

      // execute the operation client
      _operationClient.execute(false);
   }

   /**
    * Auto generated method signature <summary>Get all open games/unfinished
    * games for specified external id</summary>
    * 
    * @see com.playngo.v1.CasinoGameService#getUnfinishedGames
    * @param getUnfinishedGames10
    * @throws CasinoGameService_GetUnfinishedGames_ServiceFaultFault_FaultMessage
    *            :
    * @throws CasinoGameService_GetUnfinishedGames_ValidationFaultFault_FaultMessage
    *            :
    */
   public GetUnfinishedGamesResponse getUnfinishedGames(GetUnfinishedGames getUnfinishedGames10)
         throws java.rmi.RemoteException, CasinoGameService_GetUnfinishedGames_ServiceFaultFault_FaultMessage,
         CasinoGameService_GetUnfinishedGames_ValidationFaultFault_FaultMessage {
      org.apache.axis2.context.MessageContext _messageContext = null;

      try {
         org.apache.axis2.client.OperationClient _operationClient = _serviceClient
               .createClient(_operations[5].getName());
         _operationClient.getOptions().setAction("http://playngo.com/v1/CasinoGameTPService/GetUnfinishedGames");
         _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

         addPropertyToOperationClient(_operationClient,
               org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

         // create a message context
         _messageContext = new org.apache.axis2.context.MessageContext();

         // create SOAP envelope with that payload
         org.apache.axiom.soap.SOAPEnvelope env = null;

         env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getUnfinishedGames10,
               optimizeContent(new javax.xml.namespace.QName("http://playngo.com/v1", "getUnfinishedGames")),
               new javax.xml.namespace.QName("http://playngo.com/v1", "GetUnfinishedGames"));

         // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
         // set the message context with that soap envelope
         _messageContext.setEnvelope(env);

         // add the message contxt to the operation client
         _operationClient.addMessageContext(_messageContext);

         // execute the operation client
         _operationClient.execute(true);

         org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
               .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
         org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

         java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetUnfinishedGamesResponse.class);

         return (GetUnfinishedGamesResponse) object;
      } catch (org.apache.axis2.AxisFault f) {
         org.apache.axiom.om.OMElement faultElt = f.getDetail();

         if (faultElt != null) {
            if (faultExceptionNameMap
                  .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetUnfinishedGames"))) {
               // make the fault by reflection
               try {
                  java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetUnfinishedGames"));
                  java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                  java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                  java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                  // message class
                  java.lang.String messageClassName = (java.lang.String) faultMessageMap
                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetUnfinishedGames"));
                  java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                  java.lang.Object messageObject = fromOM(faultElt, messageClass);
                  java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                        new java.lang.Class[] { messageClass });
                  m.invoke(ex, new java.lang.Object[] { messageObject });

                  if (ex instanceof CasinoGameService_GetUnfinishedGames_ServiceFaultFault_FaultMessage) {
                     throw (CasinoGameService_GetUnfinishedGames_ServiceFaultFault_FaultMessage) ex;
                  }

                  if (ex instanceof CasinoGameService_GetUnfinishedGames_ValidationFaultFault_FaultMessage) {
                     throw (CasinoGameService_GetUnfinishedGames_ValidationFaultFault_FaultMessage) ex;
                  }

                  throw new java.rmi.RemoteException(ex.getMessage(), ex);
               } catch (java.lang.ClassCastException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.ClassNotFoundException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.NoSuchMethodException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.reflect.InvocationTargetException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.IllegalAccessException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.InstantiationException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               }
            } else {
               throw f;
            }
         } else {
            throw f;
         }
      } finally {
         if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
         }
      }
   }

   /**
    * Auto generated method signature for Asynchronous Invocations <summary>Get
    * all open games/unfinished games for specified external id</summary>
    * 
    * @see com.playngo.v1.CasinoGameService#startgetUnfinishedGames
    * @param getUnfinishedGames10
    */
   public void startgetUnfinishedGames(GetUnfinishedGames getUnfinishedGames10,
         final CasinoGameServiceCallbackHandler callback) throws java.rmi.RemoteException {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
      _operationClient.getOptions().setAction("http://playngo.com/v1/CasinoGameTPService/GetUnfinishedGames");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

      // Style is Doc.
      env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getUnfinishedGames10,
            optimizeContent(new javax.xml.namespace.QName("http://playngo.com/v1", "getUnfinishedGames")),
            new javax.xml.namespace.QName("http://playngo.com/v1", "GetUnfinishedGames"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // create message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message context to the operation client
      _operationClient.addMessageContext(_messageContext);

      _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
         public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
               org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

               java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                     GetUnfinishedGamesResponse.class);
               callback.receiveResultgetUnfinishedGames((GetUnfinishedGamesResponse) object);
            } catch (org.apache.axis2.AxisFault e) {
               callback.receiveErrorgetUnfinishedGames(e);
            }
         }

         public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
               org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
               org.apache.axiom.om.OMElement faultElt = f.getDetail();

               if (faultElt != null) {
                  if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetUnfinishedGames"))) {
                     // make the fault by reflection
                     try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                              .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetUnfinishedGames"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                              .getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                              .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetUnfinishedGames"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                              new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof CasinoGameService_GetUnfinishedGames_ServiceFaultFault_FaultMessage) {
                           callback.receiveErrorgetUnfinishedGames(
                                 (CasinoGameService_GetUnfinishedGames_ServiceFaultFault_FaultMessage) ex);

                           return;
                        }

                        if (ex instanceof CasinoGameService_GetUnfinishedGames_ValidationFaultFault_FaultMessage) {
                           callback.receiveErrorgetUnfinishedGames(
                                 (CasinoGameService_GetUnfinishedGames_ValidationFaultFault_FaultMessage) ex);

                           return;
                        }

                        callback.receiveErrorgetUnfinishedGames(new java.rmi.RemoteException(ex.getMessage(), ex));
                     } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetUnfinishedGames(f);
                     } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetUnfinishedGames(f);
                     } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetUnfinishedGames(f);
                     } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetUnfinishedGames(f);
                     } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetUnfinishedGames(f);
                     } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetUnfinishedGames(f);
                     } catch (org.apache.axis2.AxisFault e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetUnfinishedGames(f);
                     }
                  } else {
                     callback.receiveErrorgetUnfinishedGames(f);
                  }
               } else {
                  callback.receiveErrorgetUnfinishedGames(f);
               }
            } else {
               callback.receiveErrorgetUnfinishedGames(error);
            }
         }

         public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                  .getInboundFaultFromMessageContext(faultContext);
            onError(fault);
         }

         public void onComplete() {
            try {
               _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
               callback.receiveErrorgetUnfinishedGames(axisFault);
            }
         }
      });

      org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

      if ((_operations[5].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
         _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
         _operations[5].setMessageReceiver(_callbackReceiver);
      }

      // execute the operation client
      _operationClient.execute(false);
   }

   /**
    * Auto generated method signature <summary>Transfer of funds to the user's
    * account</summary>
    * 
    * @see com.playngo.v1.CasinoGameService#credit
    * @param credit16
    * @throws CasinoGameService_Credit_ServiceFaultFault_FaultMessage
    *            :
    * @throws CasinoGameService_Credit_ValidationFaultFault_FaultMessage
    *            :
    */
   public CreditResponse credit(Credit credit16)
         throws java.rmi.RemoteException, CasinoGameService_Credit_ServiceFaultFault_FaultMessage,
         CasinoGameService_Credit_ValidationFaultFault_FaultMessage {
      org.apache.axis2.context.MessageContext _messageContext = null;

      try {
         org.apache.axis2.client.OperationClient _operationClient = _serviceClient
               .createClient(_operations[8].getName());
         _operationClient.getOptions().setAction("http://playngo.com/v1/CasinoGameService/Credit");
         _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

         addPropertyToOperationClient(_operationClient,
               org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

         // create a message context
         _messageContext = new org.apache.axis2.context.MessageContext();

         // create SOAP envelope with that payload
         org.apache.axiom.soap.SOAPEnvelope env = null;

         env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), credit16,
               optimizeContent(new javax.xml.namespace.QName("http://playngo.com/v1", "credit")),
               new javax.xml.namespace.QName("http://playngo.com/v1", "Credit"));

         // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
         // set the message context with that soap envelope
         _messageContext.setEnvelope(env);

         // add the message contxt to the operation client
         _operationClient.addMessageContext(_messageContext);

         // execute the operation client
         _operationClient.execute(true);

         org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
               .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
         org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

         java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), CreditResponse.class);

         return (CreditResponse) object;
      } catch (org.apache.axis2.AxisFault f) {
         org.apache.axiom.om.OMElement faultElt = f.getDetail();

         if (faultElt != null) {
            if (faultExceptionNameMap
                  .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Credit"))) {
               // make the fault by reflection
               try {
                  java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Credit"));
                  java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                  java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                  java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                  // message class
                  java.lang.String messageClassName = (java.lang.String) faultMessageMap
                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Credit"));
                  java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                  java.lang.Object messageObject = fromOM(faultElt, messageClass);
                  java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                        new java.lang.Class[] { messageClass });
                  m.invoke(ex, new java.lang.Object[] { messageObject });

                  if (ex instanceof CasinoGameService_Credit_ServiceFaultFault_FaultMessage) {
                     throw (CasinoGameService_Credit_ServiceFaultFault_FaultMessage) ex;
                  }

                  if (ex instanceof CasinoGameService_Credit_ValidationFaultFault_FaultMessage) {
                     throw (CasinoGameService_Credit_ValidationFaultFault_FaultMessage) ex;
                  }

                  throw new java.rmi.RemoteException(ex.getMessage(), ex);
               } catch (java.lang.ClassCastException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.ClassNotFoundException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.NoSuchMethodException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.reflect.InvocationTargetException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.IllegalAccessException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.InstantiationException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               }
            } else {
               throw f;
            }
         } else {
            throw f;
         }
      } finally {
         if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
         }
      }
   }

   /**
    * Auto generated method signature for Asynchronous Invocations
    * <summary>Transfer of funds to the user's account</summary>
    * 
    * @see com.playngo.v1.CasinoGameService#startcredit
    * @param credit16
    */
   public void startcredit(Credit credit16, final CasinoGameServiceCallbackHandler callback)
         throws java.rmi.RemoteException {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
      _operationClient.getOptions().setAction("http://playngo.com/v1/CasinoGameService/Credit");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

      // Style is Doc.
      env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), credit16,
            optimizeContent(new javax.xml.namespace.QName("http://playngo.com/v1", "credit")),
            new javax.xml.namespace.QName("http://playngo.com/v1", "Credit"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // create message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message context to the operation client
      _operationClient.addMessageContext(_messageContext);

      _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
         public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
               org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

               java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), CreditResponse.class);
               callback.receiveResultcredit((CreditResponse) object);
            } catch (org.apache.axis2.AxisFault e) {
               callback.receiveErrorcredit(e);
            }
         }

         public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
               org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
               org.apache.axiom.om.OMElement faultElt = f.getDetail();

               if (faultElt != null) {
                  if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Credit"))) {
                     // make the fault by reflection
                     try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                              .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Credit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                              .getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                              .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Credit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                              new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof CasinoGameService_Credit_ServiceFaultFault_FaultMessage) {
                           callback.receiveErrorcredit((CasinoGameService_Credit_ServiceFaultFault_FaultMessage) ex);

                           return;
                        }

                        if (ex instanceof CasinoGameService_Credit_ValidationFaultFault_FaultMessage) {
                           callback.receiveErrorcredit((CasinoGameService_Credit_ValidationFaultFault_FaultMessage) ex);

                           return;
                        }

                        callback.receiveErrorcredit(new java.rmi.RemoteException(ex.getMessage(), ex));
                     } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorcredit(f);
                     } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorcredit(f);
                     } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorcredit(f);
                     } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorcredit(f);
                     } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorcredit(f);
                     } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorcredit(f);
                     } catch (org.apache.axis2.AxisFault e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorcredit(f);
                     }
                  } else {
                     callback.receiveErrorcredit(f);
                  }
               } else {
                  callback.receiveErrorcredit(f);
               }
            } else {
               callback.receiveErrorcredit(error);
            }
         }

         public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                  .getInboundFaultFromMessageContext(faultContext);
            onError(fault);
         }

         public void onComplete() {
            try {
               _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
               callback.receiveErrorcredit(axisFault);
            }
         }
      });

      org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

      if ((_operations[8].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
         _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
         _operations[8].setMessageReceiver(_callbackReceiver);
      }

      // execute the operation client
      _operationClient.execute(false);
   }

   /**
    * Auto generated method signature <summary>Returns a session ticket user for
    * launching a game</summary>
    * 
    * @see com.playngo.v1.CasinoGameService#getTicket
    * @param getTicket18
    * @throws CasinoGameService_GetTicket_ServiceFaultFault_FaultMessage
    *            :
    */
   public GetTicketResponse getTicket(GetTicket getTicket18)
         throws java.rmi.RemoteException, CasinoGameService_GetTicket_ServiceFaultFault_FaultMessage {
      org.apache.axis2.context.MessageContext _messageContext = null;

      try {
         org.apache.axis2.client.OperationClient _operationClient = _serviceClient
               .createClient(_operations[9].getName());
         _operationClient.getOptions().setAction("http://playngo.com/v1/CasinoGameService/GetTicket");
         _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

         addPropertyToOperationClient(_operationClient,
               org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

         // create a message context
         _messageContext = new org.apache.axis2.context.MessageContext();

         // create SOAP envelope with that payload
         org.apache.axiom.soap.SOAPEnvelope env = null;

         env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getTicket18,
               optimizeContent(new javax.xml.namespace.QName("http://playngo.com/v1", "getTicket")),
               new javax.xml.namespace.QName("http://playngo.com/v1", "GetTicket"));

         // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
         // set the message context with that soap envelope
         _messageContext.setEnvelope(env);

         // add the message contxt to the operation client
         _operationClient.addMessageContext(_messageContext);

         // execute the operation client
         _operationClient.execute(true);

         org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
               .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
         org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

         java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), GetTicketResponse.class);

         return (GetTicketResponse) object;
      } catch (org.apache.axis2.AxisFault f) {
         org.apache.axiom.om.OMElement faultElt = f.getDetail();

         if (faultElt != null) {
            if (faultExceptionNameMap
                  .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetTicket"))) {
               // make the fault by reflection
               try {
                  java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetTicket"));
                  java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                  java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                  java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                  // message class
                  java.lang.String messageClassName = (java.lang.String) faultMessageMap
                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetTicket"));
                  java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                  java.lang.Object messageObject = fromOM(faultElt, messageClass);
                  java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                        new java.lang.Class[] { messageClass });
                  m.invoke(ex, new java.lang.Object[] { messageObject });

                  if (ex instanceof CasinoGameService_GetTicket_ServiceFaultFault_FaultMessage) {
                     throw (CasinoGameService_GetTicket_ServiceFaultFault_FaultMessage) ex;
                  }

                  throw new java.rmi.RemoteException(ex.getMessage(), ex);
               } catch (java.lang.ClassCastException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.ClassNotFoundException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.NoSuchMethodException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.reflect.InvocationTargetException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.IllegalAccessException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.InstantiationException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               }
            } else {
               throw f;
            }
         } else {
            throw f;
         }
      } finally {
         if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
         }
      }
   }

   /**
    * Auto generated method signature for Asynchronous Invocations
    * <summary>Returns a session ticket user for launching a game</summary>
    * 
    * @see com.playngo.v1.CasinoGameService#startgetTicket
    * @param getTicket18
    */
   public void startgetTicket(GetTicket getTicket18, final CasinoGameServiceCallbackHandler callback)
         throws java.rmi.RemoteException {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
      _operationClient.getOptions().setAction("http://playngo.com/v1/CasinoGameService/GetTicket");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

      // Style is Doc.
      env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), getTicket18,
            optimizeContent(new javax.xml.namespace.QName("http://playngo.com/v1", "getTicket")),
            new javax.xml.namespace.QName("http://playngo.com/v1", "GetTicket"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // create message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message context to the operation client
      _operationClient.addMessageContext(_messageContext);

      _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
         public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
               org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

               java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), GetTicketResponse.class);
               callback.receiveResultgetTicket((GetTicketResponse) object);
            } catch (org.apache.axis2.AxisFault e) {
               callback.receiveErrorgetTicket(e);
            }
         }

         public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
               org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
               org.apache.axiom.om.OMElement faultElt = f.getDetail();

               if (faultElt != null) {
                  if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetTicket"))) {
                     // make the fault by reflection
                     try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                              .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetTicket"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                              .getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                              .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetTicket"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                              new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof CasinoGameService_GetTicket_ServiceFaultFault_FaultMessage) {
                           callback.receiveErrorgetTicket(
                                 (CasinoGameService_GetTicket_ServiceFaultFault_FaultMessage) ex);

                           return;
                        }

                        callback.receiveErrorgetTicket(new java.rmi.RemoteException(ex.getMessage(), ex));
                     } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetTicket(f);
                     } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetTicket(f);
                     } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetTicket(f);
                     } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetTicket(f);
                     } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetTicket(f);
                     } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetTicket(f);
                     } catch (org.apache.axis2.AxisFault e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorgetTicket(f);
                     }
                  } else {
                     callback.receiveErrorgetTicket(f);
                  }
               } else {
                  callback.receiveErrorgetTicket(f);
               }
            } else {
               callback.receiveErrorgetTicket(error);
            }
         }

         public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                  .getInboundFaultFromMessageContext(faultContext);
            onError(fault);
         }

         public void onComplete() {
            try {
               _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
               callback.receiveErrorgetTicket(axisFault);
            }
         }
      });

      org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

      if ((_operations[9].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
         _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
         _operations[9].setMessageReceiver(_callbackReceiver);
      }

      // execute the operation client
      _operationClient.execute(false);
   }

   /**
    * Auto generated method signature <summary>Register a new user
    * account</summary>
    * 
    * @see com.playngo.v1.CasinoGameService#registerUser
    * @param registerUser22
    * @throws CasinoGameService_RegisterUser_ServiceFaultFault_FaultMessage
    *            :
    */
   public RegisterUserResponse registerUser(RegisterUser registerUser22)
         throws java.rmi.RemoteException, CasinoGameService_RegisterUser_ServiceFaultFault_FaultMessage {
      org.apache.axis2.context.MessageContext _messageContext = null;

      try {
         org.apache.axis2.client.OperationClient _operationClient = _serviceClient
               .createClient(_operations[11].getName());
         _operationClient.getOptions().setAction("http://playngo.com/v1/CasinoGameService/RegisterUser");
         _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

         addPropertyToOperationClient(_operationClient,
               org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

         // create a message context
         _messageContext = new org.apache.axis2.context.MessageContext();

         // create SOAP envelope with that payload
         org.apache.axiom.soap.SOAPEnvelope env = null;

         env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), registerUser22,
               optimizeContent(new javax.xml.namespace.QName("http://playngo.com/v1", "registerUser")),
               new javax.xml.namespace.QName("http://playngo.com/v1", "RegisterUser"));

         // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
         // set the message context with that soap envelope
         _messageContext.setEnvelope(env);

         // add the message contxt to the operation client
         _operationClient.addMessageContext(_messageContext);

         // execute the operation client
         _operationClient.execute(true);

         org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
               .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
         org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

         java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), RegisterUserResponse.class);

         return (RegisterUserResponse) object;
      } catch (org.apache.axis2.AxisFault f) {
         org.apache.axiom.om.OMElement faultElt = f.getDetail();

         if (faultElt != null) {
            if (faultExceptionNameMap
                  .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegisterUser"))) {
               // make the fault by reflection
               try {
                  java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegisterUser"));
                  java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                  java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                  java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                  // message class
                  java.lang.String messageClassName = (java.lang.String) faultMessageMap
                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegisterUser"));
                  java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                  java.lang.Object messageObject = fromOM(faultElt, messageClass);
                  java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                        new java.lang.Class[] { messageClass });
                  m.invoke(ex, new java.lang.Object[] { messageObject });

                  if (ex instanceof CasinoGameService_RegisterUser_ServiceFaultFault_FaultMessage) {
                     throw (CasinoGameService_RegisterUser_ServiceFaultFault_FaultMessage) ex;
                  }

                  throw new java.rmi.RemoteException(ex.getMessage(), ex);
               } catch (java.lang.ClassCastException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.ClassNotFoundException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.NoSuchMethodException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.reflect.InvocationTargetException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.IllegalAccessException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.InstantiationException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               }
            } else {
               throw f;
            }
         } else {
            throw f;
         }
      } finally {
         if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
         }
      }
   }

   /**
    * Auto generated method signature for Asynchronous Invocations
    * <summary>Register a new user account</summary>
    * 
    * @see com.playngo.v1.CasinoGameService#startregisterUser
    * @param registerUser22
    */
   public void startregisterUser(RegisterUser registerUser22, final CasinoGameServiceCallbackHandler callback)
         throws java.rmi.RemoteException {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
      _operationClient.getOptions().setAction("http://playngo.com/v1/CasinoGameService/RegisterUser");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

      // Style is Doc.
      env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), registerUser22,
            optimizeContent(new javax.xml.namespace.QName("http://playngo.com/v1", "registerUser")),
            new javax.xml.namespace.QName("http://playngo.com/v1", "RegisterUser"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // create message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message context to the operation client
      _operationClient.addMessageContext(_messageContext);

      _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
         public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
               org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

               java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), RegisterUserResponse.class);
               callback.receiveResultregisterUser((RegisterUserResponse) object);
            } catch (org.apache.axis2.AxisFault e) {
               callback.receiveErrorregisterUser(e);
            }
         }

         public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
               org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
               org.apache.axiom.om.OMElement faultElt = f.getDetail();

               if (faultElt != null) {
                  if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegisterUser"))) {
                     // make the fault by reflection
                     try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                              .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegisterUser"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                              .getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                              .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RegisterUser"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                              new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof CasinoGameService_RegisterUser_ServiceFaultFault_FaultMessage) {
                           callback.receiveErrorregisterUser(
                                 (CasinoGameService_RegisterUser_ServiceFaultFault_FaultMessage) ex);

                           return;
                        }

                        callback.receiveErrorregisterUser(new java.rmi.RemoteException(ex.getMessage(), ex));
                     } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorregisterUser(f);
                     } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorregisterUser(f);
                     } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorregisterUser(f);
                     } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorregisterUser(f);
                     } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorregisterUser(f);
                     } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorregisterUser(f);
                     } catch (org.apache.axis2.AxisFault e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrorregisterUser(f);
                     }
                  } else {
                     callback.receiveErrorregisterUser(f);
                  }
               } else {
                  callback.receiveErrorregisterUser(f);
               }
            } else {
               callback.receiveErrorregisterUser(error);
            }
         }

         public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                  .getInboundFaultFromMessageContext(faultContext);
            onError(fault);
         }

         public void onComplete() {
            try {
               _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
               callback.receiveErrorregisterUser(axisFault);
            }
         }
      });

      org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

      if ((_operations[11].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
         _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
         _operations[11].setMessageReceiver(_callbackReceiver);
      }

      // execute the operation client
      _operationClient.execute(false);
   }

   /**
    * Auto generated method signature <summary>Transfer of funds from the user's
    * account</summary>
    * 
    * @see com.playngo.v1.CasinoGameService#debit
    * @param debit24
    * @throws CasinoGameService_Debit_ServiceFaultFault_FaultMessage
    *            :
    * @throws CasinoGameService_Debit_ValidationFaultFault_FaultMessage
    *            :
    */
   public DebitResponse debit(Debit debit24)
         throws java.rmi.RemoteException, CasinoGameService_Debit_ServiceFaultFault_FaultMessage,
         CasinoGameService_Debit_ValidationFaultFault_FaultMessage {
      org.apache.axis2.context.MessageContext _messageContext = null;

      try {
         org.apache.axis2.client.OperationClient _operationClient = _serviceClient
               .createClient(_operations[12].getName());
         _operationClient.getOptions().setAction("http://playngo.com/v1/CasinoGameService/Debit");
         _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

         addPropertyToOperationClient(_operationClient,
               org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

         // create a message context
         _messageContext = new org.apache.axis2.context.MessageContext();

         // create SOAP envelope with that payload
         org.apache.axiom.soap.SOAPEnvelope env = null;

         env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), debit24,
               optimizeContent(new javax.xml.namespace.QName("http://playngo.com/v1", "debit")),
               new javax.xml.namespace.QName("http://playngo.com/v1", "Debit"));

         // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
         // set the message context with that soap envelope
         _messageContext.setEnvelope(env);

         // add the message contxt to the operation client
         _operationClient.addMessageContext(_messageContext);

         // execute the operation client
         _operationClient.execute(true);

         org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
               .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
         org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

         java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(), DebitResponse.class);

         return (DebitResponse) object;
      } catch (org.apache.axis2.AxisFault f) {
         org.apache.axiom.om.OMElement faultElt = f.getDetail();

         if (faultElt != null) {
            if (faultExceptionNameMap
                  .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Debit"))) {
               // make the fault by reflection
               try {
                  java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Debit"));
                  java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                  java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                  java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                  // message class
                  java.lang.String messageClassName = (java.lang.String) faultMessageMap
                        .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Debit"));
                  java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                  java.lang.Object messageObject = fromOM(faultElt, messageClass);
                  java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                        new java.lang.Class[] { messageClass });
                  m.invoke(ex, new java.lang.Object[] { messageObject });

                  if (ex instanceof CasinoGameService_Debit_ServiceFaultFault_FaultMessage) {
                     throw (CasinoGameService_Debit_ServiceFaultFault_FaultMessage) ex;
                  }

                  if (ex instanceof CasinoGameService_Debit_ValidationFaultFault_FaultMessage) {
                     throw (CasinoGameService_Debit_ValidationFaultFault_FaultMessage) ex;
                  }

                  throw new java.rmi.RemoteException(ex.getMessage(), ex);
               } catch (java.lang.ClassCastException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.ClassNotFoundException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.NoSuchMethodException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.reflect.InvocationTargetException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.IllegalAccessException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               } catch (java.lang.InstantiationException e) {
                  // we cannot intantiate the class - throw the original Axis
                  // fault
                  throw f;
               }
            } else {
               throw f;
            }
         } else {
            throw f;
         }
      } finally {
         if (_messageContext.getTransportOut() != null) {
            _messageContext.getTransportOut().getSender().cleanup(_messageContext);
         }
      }
   }

   /**
    * Auto generated method signature for Asynchronous Invocations
    * <summary>Transfer of funds from the user's account</summary>
    * 
    * @see com.playngo.v1.CasinoGameService#startdebit
    * @param debit24
    */
   public void startdebit(Debit debit24, final CasinoGameServiceCallbackHandler callback)
         throws java.rmi.RemoteException {
      org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
      _operationClient.getOptions().setAction("http://playngo.com/v1/CasinoGameService/Debit");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(_operationClient,
            org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;
      final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

      // Style is Doc.
      env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()), debit24,
            optimizeContent(new javax.xml.namespace.QName("http://playngo.com/v1", "debit")),
            new javax.xml.namespace.QName("http://playngo.com/v1", "Debit"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // create message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message context to the operation client
      _operationClient.addMessageContext(_messageContext);

      _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
         public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
            try {
               org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

               java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(), DebitResponse.class);
               callback.receiveResultdebit((DebitResponse) object);
            } catch (org.apache.axis2.AxisFault e) {
               callback.receiveErrordebit(e);
            }
         }

         public void onError(java.lang.Exception error) {
            if (error instanceof org.apache.axis2.AxisFault) {
               org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
               org.apache.axiom.om.OMElement faultElt = f.getDetail();

               if (faultElt != null) {
                  if (faultExceptionNameMap
                        .containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Debit"))) {
                     // make the fault by reflection
                     try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
                              .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Debit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass
                              .getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        // message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap
                              .get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Debit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                              new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof CasinoGameService_Debit_ServiceFaultFault_FaultMessage) {
                           callback.receiveErrordebit((CasinoGameService_Debit_ServiceFaultFault_FaultMessage) ex);

                           return;
                        }

                        if (ex instanceof CasinoGameService_Debit_ValidationFaultFault_FaultMessage) {
                           callback.receiveErrordebit((CasinoGameService_Debit_ValidationFaultFault_FaultMessage) ex);

                           return;
                        }

                        callback.receiveErrordebit(new java.rmi.RemoteException(ex.getMessage(), ex));
                     } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrordebit(f);
                     } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrordebit(f);
                     } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrordebit(f);
                     } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrordebit(f);
                     } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrordebit(f);
                     } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrordebit(f);
                     } catch (org.apache.axis2.AxisFault e) {
                        // we cannot intantiate the class - throw the original
                        // Axis fault
                        callback.receiveErrordebit(f);
                     }
                  } else {
                     callback.receiveErrordebit(f);
                  }
               } else {
                  callback.receiveErrordebit(f);
               }
            } else {
               callback.receiveErrordebit(error);
            }
         }

         public void onFault(org.apache.axis2.context.MessageContext faultContext) {
            org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
                  .getInboundFaultFromMessageContext(faultContext);
            onError(fault);
         }

         public void onComplete() {
            try {
               _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            } catch (org.apache.axis2.AxisFault axisFault) {
               callback.receiveErrordebit(axisFault);
            }
         }
      });

      org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;

      if ((_operations[12].getMessageReceiver() == null) && _operationClient.getOptions().isUseSeparateListener()) {
         _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
         _operations[12].setMessageReceiver(_callbackReceiver);
      }

      // execute the operation client
      _operationClient.execute(false);
   }

   ////////////////////////////////////////////////////////////////////////
   private static org.apache.neethi.Policy getPolicy(java.lang.String policyString) {
      return org.apache.neethi.PolicyEngine.getPolicy(org.apache.axiom.om.OMXMLBuilderFactory
            .createOMBuilder(new java.io.StringReader(policyString)).getDocument().getXMLStreamReader(false));
   }

   private boolean optimizeContent(javax.xml.namespace.QName opName) {
      if (opNameArray == null) {
         return false;
      }

      for (int i = 0; i < opNameArray.length; i++) {
         if (opName.equals(opNameArray[i])) {
            return true;
         }
      }

      return false;
   }

   private org.apache.axiom.om.OMElement toOM(ServiceFaultE param, boolean optimizeContent)
         throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(ServiceFaultE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(ValidationFaultE param, boolean optimizeContent)
         throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(ValidationFaultE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(Balance param, boolean optimizeContent)
         throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(Balance.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(BalanceResponse param, boolean optimizeContent)
         throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(BalanceResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(GetUnfinishedGames param, boolean optimizeContent)
         throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(GetUnfinishedGames.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(GetUnfinishedGamesResponse param, boolean optimizeContent)
         throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(GetUnfinishedGamesResponse.MY_QNAME,
               org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(Credit param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(Credit.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(CreditResponse param, boolean optimizeContent)
         throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(CreditResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(GetTicket param, boolean optimizeContent)
         throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(GetTicket.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(GetTicketResponse param, boolean optimizeContent)
         throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(GetTicketResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(RegisterUser param, boolean optimizeContent)
         throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(RegisterUser.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(RegisterUserResponse param, boolean optimizeContent)
         throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(RegisterUserResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(Debit param, boolean optimizeContent) throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(Debit.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   private org.apache.axiom.om.OMElement toOM(DebitResponse param, boolean optimizeContent)
         throws org.apache.axis2.AxisFault {
      try {
         return param.getOMElement(DebitResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   /* methods to provide back word compatibility */
   private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, Balance param,
         boolean optimizeContent, javax.xml.namespace.QName elementQName) throws org.apache.axis2.AxisFault {
      try {
         org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
         emptyEnvelope.getBody().addChild(param.getOMElement(Balance.MY_QNAME, factory));

         return emptyEnvelope;
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   /* methods to provide back word compatibility */
   private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, Credit param,
         boolean optimizeContent, javax.xml.namespace.QName elementQName) throws org.apache.axis2.AxisFault {
      try {
         org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
         emptyEnvelope.getBody().addChild(param.getOMElement(Credit.MY_QNAME, factory));

         return emptyEnvelope;
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   /* methods to provide back word compatibility */
   private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, GetTicket param,
         boolean optimizeContent, javax.xml.namespace.QName elementQName) throws org.apache.axis2.AxisFault {
      try {
         org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
         emptyEnvelope.getBody().addChild(param.getOMElement(GetTicket.MY_QNAME, factory));

         return emptyEnvelope;
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   /* methods to provide back word compatibility */
   private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, RegisterUser param,
         boolean optimizeContent, javax.xml.namespace.QName elementQName) throws org.apache.axis2.AxisFault {
      try {
         org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
         emptyEnvelope.getBody().addChild(param.getOMElement(RegisterUser.MY_QNAME, factory));

         return emptyEnvelope;
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   /* methods to provide back word compatibility */
   private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, Debit param,
         boolean optimizeContent, javax.xml.namespace.QName elementQName) throws org.apache.axis2.AxisFault {
      try {
         org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
         emptyEnvelope.getBody().addChild(param.getOMElement(Debit.MY_QNAME, factory));

         return emptyEnvelope;
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }

   /* methods to provide back word compatibility */
   private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
         GetUnfinishedGames param, boolean optimizeContent, javax.xml.namespace.QName elementQName)
         throws org.apache.axis2.AxisFault {
      try {
         org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
         emptyEnvelope.getBody().addChild(param.getOMElement(GetUnfinishedGames.MY_QNAME, factory));

         return emptyEnvelope;
      } catch (org.apache.axis2.databinding.ADBException e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }
   }
   
   /* methods to provide back word compatibility */

   /**
    * get the default envelope
    */
   private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
      return factory.getDefaultEnvelope();
   }

   private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type)
         throws org.apache.axis2.AxisFault {
      try {

         if (Balance.class.equals(type)) {
            return Balance.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (BalanceResponse.class.equals(type)) {
            return BalanceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (Credit.class.equals(type)) {
            return Credit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (CreditResponse.class.equals(type)) {
            return CreditResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (Debit.class.equals(type)) {
            return Debit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (DebitResponse.class.equals(type)) {
            return DebitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (GetTicket.class.equals(type)) {
            return GetTicket.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (GetTicketResponse.class.equals(type)) {
            return GetTicketResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (GetUnfinishedGames.class.equals(type)) {
            return GetUnfinishedGames.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (GetUnfinishedGamesResponse.class.equals(type)) {
            return GetUnfinishedGamesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (RegisterUser.class.equals(type)) {
            return RegisterUser.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (RegisterUserResponse.class.equals(type)) {
            return RegisterUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (ServiceFaultE.class.equals(type)) {
            return ServiceFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }

         if (ValidationFaultE.class.equals(type)) {
            return ValidationFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
         }
      } catch (java.lang.Exception e) {
         throw org.apache.axis2.AxisFault.makeFault(e);
      }

      return null;
   }
}
