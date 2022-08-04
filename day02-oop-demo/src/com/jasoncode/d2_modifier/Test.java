package com.jasoncode.d2_modifier;

public class Test {
    public static void main(String[] args) {
        // 目標: 講解權限修飾符的修飾範圍。明白每一種修飾後的作用範圍
        Fu f = new Fu();
//        f.privateMethod(); // 報錯，私有的
        f.Method();
        f.protectedMethod();
        f.publicMethod();

    }
}
