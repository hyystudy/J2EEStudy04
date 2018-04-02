package com.company;

import java.util.LinkedList;

public class Stack {

    private LinkedList linkedList = new LinkedList();

    public void push(Object o){
        linkedList.addFirst(o);
    }

    public Object pop(){
        return linkedList.removeFirst();
    }

    public Object top(){
        return linkedList.getFirst();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 0; i < 40; i++) {
            stack.push(new Integer(i));
        }

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
