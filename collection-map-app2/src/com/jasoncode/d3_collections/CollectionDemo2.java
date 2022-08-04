package com.jasoncode.d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("紅富士","紅色",9.9,500));
        apples.add(new Apple("綠蘋果","綠色",19.9,300));
        apples.add(new Apple("綠蘋果","青色",29.9,200));
        apples.add(new Apple("黃蘋果","黃色",9.9,500));
        Collections.sort(apples);
        System.out.println(apples);

        // 方式二:
//        Collections.sort(apples, new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return Double.compare(o1.getPrice(),o2.getPrice());
//            }
//        });
        Collections.sort(apples, (o1,  o2) -> Double.compare(o1.getPrice(),o2.getPrice()) );
        System.out.println(apples);
    }
}
