package org.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop dt = context.getBean("COM1", Desktop.class);
        dt.compile();

        Desktop dt1 = context.getBean("system", Desktop.class);
        dt1.compile();



    }
}
