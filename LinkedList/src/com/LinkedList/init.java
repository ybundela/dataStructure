package com.LinkedList;

public class init {

    public static void main(String args[]){
      //  LinkedList createList = new LinkedList(1);
      //  createList.append(2);
      //  createList.append(3);
      //  createList.append(4);
      //  createList.append(5);
      //  createList.append(6);

      //  Node middleNode = createList.findMiddleNode();
      //  System.out.println("Find middle node"+middleNode.value);
     //   System.out.println("Hasloop"+createList.hasLoop());
        //createList.removeLastNode();
       // createList.prepend(5);
       // createList.getNode(3);
        //createList.insertNode(6,3);
        //createList.deleteNodeAtIndex(3);
       // createList.setNode(2,8);
        //createList.removeFirst();
        //createList.reverse();
       // createList.getHead();
      //  createList.getTail();
      //  createList.getLength();
      //  createList.printList();


        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.prepend(0);
        //doublyLinkedList.removeFirst();
        //doublyLinkedList.removeLast();
        doublyLinkedList.set(2,7);
        doublyLinkedList.removeForIndex(1);
        System.out.println("Get node from particular index"+doublyLinkedList.get(2).value);
        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.printList();
        doublyLinkedList.getLength();
    }
}
