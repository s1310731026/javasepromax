package com.jasoncode.d12_this;

public class Test {
    public static void main(String[] args) {
        // 目標: 理解this(...)的作用: 本類構造器中訪問本類兄弟構造器
        Student s1 = new Student("Jason");
        System.out.println(s1.getName()+" " + s1.getSchoolName());
    }
}
