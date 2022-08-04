package com.jasoncode.d3_static_code;

public class StaticDemo1 {

    public static String schoolName;
    /**
     * 靜態代碼塊: 有static修飾，屬於類，與類一起優先加載一次，自動觸發執行
     */
    static{
        System.out.println("------------");
        schoolName = "NUTC";
    }

    public static void main(String[] args) {
        // 目標: 先理解靜態代碼塊
        System.out.println("-------main方法執行-------");
        System.out.println(schoolName);
    }
}
