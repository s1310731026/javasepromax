package com.jasoncode.d1_set;

import java.util.HashSet;
import java.util.Set;

/**
 * 目標: 把set
 */
public class SetDemo3 {
    public static void main(String[] args) {
        Student s = new Student();
        // Set 集合去重複原因: 先判斷Hash值 在判斷equals
        Set<Student> sets = new HashSet<>();
        sets.add(new Student("Jason",24,'男'));
        sets.add(new Student("Jason",24,'男'));
        sets.add(new Student("Jason3",26,'男'));
        System.out.println(sets);
    }
}
