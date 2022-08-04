package com.jasoncode.d3_final;

public class Test2 {
    /**
     * 二 : 靜態成員變量(public static final 修飾的也稱為常量)
     */
    public static final String schoolName = "NUTC";

    /**
     * 三 : 修飾實例成員變量 (幾乎不用)
     */
    private final String name = "Jason";

    public static void main(String[] args) {
        // 目標: 理解final修飾變量的作用: 總規則: 變量有且只能被賦值一次
        // 變量有幾種
        // 1. 局部變量
        // 2. 成員變量
        //      -- 實例成員變量
        //      -- 靜態成員變量
        final double rate = 3.14;
//        rate = 3.19; // 第二次賦值
        buy(0.8);
//        schoolName = ""; // 第二次賦值

        Test2 t2 = new Test2();
        System.out.println(t2.name);
//        t2.name = "";

        // 注意: final修飾引用類型的變量，其地址不能改變，但是指向的對象的內容是可以改變的
        final Teacher teacher = new Teacher("學習，授課");
        System.out.println(teacher.getHobby());
        teacher.setHobby("運動");
        System.out.println(teacher.getHobby());
    }
    public static void buy(final double z){
//        z = 0.2; 第二次賦值了
    }
}
class Teacher{
    private String hobby;

    public Teacher(String hobby){
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}