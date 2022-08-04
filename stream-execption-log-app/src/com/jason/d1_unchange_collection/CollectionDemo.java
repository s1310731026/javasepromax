package com.jason.d1_unchange_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 不可變集合
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // 1. 不可變集合
        List<Double> lists = List.of(569.5,700.5,523.5,570.5);
//        lists.add(689.0);
//        lists.set(2,689.0);
        System.out.println(lists);


        double score = lists.get(1);
        System.out.println(score);

        // 不可變的set集合
        Set<String> names = Set.of("A","B","C");
//        names.add("C");
        System.out.println(names);

        // 不可變的Map集合
        Map<String,Integer> maps = Map.of("a1",1,"a2",2);
//        maps.put("a3",3);
        System.out.println(maps);
    }
}
