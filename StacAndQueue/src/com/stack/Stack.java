package com.stack;

public class Stack {

    private Node top;
    private int height;

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height  =1;
    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getTop(){
        System.out.println("Stack top is"+top.value);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(top==null){
            top= newNode;

        }else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(height == 0)return null;
        if(height == 1){
            top= null;
            height--;
            return top;
        }else{
            Node temp = top;
            top = top.next;
            temp.next = null;
            height--;
            return temp;
        }


    }

}
