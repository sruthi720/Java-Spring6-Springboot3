package com.telusko.app.models;

import com.telusko.app.models.Computer;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Compile laptop..");
    }

}
