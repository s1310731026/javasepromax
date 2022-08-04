package com.jasoncode.d3_final;

public class Test {
    public static void main(String[] args) {
        // 記住final語法
        // 1.final修飾類，類不能被繼承
        // 2.final修飾方法，方法不能被重寫
        // 3.final修飾變量，總規則: 變量有且僅能被賦值一次


    }
}

class Student extends People{
//    @Override
//    public void eat(){
//        System.out.println("學生吃很多");
//    }
}
class People{
    public final void eat(){
        System.out.println("人都要吃東西");
    }
}

//class Wolf extends Animal{
//    // inherit 繼承
//
//}
//final class Animal{
//
//}