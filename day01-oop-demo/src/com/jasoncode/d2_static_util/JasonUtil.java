package com.jasoncode.d2_static_util;

import java.util.Random;

/**
 * 工具類
 */
public final class JasonUtil {
    /**
     *  注意: 由於工具類無須創建對象，所以把其構造器私有化
     */
    private JasonUtil(){
    }

    /**
     * 靜態方法
     */
    public static String createVerifyCode(int n){
        // 開發一個驗證碼
        // 1. 定義一個變量記住驗證碼
        String code = "";
        // 2. 定義一個變量記住全部驗證碼字符
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        // 3. 定義一個循環生成幾個隨機索引，去得到幾個字符
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            // 4. 獲取隨機索引對應的字符。連接給code
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        System.out.println("驗證碼: "+ code);
        return code;
    }

}
