package com.jasoncode.d1_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        // 看看Set系列的特點: HashSet LinkedHashSet TreeSet
        // 無序 不重複 無索引
//        Set<String> set = new HashSet<>();// 一行經典代碼
        // 有序 不重複 無索引
//        Set<String> set = new LinkedHashSet<>();// 一行經典代碼
        // 排序 不重複 無索引
        Set<String> set = new TreeSet<>();// 一行經典代碼
        set.add("JAVA");
        set.add("JAVA");
        set.add("MyBatis");
        set.add("MyBatis");
        set.add("MySQL");
        set.add("MySQL");
        set.add("HTML");
        set.add("HTML");
        set.add("Springboot");
        set.add("Springboot");
        System.out.println(set);

    }
}
