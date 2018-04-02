package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args){

        Queue<String> strings = new LinkedList<>();
        strings.offer("a");
        strings.offer("b");
        strings.offer("c");
        strings.offer("d");
        strings.offer("e");
        strings.offer("f");

        for (String s :
                strings) {
            System.out.println(s);
        }

        System.out.println("======");
        //返回第一个元素 并在队列中删除
        System.out.println("Poll:" + strings.poll());

        for (String s :
                strings) {
            System.out.println(s);
        }

        System.out.println("======");
        //返回第一个元素
        System.out.println("Element:" + strings.element());
        for (String s :
                strings) {
            System.out.println(s);
        }

        System.out.println("======");
        //返回第一个元素
        System.out.println("Peek:" + strings.peek());
        for (String s :
                strings) {
            System.out.println(s);
        }
    }
}
