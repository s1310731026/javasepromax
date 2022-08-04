package com.jasoncode.d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"A","B","C","D");
        System.out.println(names);

        //2.public static void shuffle(List<?> list) :打亂集合順序
        Collections.shuffle(names);
        System.out.println(names);

        //3.public static <T> void sort(List<T> list):將集中元素按照默認規則排序
        List<Integer> list = new ArrayList<>();
//        list.add(23);
//        list.add(24);
//        list.add(12);
//        list.add(8);
        Collections.addAll(list,23,24,12,8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
