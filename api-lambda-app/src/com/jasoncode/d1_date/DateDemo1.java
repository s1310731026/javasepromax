package com.jasoncode.d1_date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        // 1. 創建一個Date類的對象: 代表系統此刻日期時間對象
        Date d = new Date();
        System.out.println(d);
        // 2. 獲取當前時間毫秒值
        long time = d.getTime();
        System.out.println(time);
//        long time1 = System.currentTimeMillis();
//        System.out.println(time1);

//        System.out.println(new Date(time));
        System.out.println("--------------------");
        // 1.得到當前時間毫秒值
        long time2 = System.currentTimeMillis();
        // 2.當前時間往後走1小時 121s
        time2 += (60*60+121) * 1000;
        // 3. 把時間毫秒值轉換成對應的日期對象
//        Date d2 = new Date(time2);
        System.out.println(new Date(time2));

    }
}
