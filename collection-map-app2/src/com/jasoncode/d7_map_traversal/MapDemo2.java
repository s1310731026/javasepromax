package com.jasoncode.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("A",10);
        maps.put("B",100);
        maps.put("C",1000);
        maps.put("D",10000);
        System.out.println(maps);

        // 把map轉成set集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "====>" + value);
        }

    }
}
