package com.LinkedList;

public class init {

    public static void main(String args[]){
        LinkedList createList = new LinkedList(1);
        createList.append(2);
        createList.append(3);
        createList.append(4);
        createList.removeLastNode(4);
        createList.getHead();
        createList.getTail();
        createList.getLength();
        createList.printList();
    }
}
