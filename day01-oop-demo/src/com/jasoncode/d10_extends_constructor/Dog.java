package com.jasoncode.d10_extends_constructor;

public class Dog extends Animal {
    public Dog(){
        super(); // 寫不寫都有，默認找父類構造器
        System.out.println("子類Dog無參數構造器被執行");
    }
    public Dog(String name){
        super(); // 寫不寫都有，默認找父類構造器
        System.out.println("子類Dog有參數構造器被執行");
    }
}
