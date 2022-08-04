package com.jasoncode.d1_polymorphic;

public class Dog extends Animal{
    public String name = "子類狗";
    @Override
    public void run() {
        System.out.println("狗跑得快");
    }
}
