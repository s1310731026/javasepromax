package com.jasoncode.d4_static_singleinstance;

public class Test1 {
    public static void main(String[] args) {
        // 目標: 理解餓漢單例的設計步驟
//        SingleInstance s1 = new SingleInstance(); //因為私有化無法產生實例
        SingleInstance s1 = SingleInstance.instance;
        SingleInstance s2 = SingleInstance.instance;
        System.out.println(s1 == s2);
    }
}
