package com.jasoncode.d4_polymorphic_test;

/**
 * 目標: USB設備模組
 * 1. 定義USB接口: 接入 拔出
 * 2. 定義2個USB的實現類: 鼠標、 鍵盤
 * 3. 創建一個電腦對象，創建USB設備對象，安裝啟動
 */
public class Test {
    public static void main(String[] args) {
        // a.創建電腦對象
        Computer c = new Computer("電腦");
        c.start();

        // b.創建鼠標對象
        USB u = new KeyBoard("鍵盤");
        c.installUSB(u);

        USB u1 = new KeyBoard("滑鼠");
        c.installUSB(u1);
//        USB u2 = new KeyBoard("鍵盤");


    }
}
