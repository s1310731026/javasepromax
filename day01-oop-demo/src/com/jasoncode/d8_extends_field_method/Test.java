package com.jasoncode.d8_extends_field_method;

public class Test {
    public static void main(String[] args) {
        // 目標: 理解繼承後成員的訪問特點: 就近原則
        Dog d = new Dog();
        d.run(); //子類的
        d.lookDoor(); // 子類的
        System.out.println(d.name); // 子類的
        d.showName();

    }

}

class Animal{
    public String name="動物名";
    public void run(){
        System.out.println("動物可以跑");
    }
}

class Dog extends Animal{
    public String name ="狗名";
    public void lookDoor(){
        System.out.println("狗可以看門");
    }
    public void run(){
        System.out.println("狗跑得很快");
    }
    public void showName(){
        String name ="局部名";
        System.out.println(name);
        System.out.println(this.name); // 當前子類對象的name
        System.out.println(super.name); // 當前父類對象的name

        super.run();
    }
}