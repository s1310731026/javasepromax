package com.jasoncode.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("A",10);
        maps.put("B",100);
        maps.put("C",1000);
        maps.put("D",10000);
        System.out.println(maps);

        maps.forEach((s, i) -> System.out.println(s +"=====>"+i));
    }
}
