package com.jason.d2_stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        /**---------Collection集合獲取值-------------*/
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();
        /**--------------Map集合數據流---------------------*/
        Map<String,Integer> maps = new HashMap<>();
        //鍵流
        Stream<String> keyStream = maps.keySet().stream();
        //值流
        Stream<Integer> valueStream = maps.values().stream();
        //鍵值對流(拿整體)
        Stream<Map.Entry<String,Integer>> keyAndValueStream = maps.entrySet().stream();
        /**----------------------------------------*/
    }
}
