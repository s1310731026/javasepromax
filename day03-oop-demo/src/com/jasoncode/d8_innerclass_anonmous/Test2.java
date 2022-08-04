package com.jasoncode.d8_innerclass_anonmous;

public class Test2 {
    public static void main(String[] args) {
//        Swimming s = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("學生游泳");
//            }
//        };
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("學生游泳2");
            }
        });
    }
    /**
     * 學生 老師 運動員可以一起參加游泳比賽
     */
    public static void go(Swimming s){
        System.out.println("開始。。。");
        s.swim();
        System.out.println("結束。。。");
    }

}

class Student implements Swimming{

    @Override
    public void swim() {
        System.out.println("學生游泳");
    }
}

interface Swimming{
    void swim();
}

