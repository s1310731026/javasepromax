package com.jasoncode.d6_innerclass;

/**
 * 外部類
 */
public class Outer {
    public static int num = 111;
    private String hobby;
    /**
     * 成員內部類
     */
    public class Inner{
        private String name;
        private int age;
        public static int a = 100; //JDK 16開始支持靜態成員

        public void test(){
            System.out.println(a);
        }

        public void show(){
            System.out.println("名稱" + name);
            System.out.println("數字" + num);
            System.out.println("興趣" + hobby);
        }

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
