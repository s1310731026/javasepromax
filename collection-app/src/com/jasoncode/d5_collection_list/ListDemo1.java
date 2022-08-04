package com.jasoncode.d5_collection_list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        // 1. 創建一個
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MySQL");

        list.add(2,"HTML");

        System.out.println(list);

        System.out.println(list.remove("HTML"));
        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list.set(1, "高斯林"));
        System.out.println(list);

    }
}
