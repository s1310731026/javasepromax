package com.jasoncode.d4_polymorphic_test;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }
    public void start(){
        System.out.println("開機了");
    }

    /**
     * 提供安裝USB設備入口
     */

    public void installUSB(USB usb){
        // 多態: usb == 可能是鼠標也可能是鍵盤
        usb.connect();
        // 獨有功能 先判斷再強轉
//        usb.dbClick();
        if (usb instanceof KeyBoard){
            KeyBoard k = (KeyBoard) usb;
            k.keyDown();
        }else {
            Mouse m = (Mouse) usb;
            m.dbclick();
        }

        usb.unconnect();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
