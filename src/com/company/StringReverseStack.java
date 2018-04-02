package com.company;

public class StringReverseStack {

    private String input;

    public StringReverseStack(String in){
        this.input = in;
    }

    public String doRev(){
        int stackSize = input.length();
        MyStack myStack = new MyStack(stackSize);

        for (int i = 0; i < stackSize; i++) {
            myStack.push(input.charAt(i));
        }

        String output = "";

        for (int i = 0; i < stackSize; i++) {
            char pop = (char) myStack.pop();
            output += pop;
        }

        return output;
    }

    public static void main(String[] args) {
        StringReverseStack stringReverseStack = new StringReverseStack("I Love Zal");
        String rev = stringReverseStack.doRev();
        System.out.println(rev);
    }
}
