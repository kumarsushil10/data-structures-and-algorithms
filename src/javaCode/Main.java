package javaCode;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cd = new CircularDoublyLinkedList();
        cd.insertAt(0,2);
        cd.insertAt(0,1);
        cd.insertAt(3,4);
        cd.insertAt(2,3);
        cd.insertAt(5,5);
        cd.insertAt(9,12);
        cd.insertAt(4,23);
        cd.printCircularDoublyLinkedList();
        System.out.println(cd.head.previous.value);
        cd.printReversedCircularDoublyLinkedList();

    }
}
