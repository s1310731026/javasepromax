package com.jasoncode.d9_abstract_template;

public abstract class Student {
    /**
     * 正式: 聲明模板方法模式
     * 加入final 防止被子類重寫
     */
    public final void write(){
        System.out.println("tittle");
        System.out.println("content");
        System.out.println(writeMain());

        System.out.println("footer");
    }

    public abstract String writeMain();
}
