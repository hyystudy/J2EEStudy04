package com.company;

public class MyStack {

    private int maxSize;
    private int top ;
    private Object[] stackArray;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new Object[maxSize];
        top = -1;
    }

    public void push(Object j){
        stackArray[++top] = j;
    }

    public Object pop(){
        return stackArray[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public Object peek(){
        return stackArray[top];
    }


    public boolean isFull(){
        return top == (maxSize - 1);
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }



}
