package com.pharma.application;

import javax.servlet.ServletContext;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class Initializer extends ContextLoaderListener
{
	 @Override
	    protected WebApplicationContext createWebApplicationContext(ServletContext sc)
	    {
	        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
	        context.register(PharmaConfiguration.class);
//	        context.scan("com.street.admin.server.handlers");
	        context.refresh();

	        return context;
	    }

	    public static void main(String[] args) throws InterruptedException
	    {
	        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
	        context.register(PharmaConfiguration.class);
	        context.refresh();

//	        AdminDao dao = context.getBean(AdminDao.class);
//	        System.out.println(dao);
	    	
	    	
	    }

}
