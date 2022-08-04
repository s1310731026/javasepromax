package com.jasoncode.d5_innerclass_static;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.setName("jason");
        in.setAge(24);
        in.show();
    }
}
