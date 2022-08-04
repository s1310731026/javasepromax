package com.jasoncode.d1_collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 目標: 明確Collection集合體系的特點
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        // 有序 可重複 有索引
        Collection list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add("Mybatis");
        list.add("Mybatis");
        list.add(23);
        list.add(23);
        list.add(false);
        list.add(false);
        System.out.println(list);

        // 無序 不重複 無索引
        Collection list1 = new HashSet();
        list1.add("Java");
        list1.add("Java");
        list1.add("Mybatis");
        list1.add("Mybatis");
        list1.add(23);
        list1.add(23);
        list1.add(false);
        list1.add(false);
        System.out.println(list1);


        System.out.println("----------------");
//        Collection<String> list2 = new ArrayList<String>();
        Collection<String> list2 = new ArrayList<>(); // jdk 1.7 後可以不寫
        list2.add("Java");
//        list2.add(2);
        list2.add("jason");

        // 集合和泛型不支持基本數據類型，只能支持引用數據類型
//        Collection<int> list3 = new ArrayList<>();
        Collection<Integer> list3 = new ArrayList<>();
        list3.add(23);
        list3.add(233);
        list3.add(2333);

        Collection<Double> list4 = new ArrayList<>();
        list4.add(23.4);
        list4.add(233.4);
        list4.add(2333.4);


    }
}
