package com.HashTable;

public class HashTableMain {

    public static void main(String[] args){
        HashTable hashTable =  new HashTable();
        hashTable.setNode("Yogi", 100);
        hashTable.setNode("priya", 50);
        hashTable.setNode("Papa", 150);
        System.out.println("Keys value"+hashTable.get("priya"));
        System.out.println("Get keys"+hashTable.keys());
        //hashTable.printHashTable();
    }
}
