package com.jasoncode.d5_map;

import java.util.HashMap;
import java.util.Map;

/**
 * 目標: 認識 Map體系的特點: 按照鍵無序，不重複，無索引。值不做要求
 */
public class MapDemo1 {
    public static void main(String[] args) {
        //1. 創建一個Map集合對象
        Map<String,Integer> maps = new HashMap<>(); //一行經典代碼
        maps.put("Java",1);
        maps.put("HTML",2);
        maps.put("Java",100);
        maps.put(null,null);
        System.out.println(maps);



    }
}
