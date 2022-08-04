package com.jasoncode.d8_sort_binarysearch;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        //1.定義數組
        int[] arr = {5,1,3,2};

        //2.定義循環控制選擇幾輪: arr.length -1
        for (int i = 0; i < arr.length -1; i++) {
            // i=0; j= 1 2 3
            // i=1; j= 2 3
            // i=2; j= 3
            // 3. 定義內部循環，控制選擇幾次
            for (int j = i+1; j < arr.length; j++) {
                // 當前位: arr[i]
                // 如果有比當前位數據更小的，則交換
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
