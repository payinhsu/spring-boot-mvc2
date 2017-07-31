/** 
 * 
 * 
 * $$LastChangedBy: bjlin $$
 * $$Date: 2016-11-09 00:34:55 +0800 (星期三, 09 十一月 2016) $$
 * $$Revision: 541 $$
 *  
 * */
package com.poseitech.integration.playngo.config;

import javax.annotation.PostConstruct;

import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.impl.httpclient4.HttpTransportPropertiesImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.poseitech.integration.playngo.ws.client.v1.CasinoGameServiceStub;

/**
 * palyngo web service config
 * 
 * @author Kari Lin
 * 
 */
@Configuration
@ComponentScan({"com.poseitech.integration.playngo.service.imp"})
public class WebServiceConfig {

   private static final Logger log = LoggerFactory.getLogger(WebServiceConfig.class);
   
   @Value("${poseitech.integration.playngo.service-endpoint}")
   private String playnGoServiceEndPoint;
   
   @Value("${poseitech.integration.playngo.service-username}")
   private String playnGoServiceUserName;
   
   @Value("${poseitech.integration.playngo.service-password}")
   private String playnGoServicePassword;

   @PostConstruct
   public void init() {
      log.info("== load WebServiceConfig:[endpoint:{}][username:{}][password:{}]", playnGoServiceEndPoint, playnGoServiceUserName, playnGoServicePassword);
   }

   @Bean
   public CasinoGameServiceStub casinoGameServiceStub() throws Exception {
      CasinoGameServiceStub servicesStub = null;
      try {
         servicesStub = new CasinoGameServiceStub(playnGoServiceEndPoint);
         
         HttpTransportPropertiesImpl.Authenticator auth = new HttpTransportPropertiesImpl.Authenticator();
         auth.setPreemptiveAuthentication(true);
         auth.setUsername(playnGoServiceUserName);
         auth.setPassword(playnGoServicePassword);
         
         Options options = servicesStub._getServiceClient().getOptions();
         options.setProperty(HTTPConstants.AUTHENTICATE, auth);
         options.setProperty(HTTPConstants.CHUNKED, Boolean.FALSE);
         return servicesStub;         
      } catch (Exception ex) {
         log.error("Failed to create PlaynGo web service stub " + CasinoGameServiceStub.class.getName(), ex);
         throw ex;
      }
   }
}
