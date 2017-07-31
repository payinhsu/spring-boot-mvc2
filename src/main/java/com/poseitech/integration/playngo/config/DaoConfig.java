/** 
 * 
 * 
 * $$LastChangedBy$$
 * $$Date$$
 * $$Revision$$
 *  
 * */
package com.poseitech.integration.playngo.config;

import java.beans.PropertyVetoException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 
 * @author ${user}
 * 
 * ${tags}
 */
@Configuration
@ComponentScan({ "com.poseitech.integration.playngo.dao",  "com.poseitech.legacy.t9betnew.dao"})
public class DaoConfig {

   private static final Logger log = LoggerFactory.getLogger(DaoConfig.class);

   @Autowired
   private Environment env;

   @PostConstruct
   public void init() {
      log.debug("== Application: " + env.getProperty("spring.application.name") + ", Profiles: " + StringUtils.join(env.getActiveProfiles(), ", ") + " ==");
      log.debug("== DB URL: " + env.getProperty("spring.datasource.url"));
   }

   @Bean
   public LocalSessionFactoryBean sessionFactory() {
      LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
      sessionFactory.setDataSource(dataSource());
      sessionFactory.setPackagesToScan(new String[] { "com.poseitech.legacy.t9betnew.entity" });
      sessionFactory.setMappingLocations(new ClassPathResource("hbm/sql-query.hbm.xml"));
      return sessionFactory;
   }

   @Bean
   public DataSource dataSource() {
      ComboPooledDataSource dataSource = new ComboPooledDataSource();
      try {
         dataSource.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
         dataSource.setJdbcUrl(env.getProperty("spring.datasource.url"));
         dataSource.setUser(env.getProperty("spring.datasource.username"));
         dataSource.setPassword(env.getProperty("spring.datasource.password"));
         dataSource.setMaxPoolSize(Integer.parseInt(env.getProperty("spring.datasource.maxPoolSize")));
         dataSource.setMinPoolSize(Integer.parseInt(env.getProperty("spring.datasource.minPoolSize")));         
      } catch (PropertyVetoException e) {
         log.debug("POC", e);
      }
      return dataSource;
   }

   @Bean
   @Autowired
   public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
      HibernateTransactionManager txManager = new HibernateTransactionManager();
      txManager.setSessionFactory(sessionFactory);
      return txManager;
   }

   @Bean
   public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
      return new PersistenceExceptionTranslationPostProcessor();
   }

   @Bean
   public JdbcTemplate getJdbcTemplate() {
      return new JdbcTemplate(dataSource());
   }
}
