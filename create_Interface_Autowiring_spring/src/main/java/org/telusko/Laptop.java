package org.telusko;

public class Laptop implements Computer {
//    public Laptop() {
//        System.out.println("Laptop object created");
//    }
    @Override
    public void compile(){
        System.out.println("compile laptop!");
    }
}
