package com.jasoncode.d11_extends_constructor;

public class Teacher extends People{

    public Teacher(){

    }

    public Teacher(String name, int age) {
        // 調用父類的有參數構造器: 初始化繼承自父類數據
        super(name, age);
    }
}
