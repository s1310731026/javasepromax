package com.jason.d2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("A1");
        list.add("A1");
        list.add("A2");
        list.add("A3");
        list.add("A3");
        list.add("B4");

        Stream<String> s1 = list.stream().filter(s->s.startsWith("A"));
        List<String> stringList = s1.collect(Collectors.toList());
        System.out.println(stringList);
        Stream<String> s2 = list.stream().filter(s->s.startsWith("A"));
        Set<String> stringSet = s2.collect(Collectors.toSet());
        System.out.println(stringSet);



    }
}
