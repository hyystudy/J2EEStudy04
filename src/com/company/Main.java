package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        //可以重复
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(5);

        System.out.println(integers);
        integers.addFirst(0);
        integers.addLast(6);
        //设置元素
        integers.set(5, 10);
        System.out.println(integers);
        System.out.println("First element:" + integers.getFirst());
        System.out.println("Last element:" + integers.getLast());

        List<Integer> integers1 = integers.subList(2, 4);
        System.out.println(integers1);
        //integers1.clear();
        System.out.println(integers);


        System.out.println("5 first index: " + integers.indexOf(5));
        System.out.println("5 last index: " + integers.lastIndexOf(5));

    }
}
