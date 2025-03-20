package org.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope ("prototype")
public class Alien {
    @Value("90")
    private int age;
    @Autowired
//    @Qualifier("laptop")//where laptop isLaptop -class, but in qualifier start will small letter
    @Qualifier("phon1")
    private Computer com;


    public Alien() {
        System.out.println("Alien Object created !");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){

        System.out.println("Coding");
        com.compile();

    }


}
