package com.astontech.learningDataStructures.ds.linkedList.doubleLinkedList;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();
        theList.insertFirst(12);
        System.out.println(theList.isEmpty());
        theList.insertFirst(12);
        theList.insertFirst(12);
        theList.insertFirst(12);
        theList.insertLast(45);
        theList.insertLast(76);
        theList.insertLast(86);
        theList.displayBackward();
        theList.displayForward();
        theList.deleteFirst();
        theList.deleteLast();
        theList.deleteKey(45);
        theList.displayForward();
        theList.insertAfter(12, 12);
        theList.insertAfter(76, 86);
        theList.displayForward();
    }
}
