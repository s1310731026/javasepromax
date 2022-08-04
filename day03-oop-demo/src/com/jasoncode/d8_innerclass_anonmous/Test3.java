package com.jasoncode.d8_innerclass_anonmous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 目標: 通過GUI編成 理解匿名內部類真實使用場景
 */
public class Test3 {
    public static void main(String[] args) {
        //1.創建窗口
        JFrame win = new JFrame("登錄介面");
        JPanel panel = new JPanel();
        win.add(panel);
        //2. 創建一個按鈕對象
        JButton btn = new JButton("登錄");
        //注意: 講解匿名內部類的使用
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win,"點我一下");
//            }
//        });
        btn.addActionListener( e -> JOptionPane.showMessageDialog(win,"點我一下"));

        //3. 把按鈕對象添加到窗口上展示
        panel.add(btn);
        //4. 展示窗口
        win.setSize(300,300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);


    }
}
