package com.jasoncode.d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // 目標: 自訂義數組的排序規則: Comparatar 比較器對象
        // 1. Arrays的sort方法對於有值特性的數組是默認升序排序
        int[] ags = {34,12,42,23};
        Arrays.sort(ags);
        System.out.println(Arrays.toString(ags));
        // 2.需求: 降序排序!(自訂義比較器對象，只能支持引用類型的排序
        Integer[] ages1 = {34,12,42,23};
        // 參數一: 被排序的數組 必須是引用類型的元素
        // 參數二: 匿名內部類對象，代表了一個比較器對象
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                if (o1>o2){
//                    return 1;
//                }else {
//                    return -1;
//                }
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(ages1));

        System.out.println("--------------------");
        Student[] students = new Student[3];
        students[0] = new Student("jason",24,168);
        students[1] = new Student("jason2",23,174);
        students[2] = new Student("jason3",22,162);
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o2.getAge() - o1.getAge();
                return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
