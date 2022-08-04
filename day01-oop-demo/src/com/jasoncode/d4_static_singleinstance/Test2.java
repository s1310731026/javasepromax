package com.jasoncode.d4_static_singleinstance;

public class Test2 {
    public static void main(String[] args) {
        // 掌握懶漢單例的設計。理解其思想
        SingleInstance2 s1 = SingleInstance2.getInstance();
        SingleInstance2 s2 = SingleInstance2.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
