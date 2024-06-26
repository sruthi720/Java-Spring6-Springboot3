package org.telusko;

public class Alien {
    private int age;
    private  int salary;
    private Laptop lap;
    public Alien() {
        System.out.println("Object created !");
    }

    public Alien(int age, Laptop lap ,int salary) {
        this.age = age;
        this.lap = lap;
        this.salary =salary;
    }

    public void code(){

        System.out.println("Coding");
        lap.compile();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
