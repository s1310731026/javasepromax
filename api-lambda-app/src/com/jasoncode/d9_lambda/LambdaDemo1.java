package com.jasoncode.d9_lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 目標: 學會使用Lambda的標準式簡化匿名內部類的代碼形式
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("烏龜爬");
            }
        };
        a.run();

//        Animal a = () ->{
//            System.out.println("烏龜爬");
//        };
//        a.run();

    }

}

abstract class Animal{
    public abstract void run();
}