package com.jasoncode.d1_static;

public class Test3 {

    /**
     * 靜態成員
     */
    public static int onlineNumber = 10;
    public static void test2(){
        System.out.println("==test2==");
    }

    /**
     * 實例成員
     */
    private String name;
    public void run(){
        System.out.println("==run==");
    }
    // 2.實例方法可以訪問靜態成員，也可以訪問實例成員
    public void go(){
        System.out.println(Test3.onlineNumber);
        System.out.println(onlineNumber);
        System.out.println(this);
        test2();
    }

    // 3.靜態方法中部可以出現this關鍵字
    public static void test3(){
//        System.out.println(this); // this只能代表當前對象!! 靜態方法可以不用對象
    }

    // 靜態方法只能訪問靜態成員，不能"直接"訪問實例成員
    public static void test(){
        System.out.println(Test3.onlineNumber);
        System.out.println(onlineNumber);
        test2();
//        System.out.println(name); //不能直接訪問實例成員
//        run(); //不能直接訪問實例成員
    }
    public static void main(String[] args) {
        // 目標: 理解static 訪問相關的語法

    }
}
