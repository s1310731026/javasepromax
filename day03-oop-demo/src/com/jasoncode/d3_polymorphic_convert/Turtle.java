package com.jasoncode.d3_polymorphic_convert;

public class Turtle extends Animal {

    public String name = "子類烏龜";
    @Override
    public void run() {
        System.out.println("烏龜根本跑不了");
    }

    /**
     * 獨有功能
     */
    public void layEggs(){
        System.out.println("下蛋");
    }
}
