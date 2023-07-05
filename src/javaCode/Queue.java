package javaCode;

public class Queue {
    Node head;
    Node tail;
    int size;

    public void createQueue(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }

    public void enqueue(int value) {
        Node node = new Node();
        node.value = value;
        if (isEmpty()) {
            createQueue(value);
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("No any element in queue ");
        } else {
            head = head.next;
            size--;
        }
    }

    public void print() {
        Node tempNode = head;
        if (isEmpty()) {
            System.out.println("Queue not create yet ");
        } else {
            while (tempNode != null) {
                System.out.print(tempNode.value);
                if (tempNode.next != null) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }

}