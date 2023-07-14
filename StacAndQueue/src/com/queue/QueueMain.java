package com.queue;

public class QueueMain {

    public static void main(String[] args){
        Queue queue = new Queue(1);
        queue.enqueue(2);
        queue.printQueue();
        queue.getFirst();
        queue.getLast();
    }
}
