package com.LinkedList;

/*Create Linked class , which will perform various actions over Node
 @Author Yogendra Singh Bundela.
*/
public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    /*Create Linked class constructor, when there is no node available
    @param int value
    */
    public LinkedList(int value){
        Node createNode = new Node(value);
        head = createNode;
        tail = createNode;
        length = 1;
    }

    /*Get the length of the list*/
    public void getLength(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        System.out.println("Length of the list"+length);
    }

    /*Append the node at the end of the list*/

    public void append(int value){
        if(head == null){
            LinkedList newList = new LinkedList(value);
        }else {
            Node newNode = new Node(value);
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    /*delete the node at the end of the list*/
    public Node removeLastNode(int value){
        if(length == 0){
            System.out.println("Length is null, nothing to remove");
            return null;
        } else if(length == 1){
            head = null;
            tail = null;
            length --;
            System.out.println("Only single node available hence removing it");
            return null;
        } else{
            Node pre = head;
            Node temp = head;
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = temp.next;
            length --;
            System.out.println("Removing last node from the list"+temp.value);
            return temp;
        }
    }

    /*Get the head of the list*/
    public void getHead(){
        if(head == null){
            System.out.println("There is no element Linkedlist is empty");
        }else{
            System.out.println("Current Head"+head.value);
        }
    }

    /*Get the tail of the list*/
    public void getTail(){
        if(tail == null){
            System.out.println("There is no element Linkedlist is empty");
        }else{
            System.out.println("Current tail"+tail.value);
        }
    }

    /*Print the list*/
    public void printList(){
        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);
    }
}
