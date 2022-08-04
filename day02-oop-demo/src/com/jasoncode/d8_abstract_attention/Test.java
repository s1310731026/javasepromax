package com.jasoncode.d8_abstract_attention;

public class Test {
    public static void main(String[] args) {
        // 目標: 理解抽象類的特徵和注意事項
        // 1. 類有的東西，抽象類都有
        // 2. 抽象類中可以沒有抽象方法，但是有抽象方法的必須是抽象類
        // 3. 一個類繼承了抽象類，必須重寫完抽象類的全部抽象方法，否則這個類也必須定義成抽象類
        // 4. 抽象類不能創建對象
//        Animal a = new Animal(); // 報錯
        // 反證法: 假如抽象類可以創建對象
//        a.run(); // run方法連方法體都沒有 因此不能創建對象

//        Card c = new Card(); // 不能


    }

    abstract class Card{
        private String name;

        public Card(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class CuteCat extends Cat{

        @Override
        public void eat() {

        }
    }

    abstract class Cat extends Animal{

        @Override
        public void run() {

        }
    }

    abstract class Animal{
        public abstract void run();
        public abstract void eat();
    }

}
