package com.jasoncode.d2_polymorphic_advantage;

public class Turtle extends Animal {

    public String name = "子類烏龜";
    @Override
    public void run() {
        System.out.println("烏龜根本跑不了");
    }
}
