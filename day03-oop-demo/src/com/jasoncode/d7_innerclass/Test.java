package com.jasoncode.d7_innerclass;

public class Test {
    public static void main(String[] args) {
        class Cat{
            private String name;

            public static int onLineNumber = 100;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        Cat c = new Cat();
        c.setName("貓");
        System.out.println(c.getName());
    }
}
