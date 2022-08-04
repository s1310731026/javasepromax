package com.jasoncode.d9_lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 目標: 學會使用lambda的標準格式簡化匿名內部類的代碼格式
        // Lambda只能簡化接口中只有一個抽象方法的匿名內部類形式
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("老師游泳");
//            }
//        };
        Swimming s1 = () -> {
            System.out.println("老師游泳");
        };
        go(s1);

        System.out.println("-----------");

        go(() -> {
            System.out.println("學生游泳");
        });

    }

    public static void go(Swimming s){
        System.out.println("開始。。。");
        s.swim();
        System.out.println("結束。。。");
    }
}
@FunctionalInterface // 一但加上這個註解必須是函式接口，裡面只能有一個抽象方法
interface Swimming{
    void swim();
}
