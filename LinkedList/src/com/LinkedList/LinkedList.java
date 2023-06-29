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
    public Node removeLastNode(){
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

    /*Prepend the Node into the list*/
    public void prepend(int value){
        if(length == 0){
            LinkedList newList = new LinkedList(value);
        }else{
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            length++;
        }
    }
    /*Remove node from first*/
    public Node removeFirst(){
        if(length == 0)return null;
        if(length == 1){
            head = null;
            tail = null;
            length --;
            return null;

        }else{
            Node temp = head;
            head = temp.next;
            temp.next = null;
            length --;
            return temp;
        }
    }

    /*Get node from particular index*/
    public Node getNode(int index){
        if(length == 0 || index < 0 || index > length){
            return null;
        } else{
            Node temp = head;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            System.out.println("Node from passed index is "+temp.value);
            return temp;
        }

    }

    /*Insert node at particular index*/
    public boolean insertNode(int value, int index){
        if(index < 0 || index > length)return false;
        if(length == 1){
           prepend(value);
           return true;
        }else if(length == index){
            append(value);
            return true;
        }
        Node temp = getNode(index-1);
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
    /*set the node at particular*/
    public boolean setNode(int index, int value){
        Node temp = getNode(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
    /*Delete the node at particular index*/
    public Node deleteNodeAtIndex(int index){
        if(index<0 || index>length)return null;
        if(index == 0){
            return removeFirst();
        } else if(index == length){
            return removeLastNode();
        }else{
            Node pre = getNode(index-1);
            Node temp = getNode(index);
            pre.next = temp.next;
            temp.next = null;
            length--;
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
