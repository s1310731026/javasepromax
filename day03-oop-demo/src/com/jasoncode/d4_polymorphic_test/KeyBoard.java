package com.jasoncode.d4_polymorphic_test;

public class KeyBoard implements USB {

    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功連接了電腦");

    }

    /**
     * 獨有功能
     */
    public void keyDown(){
        System.out.println(name + "按下輸入按鈕");
    }



    @Override
    public void unconnect() {
        System.out.println(name + "成功從電腦拔出了");

    }
}
