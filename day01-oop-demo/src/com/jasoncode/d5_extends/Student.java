package com.jasoncode.d5_extends;

/**
 * 學生: 子類
 */
public class Student extends People{
    /**
     * 獨有行為，請填寫反饋訊息
     */
    public void writeInfo(){
        System.out.println(getName() + "寫下，學習語法");
    }
}
