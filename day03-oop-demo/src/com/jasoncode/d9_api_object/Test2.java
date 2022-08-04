package com.jasoncode.d9_api_object;

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("jason",'男',24);
        Student s2 = new Student("jason",'男',24);

        // 預設都是比較地址  equals 重寫後可以進行內容比較
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);


    }
}
