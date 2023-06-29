package com.LinkedList;

public class init {

    public static void main(String args[]){
        LinkedList createList = new LinkedList(1);
        createList.append(2);
        createList.append(3);
        createList.append(4);
        //createList.removeLastNode();
       // createList.prepend(5);
       // createList.getNode(3);
        //createList.insertNode(6,3);
        //createList.deleteNodeAtIndex(3);
       // createList.setNode(2,8);
        //createList.removeFirst();
        createList.reverse();
        createList.getHead();
        createList.getTail();
        createList.getLength();
        createList.printList();
    }
}
