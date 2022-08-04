package com.jasoncode.d3_static_code;

import java.util.ArrayList;

public class StaticTest3 {
    /**
     * 1. 定義一個靜態的集合，這樣這個集合只加載一個 。 因為系統也只需要一副牌
     */

    public static ArrayList<String> cards = new ArrayList<>();

    /**
     * 2. 在程序真正運行main 方法前，把54張牌放進去，後續遊戲可以直接使用了。
     */
    static {
        // 3. 正式做牌，放到集合中去
        // a. 定義一個數組存儲全部點數: 類型確定了，個數確定了
        String[] sizes = {"3","4","5","6","7","8","9","J","Q","K","A","2"};
        // b. 定義一個數組的全部花色: 類型確定了，個數確定了
        String[] color= {"♠","♦","♥","♣"};
        // c. 遍歷點數
        for (int i = 0; i < sizes.length; i++) {
            // size[i]
            // d. 遍歷花色
            for (int j = 0; j < color.length; j++) {
                // color[j]
                // 一張牌
                String card = sizes[i]+color[j];
                cards.add(card);
            }
        }
        System.out.println(cards);
    }
    public static void main(String[] args) {
        // 目標: 模擬遊戲啟動前，初始化54張牌數據

    }
}
