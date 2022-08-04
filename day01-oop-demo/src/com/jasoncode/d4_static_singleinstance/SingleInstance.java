package com.jasoncode.d4_static_singleinstance;

/**
 * 使用餓漢例實現單例類
 */
public class SingleInstance {
    /**
     * 1. 必須把構造器私有化
     */
    private SingleInstance(){

    }
    /**
     * 餓漢單例是在獲取對象前，對象已經提前準備好了一個
     * 這個對象只能是一個，所以定義靜態成員變量記住
     */
    public static SingleInstance instance = new SingleInstance();

}
