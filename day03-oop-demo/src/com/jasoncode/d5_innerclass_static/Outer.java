package com.jasoncode.d5_innerclass_static;

/**
 * 外部類
 */
public class Outer {
    public static int a = 100;
    private String hobby;
    /**
     * 學習靜態成員內部類
     */
    public static class Inner{
        private String name;
        private int age;
        public static String schoolName;

        public Inner() {
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void show(){
            System.out.println("名稱"+name);
            System.out.println(a);

//            System.out.println(hobby); // 報錯
//            Outer o = new Outer();
//            System.out.println(o.hobby);
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
