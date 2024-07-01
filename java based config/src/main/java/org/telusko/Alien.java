package org.telusko;

public class Alien {
    private int age;
    private Laptop lap;
//    private Desktop desktop;
    private Phone phone;//inner class only for alien class

    public Alien() {
        System.out.println("Object created !");
    }

    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
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

//    public Desktop getDesktop() {
//        return desktop;
//    }
//
//    public void setDesktop(Desktop desktop) {
//        this.desktop = desktop;
//    }


    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void code(){

        System.out.println("Coding");
        lap.compile();
//        desktop.check();
        phone.compile();

    }


}
