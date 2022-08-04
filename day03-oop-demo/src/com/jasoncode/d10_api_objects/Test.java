package com.jasoncode.d10_api_objects;

import java.util.Objects;

/**
 * 目標: 掌握objects類的常用方法:equals
 */
public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = new String("jason");
//        System.out.println(s1.equals(s2)); // 可能出現nullpointer
        System.out.println(Objects.equals(s1, s2)); // 更安全 結果也是對的!


    }
}
