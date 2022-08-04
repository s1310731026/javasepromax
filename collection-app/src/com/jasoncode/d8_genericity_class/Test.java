package com.jasoncode.d8_genericity_class;

public class Test {
    public static void main(String[] args) {
        // 需求: 模擬ArrayList定義一個MyArrayList，關注泛型設計
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySql");
        list.remove("MySql");
        System.out.println(list);

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(1);
        list1.add(12);
        list1.add(123);
        list1.remove(12);
        System.out.println(list1);
    }
}
