package com.jasoncode.d9_lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer[] ages1 = {34,12,42,23};
        // 參數一: 被排序的數組 必須是引用類型的元素
        // 參數二: 匿名內部類對象，代表了一個比較器對象
//        Arrays.sort(ages1, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });

//        Arrays.sort(ages1, (Integer o1, Integer o2) ->{
//                return o2-o1;
//        });

//        Arrays.sort(ages1, (o1, o2) ->{
//            return o2-o1;
//        });
        Arrays.sort(ages1, (o1, o2) -> o2-o1);
        System.out.println(Arrays.toString(ages1));

        System.out.println("--------------");
        JFrame win = new JFrame("登錄介面");
        JButton btn = new JButton("Big button");
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("點我點我");
//            }
//        });

//        btn.addActionListener((ActionEvent e) -> {
//            System.out.println("點我點我");
//        });

//        btn.addActionListener((e) -> {
//            System.out.println("點我點我");
//        });
        btn.addActionListener(e -> System.out.println("點我點我"));

        win.add(btn);
        win.setSize(300,300);
        win.setVisible(true);
    }
}
