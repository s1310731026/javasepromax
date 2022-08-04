package com.jasoncode.d3_polymorphic_convert;

public class Test {
    public static void main(String[] args) {
        // 自動類型轉換
        Animal a = new Dog();
        a.run();

        // 強制類型轉換
        Animal a2 = new Turtle();
        a2.run();

//        Dog d = (Dog) a2; //強制類型轉換: 編譯階段不會報錯 (注意: 有繼承或實現關係編譯階段可以強制，沒有毛病)，運行時可能出錯的!
        if (a2 instanceof Turtle){
            Turtle t = (Turtle) a2; //從父類類型到子類類型: 必須強制類型轉換
            t.layEggs();
        }else {
            Dog d = new Dog();
            d.lookDoor();
        }

        go(new Dog());
        go(new Turtle());
    }

    public static void go(Animal a){
        a.run();
        if (a instanceof Turtle){
            Turtle t = (Turtle) a; //從父類類型到子類類型: 必須強制類型轉換
            t.layEggs();
        }else {
            Dog d = new Dog();
            d.lookDoor();
        }
    }
}
