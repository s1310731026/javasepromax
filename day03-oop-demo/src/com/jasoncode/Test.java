package com.jasoncode;

public class Test {
    public static void main(String[] args) {
        double d = 1/10*100;
        System.out.println(String.format("%.2f",d));

        for (int i = 2000; i < 10000; i++) {
            if (i/50>0 && i%50==0){
                System.out.println(i);
            }
        }

    }
}
/**
 * jsp:include 包含emp.jsp 的輸出。
 * <jsp:include page="emp.jsp">
 *     <jsp:param name="a" value="666" />
 * </jsp:include>
 *
 * jsp:forward 傳送參數到emp.jsp頁面
 * <jsp:forward page="emp.jsp">
 *     <jsp:param name="a" value="666" />
 * </jsp:forward>
 */
