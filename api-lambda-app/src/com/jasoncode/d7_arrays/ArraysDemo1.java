package com.jasoncode.d7_arrays;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //目標: 學會使用Arrays類的常用API，並理解其原理
        int[] arr = {10,2,55,23,24,100};
        System.out.println(arr);

        //1. 返回數組內容的toString(數組)
        System.out.println(Arrays.toString(arr));

        //2. 排序的API(默認自動對數組元素進行排序)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //3. 二分搜索技術(前提數組要先排序好才支持，否則出bug)
        int index = Arrays.binarySearch(arr, 55);
        System.out.println(index);
        int index2 = Arrays.binarySearch(arr, 555);
        System.out.println(index2);


    }
}
