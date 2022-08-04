package com.jasoncode.d2_method;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {
        sum();
        sum(10);
        sum(10,20);
        sum(new int[]{10,20,30,40,50});
    }

    /**
     * 注意: 一個型參數列表中只能有一個可變參數
     * @param nums
     */
    public static void sum(int... nums) {
        System.out.println("元素個數"+nums.length);
        System.out.println("元素內容"+ Arrays.toString(nums));
    }

}
