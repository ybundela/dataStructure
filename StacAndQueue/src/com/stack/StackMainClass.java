package com.stack;

public class StackMainClass {

    public static void main(String[] args){
        Stack stack = new Stack(1);
        stack.push(2);
        stack.pop();
        stack.printStack();
        stack.getTop();
    }


}
