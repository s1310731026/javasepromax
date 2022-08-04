package com.jasoncode.d4_constant;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ConstantDemo2 {
    private static final int UP = 1;
    private static final int DOWN = 2;
    private static final int LEFT = 3;
    private static final int RIGHT = 4;

    public static void main(String[] args) {
        // 1. 創建一個窗口對象(桌子)
        JFrame win = new JFrame();
        // 2. 創建一個面板對象(桌布)
        JPanel panel = new JPanel();
        // 3. 把桌子墊在桌上
        win.add(panel);
        // 4. 創建四個按鈕對象
        JButton btn1 = new JButton("上");
        JButton btn2 = new JButton("下");
        JButton btn3 = new JButton("左");
        JButton btn4 = new JButton("右");
        // 5. 把按鈕對象添加到桌布上去
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);

        win.setSize(300,400);
        win.setVisible(true);

        btn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(UP);
            }
        });

        btn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(DOWN);
            }
        });

        btn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(LEFT);
            }
        });

        btn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                move(RIGHT);
            }
        });
    }

    private static void move(int flag){
        switch (flag){
            case UP:
                System.out.println("往上移動");
                break;
            case DOWN:
                System.out.println("往下移動");
                break;
            case LEFT:
                System.out.println("往左移動");
                break;
            case RIGHT:
                System.out.println("往右移動");
                break;
        }
    }
}
