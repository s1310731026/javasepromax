package com.jason.d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 初步體驗Stream流的方便與快捷
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"A","AB","AC","D");
        System.out.println(names);
//
//        //1.從集合中找出A放到新集合
//        List<String> names2 = new ArrayList<>();
//        for (String name : names) {
//            if (name.startsWith("A")){
//                names2.add(name);
//            }
//        }
//        System.out.println(names2);

        //3.使用Stream實現
        names.stream().filter(s -> s.startsWith("A")).filter(s -> s.length() == 2).forEach(s -> System.out.println(s));

    }
}
