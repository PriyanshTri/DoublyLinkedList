package main;

import implimentation.MyDoublyLinkedList;

public class Driver extends MyDoublyLinkedList {
    public static void main(String[] args) {
        MyDoublyLinkedList dl=new MyDoublyLinkedList();
        dl.addLast(1);
        dl.addLast(2);
        dl.addLast(3);
        dl.addLast(4);
        dl.addLast(5);
        dl.traverseForward();
        dl.size();
        dl.isEmpty();
        dl.addAfterGivenElement(10,5);  //getting null pointer error
        dl.traverseForward();

    }
}
