package com.queue;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void getFirst(){
        System.out.println("First value"+first.value);
    }

    public void getLast(){
        System.out.println("Last value"+last.value);
    }

    public void printLength(){
        System.out.println("Queue length"+length);
    }

    public void printQueue(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void enqueue(int value){
        Node newQueue = new Node(value);
        if(first == null){
            first = newQueue;
            last = newQueue;
        }else{
            last.next = newQueue;
            last = newQueue;
        }
        length++;
    }

    public Node dequeue(){
        if(length == 0){
            return null;
        } else if(length == 1){
            first = null;
            last = null;
            length --;
            return first;
        }else{
            Node temp = first;
            first = first.next;
            temp.next= null;
            length --;
            return temp;
        }
    }
}
