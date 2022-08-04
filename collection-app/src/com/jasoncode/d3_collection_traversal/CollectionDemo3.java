package com.jasoncode.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("A");
        lists.add("B");
        lists.add("C");
        lists.add("D");
        lists.forEach(s -> System.out.println(s));
        lists.forEach(System.out::println);

    }
}
