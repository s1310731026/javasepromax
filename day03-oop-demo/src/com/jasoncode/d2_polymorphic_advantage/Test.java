package com.jasoncode.d2_polymorphic_advantage;

public class Test {
    public static void main(String[] args) {
        Animal a = new Turtle();
        Animal a2 = new Dog();
//        a2.lookDoor(); // 多態下無法訪問子類獨有功能

        go(a);
    }

    /**
     * 要求: 所有的動物都可以進來比賽
     */
    public static void go(Animal a){
        System.out.println("開始。。。");
        a.run();
        System.out.println("結束。。。。");
    }
}
