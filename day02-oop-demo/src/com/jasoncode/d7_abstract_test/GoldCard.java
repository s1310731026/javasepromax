package com.jasoncode.d7_abstract_test;

public class GoldCard extends Card{

    @Override
    public void pay(double money2) {
        System.out.println("您當前的消費: " + money2);
        System.out.println("您卡片當前餘額是: " + getMoney());
        // 優惠價:
        double rs = money2 * 0.8;
        System.out.println("您實際支付" + rs);
        // 更新帳戶餘額
        setMoney(getMoney() - rs);

    }
}
