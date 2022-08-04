package com.jasoncode.d2_modifier.itcast;

import com.jasoncode.d2_modifier.Fu;

public class Test2 {
    public static void main(String[] args) {
        // 目標: 講解權限修飾符的修飾範圍。明白每一種修飾後的作用範圍
        Fu f = new Fu();
//        f.privateMethod(); // 報錯，私有的
//        f.Method(); // 報錯
//        f.protectedMethod(); // 報錯
        f.publicMethod();

    }
}
