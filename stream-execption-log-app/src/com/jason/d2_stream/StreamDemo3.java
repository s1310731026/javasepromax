package com.jason.d2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("A1");
        list.add("A1");
        list.add("A2");
        list.add("A3");
        list.add("A3");
        list.add("B4");

//        filter(Predicate<? super T> predicate)
        System.out.println(list.stream().filter(s -> s.startsWith("A")).toList());
        System.out.println(list.stream().filter(s -> s.startsWith("A")).limit(2).toList());
        System.out.println(list.stream().filter(s -> s.startsWith("A")).skip(2).toList());
        list.stream().filter(s -> s.startsWith("A")).limit(2).forEach(s -> System.out.println(s));
//        map(Function<? super T,? extends R> mapper)
        //map 加工法 : 第一個原材料  第二個加工後的結果
        System.out.println(list.stream().map((s) -> "test: " + s).toList());

        list.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));
//        list.stream().map(Student::new).forEach(System.out::println);// 方法引用

        Stream<String> s1 = list.stream().filter(s-> s.startsWith("A"));
        Stream<Integer> s2 =Stream.of(22,33);
//        static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
        Stream<Object> s3 = Stream.concat(s1,s2);
        s3.forEach(s-> System.out.println(s));
//        flatMap(Function<? super T,? extends Stream<? extends R>> mapper)

    }
}
