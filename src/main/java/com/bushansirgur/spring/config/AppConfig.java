package com.bushansirgur.spring.config;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import static org.hibernate.cfg.Environment.*;

import java.util.Properties;


@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value = {
		@ComponentScan("com.bushansirgur.spring.dao"),
		@ComponentScan("com.bushansirgur.spring.service")
})
public class AppConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean =  new LocalSessionFactoryBean(); 
		Properties props = new Properties();
		
		props.put(DRIVER,  env.getProperty("mysql.driver"));
		props.put(URL,  env.getProperty("mysql.url"));
		props.put(USER,  env.getProperty("mysql.user"));
		props.put(PASS,  env.getProperty("mysql.password"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
