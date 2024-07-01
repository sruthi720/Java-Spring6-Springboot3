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
        Alien alien = context.getBean(Alien.class);
//        alien.setAge(32);//use @value instead direct assign
        System.out.println( alien.getAge());
        alien.code();
        Alien alien1 = context.getBean(Alien.class);

    }
}
