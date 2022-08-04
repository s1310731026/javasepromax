package com.jasoncode.d11_extends_constructor;

public class Test {
    public static void main(String[] args) {
        // 目標: 學習子類構造器如何去訪問父類有參數構造器，還要清楚其作用
        Teacher t = new Teacher("Jason",24);
        System.out.println(t.getName() + " " + t.getAge());
    }
}
