package com.jasoncode.d12_math;

public class MathDemo {
    public static void main(String[] args) {
        // 取絕對值
        System.out.println(Math.abs(10));//10
        System.out.println(Math.abs(-10.3));//10.3
        // 向上取整: 5
        System.out.println(Math.ceil(4.0000001)); //5.0
        System.out.println(Math.ceil(4.0)); //4.0
        // 向下取整: 4
        System.out.println(Math.floor(4.0000001)); //4.0
        System.out.println(Math.floor(4.0)); //4.0
        // 求指數次方
        System.out.println(Math.pow(2,3)); // 2^3 = 8.0
        // 四捨五入 10
        System.out.println(Math.round(4.49999)); // 4
        System.out.println(Math.round(4.5000001)); // 5

        System.out.println(Math.random()); // 0.0 - 1.0(包前不包後)

        // 拓展: 3 - 9 之間隨機數 (0-6) +3
        // (0-1)*6 +3
        System.out.println((int)(Math.random() *7) +3);




    }
}
