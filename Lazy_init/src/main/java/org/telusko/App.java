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

        Alien obj = (Alien)  context.getBean("alien"); //if you want object from the container use this code
//        OR
//        Alien obj = context.getBean("alien", Alien.class);
//        OR
//        Alien obj = context.getBean(Alien.class);
        obj.code();
//        Computer com = context.getBean(Computer.class);// which one is primary, that will work else error,because of confusion
        Computer com = context.getBean(Desktop.class);

    }
}
