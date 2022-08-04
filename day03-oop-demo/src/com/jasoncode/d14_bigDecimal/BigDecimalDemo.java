package com.jasoncode.d14_bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        // 浮點數運算的時候直接+ * / 可能會出現數據失真(精度問題)
        System.out.println(0.09+0.01);
        System.out.println(1.0-0.32);
        System.out.println(1.015*100);
        System.out.println(1.301/100);

        System.out.println("-------------");
        double a = 0.1;
        double b = 0.2;
        double c = a+b;
        System.out.println(c);
        System.out.println("-------------");
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
//        BigDecimal c1 = a1.add(b1);//+
//        BigDecimal c1 = a1.subtract(b1);//-
//        BigDecimal c1 = a1.multiply(b1);//*
        BigDecimal c1 = a1.divide(b1);//  /
        System.out.println(c1);

        // 目的: double
        double rs = c1.doubleValue();
        System.out.println(rs);

        // 注意事項: BigDecimal是一定要精度計算的
        BigDecimal a11 = BigDecimal.valueOf(10);
        BigDecimal b11 = BigDecimal.valueOf(3.0);
        // 參數一: 除數 參數二: 保留小數位數 參數三: 捨入模式
        BigDecimal c11 = a11.divide(b11,2, RoundingMode.HALF_UP); // 3.33333
        System.out.println(c11);



    }
}
