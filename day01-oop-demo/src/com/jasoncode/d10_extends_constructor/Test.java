package com.jasoncode.d10_extends_constructor;

public class Test {
    public static void main(String[] args) {
        // 目標: 認識繼承後子類構造器的特點
        // 特點: 子類的全部構造器默認會先訪問父類的無參構造器在執行自己
        Dog d1 = new Dog();
        System.out.println(d1);

        Dog d2 = new Dog("金毛");
        System.out.println(d2);
    }
}
