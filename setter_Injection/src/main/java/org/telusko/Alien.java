package org.telusko;

public class Alien {
    private int age;
    private Laptop lap;
    public Alien() {
        System.out.println("Object created !");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){

        System.out.println("Coding");
        lap.compile();
    }
}
