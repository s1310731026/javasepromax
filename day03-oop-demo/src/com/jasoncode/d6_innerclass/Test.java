package com.jasoncode.d6_innerclass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.show();
        in.test();
    }
}
