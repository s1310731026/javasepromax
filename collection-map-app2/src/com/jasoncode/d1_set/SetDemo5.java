package com.jasoncode.d1_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 觀察treeset隊值的特性 數據如何排序
 */
public class SetDemo5 {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();
        sets.add(12);
        sets.add(23);
        sets.add(8);
        sets.add(50);
        System.out.println(sets);

        // 不重複 無索引 可排序
        Set<String> sets1 = new TreeSet<>();
        sets1.add("Java");
        sets1.add("Java");
        sets1.add("About");
        sets1.add("about");
        sets1.add("Java");
        sets1.add("Python");
        sets1.add("UI");
        sets1.add("UI");
        System.out.println(sets1);

        System.out.println("----------");

        // 方式二 集合自帶比較器
//        Set<Apple> apples = new TreeSet<>(new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
////                return o1.getWeight() - o2.getWeight() >= 0 ? 1:-1;
////                return o2.getWeight() - o1.getWeight() >= 0 ? 1:-1;
//                // 注意 浮點型建議直接使用Double.compare進行比較
////                return Double.compare(o1.getPrice(),o2.getPrice());
//                return Double.compare(o2.getPrice(),o1.getPrice()); // 降序
//
//            }
//        });
        Set<Apple> apples = new TreeSet<>((o1,o2) -> {
//                return o1.getWeight() - o2.getWeight() >= 0 ? 1:-1;
//                return o2.getWeight() - o1.getWeight() >= 0 ? 1:-1;
                // 注意 浮點型建議直接使用Double.compare進行比較
//                return Double.compare(o1.getPrice(),o2.getPrice());
                return Double.compare(o2.getPrice(),o1.getPrice()) >= 0 ? 1:-1; // 降序
        });
        apples.add(new Apple("紅富士","紅色",9.9,500));
        apples.add(new Apple("綠蘋果","綠色",19.9,300));
        apples.add(new Apple("綠蘋果","青色",29.9,200));
        apples.add(new Apple("黃蘋果","黃色",9.9,500));
        System.out.println(apples);
    }
}
