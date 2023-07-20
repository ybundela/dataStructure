package com.HashTable;

import java.util.ArrayList;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;

    public HashTable(){
       dataMap = new Node[size];
    }

    public void printHashTable(){
        for(int i=0;i< dataMap.length;i++){
            System.out.println(i +":");
            Node temp = dataMap[i];
            while(temp != null){
                System.out.println(" {" +temp.key + "="+temp.value+"} ");
                temp = temp.next;
            }
        }
    }

    private int hash(String key){
        int hash = 0;
        char[] hashChar = key.toCharArray();
        for(int i = 0; i<hashChar.length;i++){
            int asciivalue = hashChar[i];
            hash = (hash+asciivalue*23)% dataMap.length;
        }

        return hash;
    }

    public void setNode(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key,value);
        if(dataMap[index] == null){
            dataMap[index] = newNode;
        }else{
            Node temp = newNode;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

   public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp != null){
            if(temp.key == key){
                return temp.value;
            }
            temp = temp.next;
        }
        return 0;
   }
   public ArrayList keys(){
        ArrayList<String> hashtableKeys = new ArrayList<>();
        for(int i=0; i< dataMap.length;i++){
            Node temp = dataMap[i];
            while(temp != null){
                hashtableKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return hashtableKeys;
   }
}
