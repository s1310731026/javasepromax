package com.jasoncode.d13_system;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("start----");
//        System.exit(0); // JVM 終止
        // 2.計算機認為時間有起源: 返回1970-1-1 00:00:00 此時此刻的毫秒值
        long time = System.currentTimeMillis();
        System.out.println(time);
        long startTime = System.currentTimeMillis();
        // 進行時間的計算: 性能分析
        for (int i = 0; i < 100000; i++) {
            System.out.println("輸出: " + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)/1000.0 + "s");

        // 做數組拷貝
        /**
         arraycopy(Object src,  int  srcPos,
         Object dest, int destPos,
         int length);
         參數一: 被拷貝的數組
         參數二: 從哪個索引位置開始拷貝
         參數三: 複製目標的數組
         參數四: 黏貼位置
         參數五: 拷貝元素的個數
         */
        int[] arr1 = {10,20,30,40,50,60,70};
        int[] arr2 = new int[6]; // [0,0,0,0,0,0] => [0,0,40,50,60,0]
        System.arraycopy(arr1,2,arr2,2,3);
        System.out.println(Arrays.toString(arr2));

        System.out.println("程序結束。。。");
    }
}
