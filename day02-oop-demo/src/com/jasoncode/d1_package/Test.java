package com.jasoncode.d1_package;

// 導包
import com.jasoncode.d1_package.it.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 目標: 理解以下兩點
        // 1. 同一個包下的類，互相可以直接訪問
        System.out.println(User.onlineNumber);
        // 2. 不同包下的類，必須先導包才可以訪問
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);

        // 3. 如果這個類中使用不同包下的相同類名，此時默認只能導入一個類的包，另一個類要使用全名訪問
        com.jasoncode.d1_package.it2.Student s2 = new com.jasoncode.d1_package.it2.Student();

    }
}
