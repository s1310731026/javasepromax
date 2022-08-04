package com.jasoncode.d5_extends;

/**
 * 人類: 父類
 */
public class People {
    private String name;
    private int age;

    public void run(){
        System.out.println("人會跑~~");
    }
    /**
     * 查看課表
     */
    public void queryCourse(){
        System.out.println(name+ "正在查看課表");
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
