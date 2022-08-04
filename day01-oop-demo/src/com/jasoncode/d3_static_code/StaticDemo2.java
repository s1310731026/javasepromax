package com.jasoncode.d3_static_code;

public class StaticDemo2 {

    public StaticDemo2(){
        System.out.println("===無參數構造器被觸發執行===");
    }
    /**
     * 實例代碼塊: 無static修飾，屬於對象，每次構建對象時，都會觸發一次執行
     * 初始化實例資源
     */
    {
        System.out.println("===實例代碼塊被觸發執行===");
    }

    public static void main(String[] args) {
        // 目標: 理解實例代碼塊 (構造代碼塊)
        StaticDemo2 s1 = new StaticDemo2();
        StaticDemo2 s2 = new StaticDemo2();

    }

}
