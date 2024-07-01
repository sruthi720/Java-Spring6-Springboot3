package org.telusko;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop created !");
    }

    public void check() {
        System.out.println("check");
    }

    @Override
    public void compile() {
        System.out.println("compile through desktop");
    }
}
