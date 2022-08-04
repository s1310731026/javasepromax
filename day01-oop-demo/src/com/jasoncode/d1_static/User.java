package com.jasoncode.d1_static;

public class User {
    /**
     * 在線人數
     * 注意: static修飾的成員變量: 靜態成員變量，只在內存忠存在一份
     */
    public static int onlineNumber = 161;
    /**
     * 實例成員變量: 無static修飾，屬於每個對象的，必須用對象名訪問
     */
    private String name;
    private int age;

    public static void main(String[] args) {
        // 目標: 理解static修飾成成員變量的作用和訪問特點
        // 1. 類名，靜態成員變量
        System.out.println(User.onlineNumber);

        // 2. 對象名.實例成員變量
        // System.out.println(User.name); //報錯


        User u = new User();
        u.name="jason";
        u.age = 24;
        u.onlineNumber++;
        System.out.println(u.name);
        System.out.println(u.age);
        System.out.println(u.onlineNumber);
    }

}
