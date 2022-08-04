package com.jasoncode.d2_polymorphic_advantage;

public class Dog extends Animal {
    public String name = "子類狗";
    @Override
    public void run() {
        System.out.println("狗跑得快");
    }

    public void lookDoor() {
        System.out.println("看門");
    }

}
