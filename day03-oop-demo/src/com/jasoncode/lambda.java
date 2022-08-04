package com.jasoncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class lambda {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        System.out.println(arrayList);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList.forEach(key -> arrayList2.add("Test-"+key));
        System.out.println(arrayList2);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList.clear();
        arrayList.add("hello java");
        arrayList.add("hello intumit");
        arrayList.add("hello word");
        arrayList.forEach(key -> arrayList3.add("Test-"+key));
        System.out.println(arrayList3);


        String[] s = {"1","2","3"};
        Stream<String> words = Arrays.stream(s).flatMap(s1 -> Stream.of("TEST-"+s1));
        System.out.println(words.toList());

        String[] s2 = {"hello java","hello intumit","hello word"};
        Stream<String> words2 = Arrays.stream(s2).flatMap(s1 -> Stream.of("TEST-"+s1));
        System.out.println(words2.toList());
    }
}
