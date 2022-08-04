package com.jasoncode.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("A",10);
        maps.put("B",100);
        maps.put("C",1000);
        maps.put("D",10000);
        System.out.println(maps);

        //1.鍵找值: 第一步: 先拿到集合的全部鍵
        Set<String> keys = maps.keySet();
        for (String key : keys) {
            int value = maps.get(key);
            System.out.println(key + "===>" + value);
        }

    }
}
