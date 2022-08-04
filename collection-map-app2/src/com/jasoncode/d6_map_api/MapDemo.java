package com.jasoncode.d6_map_api;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("A",10);
        maps.put("B",31);
        maps.put("C",42);
        maps.put("D",10);
        System.out.println(maps);

        //2.清空集合
//        maps.clear();
//        System.out.println(maps);
        //3.判斷集合是否為空，為空返回true，反之
//        System.out.println(maps.isEmpty());
        //4.根據獲取對應值: public V get(Object key)
        Integer key = maps.get("A");
        System.out.println(key);
        //5.根據鍵刪除整個元素
        maps.remove("A");
        System.out.println(maps);
        //6.判斷是否包含某個鍵，包含返回true,反之
        System.out.println(maps.containsKey("B"));
        //7.判斷是否包含某個值
        System.out.println(maps.containsValue(42));
        //8.獲取全部鍵的集合: public Set<K> keySet()
        Set<String> keys = maps.keySet();
        System.out.println(keys);

        System.out.println("------------");
        //9.獲取全部值的集合: Collection<V> values()
        Collection<Integer> values = maps.values();
        System.out.println(values);

        //10.集合的大小
        System.out.println(maps.size()); //4

        //11.合併其他Map集合。
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Java",1);
        map1.put("Java2",12);
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("Java2",12);
        map2.put("Java3",13);
        map1.putAll(map2);
        System.out.println(map1);

    }
}
