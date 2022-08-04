package com.jasoncode.d9_genericity_method;

import java.util.Arrays;

public class GenericityDemo {
    public static void main(String[] args) {
        String[] names = {"A","B","C"};
        printArray(names);
        Integer[] ages = {10,20,30};
        printArray(ages);
        Integer[] ages2 = gerArr(ages);
        String[] names2 = gerArr(names);

    }

    public static <T> T[] gerArr(T[]arr){
        return arr;
    }



    public static<T> void printArray(T[] arr) {
        if (arr!=null){
            StringBuilder sb = new StringBuilder("[");

            /**
             * 會輸出錯誤結果
             * [A, B, C, ]
             * [10, 20, 30, ]
             */
//            for (T t: arr){
//                sb.append(t).append(", ");
//            }

            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append( i == arr.length - 1 ? "" : ", ");
            }
            sb.append("]");
            System.out.println(sb);
        }else {
            System.out.println(arr);
        }

        T e = null;
    }
}
