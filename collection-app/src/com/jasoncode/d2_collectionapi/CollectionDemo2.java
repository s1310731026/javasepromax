package com.jasoncode.d2_collectionapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //HashSet: 添加元素是無序，不重複，無索引
        Collection<String> c = new ArrayList<>();
        //1.添加元素，添加成功返回true
        c.add("JAVA");
        c.add("HTML");
        System.out.println(c.add("HTML")); //返回true
        c.add("MySQL");
        c.add("JAVA");
        System.out.println(c);
        //2.清空集合的元素
//        c.clear();
//        System.out.println(c);
        //3.判斷集合是否為空 是空返回true，反之
        System.out.println(c.isEmpty());
        //4.獲取集合的大小
        System.out.println(c.size());
        //5.判斷集合中是否包含某個元素
        System.out.println(c.contains("JAVA")); //true
        System.out.println(c.contains("java")); //false
        //6.刪除某元素:如果有多個重複元素默認刪除前面的第一個
        System.out.println(c.remove("JAVA"));
        System.out.println(c);

        //7.把集合轉換成數組 [Java，孤獨求敗，HTML，mybatis]
        Object[] arr = c.toArray();
        System.out.println("數組"+ Arrays.toString(arr));
        System.out.println("--------拓展--------");

        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("C++1");
        c2.add("C++2");
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);
    }
}
