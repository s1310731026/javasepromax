package com.jasoncode.d7_abstract_test;

public abstract class Card {
    private String userName;
    private double money;
    /**
     * 定義一個支付方法: 表示可以支付
     * 抽象方法
     */
    public abstract void pay(double money2);

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
