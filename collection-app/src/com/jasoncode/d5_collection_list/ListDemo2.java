package com.jasoncode.d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        System.out.println(list);

        /**
         * for循環
         */
        System.out.println("--------------");
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            System.out.println(ele);
        }

        /**
         * 跌代器
         */
        System.out.println("--------------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        /**
         * foreach
         */
        System.out.println("--------------");
        for (String s : list) {
            System.out.println(s);
        }

        /**
         * jdk 1.8
         */
        System.out.println("--------------");
        list.forEach( s -> {
            System.out.println(s);
        });
        System.out.println("--------------");

        list.forEach(System.out::println);

    }
}
