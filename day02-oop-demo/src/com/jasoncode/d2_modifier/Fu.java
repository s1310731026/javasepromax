package com.jasoncode.d2_modifier;

public class Fu {
    /**
     * 1. 定義私有成員 : 只能本類中訪問
     */
    private void privateMethod(){
        System.out.println("--private--");
    }
    /**
     * 2. 定義缺省(預設)成員 : 本類中、同胞下其他類訪問(包訪問權限)
     */
    void Method(){
        System.out.println("-- 缺省(預設) --");
    }

    /**
     * 2. protected修飾的方法 : 本類中、同胞的其他類中，其他包的子類中
     */
    protected void protectedMethod(){
        System.out.println("-- protected --");
    }
    /**
     * 4.public修飾方法: 本類中、同胞的其他類中，其他包的子類中，其他包的無關類中
     */
    public void publicMethod(){
        System.out.println("-- public --");
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f.privateMethod();
        f.Method();
        f.protectedMethod();
        f.publicMethod();
    }
}
