package org.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien)  context.getBean("alien");
        obj.code();

        //to access salary  variable in alien object just create setter getter of its  in the alien classs, then cal, using  below code
        System.out.println(obj.getSalary());
    }
}
