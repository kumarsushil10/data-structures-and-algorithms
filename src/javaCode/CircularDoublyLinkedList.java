package javaCode;

public class CircularDoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public void createCircularDoublyLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        node.previous = node;
        head = node;
        tail = node;
        size = 1;
    }

    public void insertAt(int position, int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCircularDoublyLinkedList(nodeValue);
            return;
        } else if (position == 0) {
            node.next = head;
            node.previous = tail;
            head.previous = node;
            tail.next = node;
            head = node;
        } else if (position >= size) {
            node.previous = tail;
            node.next = head;
            tail.next = node;
            head.previous = node;
            tail = node;
        } else {
            Node tempNode = head;
            for (int i = 1; i < position; i++) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            node.previous = tempNode;
            tempNode.next.previous = node;
            tempNode.next = node;
        }
        size++;
    }

    public void printCircularDoublyLinkedList() {
        Node tempNode = head;
        for (int i = 1; i <= size; i++) {
            System.out.print(tempNode.value);
            if (i < size) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    public void printReversedCircularDoublyLinkedList() {
        Node tempNode = tail;
        for (int i = size; i >= 1; i--) {
            System.out.print(tempNode.value);
            if (i > 1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.previous;
        }
    }

    public void deleteAt(int position) {
        if (head == null) {
            System.out.println("no any item to delete ");
        } else if (position == 0) {

        }
    }
}
