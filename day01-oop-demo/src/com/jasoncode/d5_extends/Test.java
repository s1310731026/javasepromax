package com.jasoncode.d5_extends;

public class Test {
    public static void main(String[] args) {
        // 目標: 認識繼承這種關係，搞清楚使用繼承的好處
        Student s = new Student();
        s.run();
        s.setName("jason");
        s.setAge(24);
        s.writeInfo();

        s.queryCourse();
    }
}
