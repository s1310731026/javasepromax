package com.jasoncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
        String a = "))((((())";
//        a = "()()()()(())(()())";
        Stack<String> left=new Stack<String>();
        if (a.startsWith("(")){
            System.out.println(a.toCharArray());
            ArrayList<String> arrayList = new ArrayList<>();
            int countL = 0;
            int countR = 0;
            for (int i = 0; i < a.length(); i++) {
                left.push(String.valueOf(a.charAt(i)));
                System.out.println(left);
                System.out.println(left.peek());
                if (!left.isEmpty() && left.peek().equals("(")){
                    countL++;
                }else if (!left.isEmpty() && left.peek().equals(")")){
                    countR++;
                }

                if (countL>=countR){
                    System.out.println(countL);
                    System.out.println(countR);
                }else {
                    System.out.println("NO!");
                    break;
                }
            }
            if (countL==countR && left.peek().equals(")")){
                System.out.println("Yes! Count:"+countL);
            }else {
                System.out.println("NO!");
            }
        }else {
            System.out.println("NO!");
        }
    }
}
