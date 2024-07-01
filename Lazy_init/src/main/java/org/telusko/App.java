package org.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
java based @configuration, @Bean-- name attribute, @scope
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class);
       Desktop dt =context.getBean("system",Desktop.class);
       dt.compile();

       Desktop dt1 =context.getBean("system",Desktop.class);
       dt.compile();

    }
}
