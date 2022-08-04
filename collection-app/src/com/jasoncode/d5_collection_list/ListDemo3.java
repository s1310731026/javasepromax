package com.jasoncode.d5_collection_list;

import java.util.LinkedList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        // LinkedList可以完成對列結構，和棧結構 (雙鏈表)
        // 棧
        LinkedList<String> stack = new LinkedList<>();
        stack.push("第一顆子彈");
        stack.addFirst("第二顆子彈");
        stack.addFirst("第三顆子彈");
        stack.addFirst("第四顆子彈");
        System.out.println(stack);
        // 出棧 彈棧
        System.out.println(stack.pop());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack);

        // 隊列
        LinkedList<String> queue = new LinkedList<>();
        // 入隊
        queue.addLast("1號");
        queue.addLast("2號");
        queue.addLast("3號");
        queue.addLast("4號");
        System.out.println(queue);
        // 出隊
        System.out.println(queue.pop());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);
    }
}
