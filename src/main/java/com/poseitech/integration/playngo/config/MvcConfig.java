package com.poseitech.integration.playngo.config;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Spring MVC Config.
 * 
 * @author Allen Yu
 * @author B.J Lin
 * 
 * @version 2016/04/25 Allen Yu V0. Initial revision.
 * 
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.poseitech.integration.playngo.controller"})
public class MvcConfig extends WebMvcConfigurerAdapter {

   private static Logger log = LoggerFactory.getLogger(MvcConfig.class);

   @Autowired
   private Environment env;
   
   @Value("${spring.application.name}")
   private String    applicationName;
   
   @Value("${spring.profiles.active}")
   private String[]  profiles;
   
   @PostConstruct
   public void init() {
      log.debug("***** Mvc Active Profiles : " + StringUtils.join(env.getActiveProfiles()) + " *****");
   }

   @Override
   public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
      MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
      ObjectMapper mapper = new ObjectMapper();
      mapper.setSerializationInclusion(Include.NON_NULL);
      converter.setObjectMapper(mapper);
      converters.add(converter);
   }
      
   /* (non-Javadoc)
    * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configureViewResolvers(org.springframework.web.servlet.config.annotation.ViewResolverRegistry)
    */
   @Override
   public void configureViewResolvers(ViewResolverRegistry pRegistry) {
      pRegistry.jsp("/WEB-INF/views/", ".jsp");
   }   
}
