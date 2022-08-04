package com.jasoncode.d9_api_object;

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student("jason",'男',24);
//        String rs = s.toString();
//        System.out.println(rs);  //會輸出地址
        System.out.println(s.toString());
        // 直接輸出對象變量，默認可以省略toString
        System.out.println(s);



    }
}
