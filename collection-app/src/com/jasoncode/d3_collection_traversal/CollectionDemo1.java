package com.jasoncode.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("A");
        lists.add("B");
        lists.add("C");
        lists.add("D");
        System.out.println(lists);
        //[A,B,C,D]

        // 得到當前集合的跌代器對象
        Iterator<String> it= lists.iterator();
//        String ele = it.next();
//        System.out.println(ele);
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        // System.out.println(it.next()); // NoSuchElementException 出現無此元素異常錯誤

        // 2.定義while循環
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------");


    }
}
