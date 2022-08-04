package com.jasoncode.d7_extends_feature;

public class Test {
    public static void main(String[] args) {
        // 目標: 理解繼承的特點
        // 1. 子類不能繼承父類的構造器
        // 2. 子類是否可以繼承父類的私有成員，我認為是可以繼承父類私有成員，只是不能直接訪問
        Tiger t = new Tiger();
        // t.eat();
        // 3. 子類是否可以繼承父類的靜態成員。 我認為不算繼承，只是共享的
        System.out.println(Tiger.location);
    }
}

class Animal{
    private void eat(){
        System.out.println("動物要吃東西");
    }

    public static String location = "動物園";

}

class Tiger extends Animal{

}