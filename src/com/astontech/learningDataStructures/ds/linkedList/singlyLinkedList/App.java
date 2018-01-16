package com.astontech.learningDataStructures.ds.linkedList.singlyLinkedList;

public class App {

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(23);
        myList.insertFirst(64);
        myList.insertLast(601010101);

        myList.displayList();
    }
}
