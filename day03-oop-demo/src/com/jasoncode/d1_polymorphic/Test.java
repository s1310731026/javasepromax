package com.jasoncode.d1_polymorphic;

public class Test {
    public static void main(String[] args) {
        // 1. 多態的形式: 父類類型 對象名稱 = new 子類構造器
        Animal a = new Dog();
        a.run(); // 編譯看左邊，運行看右邊
        System.out.println(a.name); // 對於變量的調用: 編譯看左，運行也看左

        Animal a2 = new Turtle();
        a2.run(); // 編譯看左邊，運行看右邊
        System.out.println(a2.name);
    }
}
