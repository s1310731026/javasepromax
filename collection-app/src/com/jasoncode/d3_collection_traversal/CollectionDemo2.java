package com.jasoncode.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("A");
        lists.add("B");
        lists.add("C");
        lists.add("D");

        for (String ele : lists) {
            System.out.println(ele);
        }
        System.out.println("---------------");
        double[] scores = {100,99.5,59.5};
        for (double score : scores) {
            System.out.println(score);
            if (score == 59.5){
                score =100;
            }
        }
        System.out.println(Arrays.toString(scores));
    }
}
