package com.jasoncode.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("D");
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        System.out.println(list);

//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String ele = it.next();
//            if ("A".equals(ele)){
////                list.remove("A");
//                it.remove(); // 使用跌代器，刪除當前位置元素，並且不會後移，能夠遍歷全部元素
//            }
//        }
//        System.out.println(list);
        //b. foreach遍歷刪除
//        for (String s : list) {
//            if ("A".equals(s)){
//                list.remove("A");
//            }
//        }
        //c. lambda表達式(會出現bug)
//        list.forEach(s -> {
//            if (s.equals("A")) {
//                list.remove("A");
//            }
//        });

        //d.for循環  (不會出現錯誤，但是數據刪除會漏掉元素)
//        for (int i = 0; i < list.size(); i++) {
//            String ele = list.get(i);
//            if ("A".equals(ele)){
//                list.remove("A");
//            }
//        }
//        System.out.println(list);

//        解決方案
//        for (int i = list.size() -1; i >= 0; i--) {
//            String ele = list.get(i);
//            if ("A".equals(ele)){
//                list.remove("A");
//            }
//        }
//        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            if ("A".equals(ele)){
                list.remove("A");
                i--;
            }
        }
        System.out.println(list);
    }

}
