package com.jasoncode.d1_static;

public class Student {
    /**
     * 實例成員變量: 無static修飾，屬於對象
     */
    private String name;

    /**
     * 靜態成員方法: 有static修飾，歸屬於類，可以被共享訪問，用類名或者對象名都可以訪問
     */
    public static int getMax(int age1,int age2){
        return age1>age2 ? age1:age2;
    }

    /**
     * 實例方法: 屬於對象
     */
    public void study(){
        System.out.println(name+" i'm still learning");
    }

    public static void main(String[] args) {
        // 1. 類名，靜態成員方法
        System.out.println(Student.getMax(10,3));
        // 注意: 同一個類中，訪問靜態方法，類名可以省略不寫
        System.out.println(getMax(10,32));

        // study(); //報錯了
        // 2. 對象.實例方法
        Student s = new Student();
        s.name="jason";
        s.study();

        // 3. 對象.靜態方法 (語法可行，但不推薦)
        System.out.println(s.getMax(13,20));
    }

}
