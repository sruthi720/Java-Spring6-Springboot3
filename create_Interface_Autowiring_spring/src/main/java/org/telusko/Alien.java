package org.telusko;

public class Alien {
    private int age;
    private  int salary;
    private Computer com;

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
        System.out.println(age);
        com.compile();
    }


}
