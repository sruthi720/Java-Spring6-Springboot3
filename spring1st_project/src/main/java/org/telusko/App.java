package org.telusko;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
//        obj.setAge(21);      --instead using setter injection
        System.out.println(obj.getAge());
        obj.code();
    }
}

//setter injection, ref-> attribute
//scope-1. singleton  2. prototype
//by defult object create only once, refered may times the same object -singleton scope

//spring libraries import on maven project , since its not inbuilt
//3 ways to implement application context 1.annotation based configration 2.cofigarable applicn context  3.classpathxml application context
