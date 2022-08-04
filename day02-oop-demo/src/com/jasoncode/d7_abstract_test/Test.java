package com.jasoncode.d7_abstract_test;

public class Test {
    public static void main(String[] args) {
        // 目標: 學習一下抽象類的基本使用: 作父類，被繼承，重寫抽象方法
        GoldCard c = new GoldCard();
        c.setMoney(10000);
        c.setUserName("jason");
        c.pay(300);
        System.out.println("剩餘: "+c.getMoney());

    }

}
