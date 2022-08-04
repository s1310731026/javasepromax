package com.jasoncode.d9_extends_override;

public class Test {
    public static void main(String[] args) {
        // 目標: 認識方法重寫
        NewPhone n = new NewPhone();
        n.call();
        n.sendMsg();
    }
}

/**
 * 新手機: 子類
 */
class NewPhone extends Phone{
    // 重寫的方法
    @Override //1. 重寫校驗註解，加上之後，這個方法必須是正確重寫的，這樣更安全。 2.提高程序的可讀性代碼優雅
    public void call(){
        super.call();
        System.out.println("開始視訊電話~");
    }
}
class Phone{
    public void call(){
        System.out.println("打電話~");
    }
    public void sendMsg(){
        System.out.println("發短信");
    }
}
