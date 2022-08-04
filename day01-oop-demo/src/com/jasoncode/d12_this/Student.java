package com.jasoncode.d12_this;

public class Student {
    private String name;
    private String schoolName;

    public Student(){

    }
    public Student(String name){
        // 借用本類兄弟構造器
        this(name,"NUTC");

    }

    /**
     * 如果學生不填寫學校，默認這個對象的學校是NUTC
     */
    public Student(String name, String schoolName) {
        // super(); //必須先初始化父類，再初始化自己
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
