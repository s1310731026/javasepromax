package com.jasoncode.d4_static_singleinstance;

/**
 * 懶漢單例
 */
public class SingleInstance2 {
    /**
     * 2. 定義一個靜態的成員變量負責存儲一個對象
     * 只加載一次，只有一份
     * 注意: 最好私有化，這樣可以避免產生bug
     */
    private static SingleInstance2 instance;

    /**
     * 3. 提供一個方法，對外返回單例對象
     */
    public static SingleInstance2 getInstance(){
        if (instance==null){
            // 第一次來拿對象 : 此時需要創建對象
            instance = new SingleInstance2();
        }
        return instance;
    }

    /**
     * 1. 私有化構造器
     */
    private SingleInstance2(){

    }


}
