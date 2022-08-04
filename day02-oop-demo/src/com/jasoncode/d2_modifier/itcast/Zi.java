package com.jasoncode.d2_modifier.itcast;

import com.jasoncode.d2_modifier.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Fu f = new Fu();
//        f.protectedMethod();  //以父類訪問 無法呼叫
        Zi z = new Zi();
        z.protectedMethod();
    }
}
