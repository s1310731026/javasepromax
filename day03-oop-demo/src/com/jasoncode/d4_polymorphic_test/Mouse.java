package com.jasoncode.d4_polymorphic_test;

public class Mouse implements USB{

    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功連接了電腦");

    }

    /**
     * 獨有功能
     */
    public void dbclick(){
        System.out.println("雙擊");
    }



    @Override
    public void unconnect() {
        System.out.println(name + "成功從電腦拔出了");

    }
}
