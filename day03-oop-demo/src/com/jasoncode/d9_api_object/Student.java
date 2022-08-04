package com.jasoncode.d9_api_object;

import java.util.Objects;

public class Student {
    private String name;
    private char sex;
    private int age;

    public Student() {
    }

    public Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    /**
     * 自己重寫equals,自己定制相等規則
     * 兩個對象的內容一樣就認為是相等的
     * s1 比較者: s1 ==this
     * s2 被比較者: s2 == > o
     */
//    @Override
//    public boolean equals(Object o){
//        // 判斷o 是不是學生類型
//        if (o instanceof Student){
//            // 2. 判斷兩個內容是否一樣
////            if (this.name.equals(((Student) o).name) && this.age == ((Student) o).age
////                    && this.sex == ((Student) o).sex){
////                return true;
////            }
//            Student s2 = (Student) o;
//            return this.name.equals(s2.name) && this.age == (s2.age
//                    && this.sex == (s2.sex;
//        }else {
//            // 學生只能和學生比較，否則結果一定是false
//            return false;
//        }
//
//    }

    @Override
    public boolean equals(Object o) {
        // 1. 判斷是否和同一個對象比較
        if (this == o) return true;
        // 2. 如果o是null返回false  如果o 不是學生類型返回false
        if (o == null || getClass() != o.getClass()) return false;
        // 3. 說明o一定是學生類型而且不為null
        Student student = (Student) o;
        return sex == student.sex && age == student.age && Objects.equals(name, student.name);
    }


}
