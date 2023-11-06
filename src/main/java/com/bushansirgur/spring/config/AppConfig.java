package com.bushansirgur.spring.config;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.context.annotation.*;


@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value = {
		@ComponentScan("com.bushansirgur.spring.dao"),
		@ComponentScan("com.bushansirgur.spring.service")
})
public class AppConfig {
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean =  new LocalSessionFactoryBean(); 
	}
	
	
	
	

}
