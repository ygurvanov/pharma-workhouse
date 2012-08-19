package com.pharma.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.PropertyResolver;

@Configuration
//@EnableTransactionManagement
@PropertySource(value = {"db.properties"})
public class PharmaConfiguration {
	
	@Autowired
    PropertyResolver env;
	
//    @Bean
//    public AdminDao adminDao() throws IOException
//    {
//        AdminDao adminDao = new AdminDaoImpl();
//
//        return adminDao;
//    }
	
//	env.getRequiredProperty("pharma.db.url", String.class)

}
