package javaCode;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    public void createLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }
    public void insertAt(int position, int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createLinkedList(nodeValue);
            return;
        } else if (position == 0) {
            node.next = head;
            head = node;
        } else if (position >= size) {
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            for (int i = 1; i < position; i++) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }
    public void printLinkedList() {
        if (head == null) {
            System.out.println("list not created ");
        } else {
            Node tempNode = head;
            for (int i = 1; i <= size; i++) {
                System.out.print(tempNode.value);
                if (i < size) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }
    public void search(int value) {
        Node tempNode = head;
        boolean flag = false;
        for (int i = 1; i < size; i++) {
            if (tempNode.value == value) {
                System.out.println(value + " is found at " + i);
                flag = true;
                break;
            }
            tempNode = tempNode.next;
        }
        if (!flag) {
            System.out.println(value + " not present.");
        }
    }
    public void deleteAt(int position) {
        if (head == null) {
            System.out.println("LinkedList not created yet");
        } else if (position == 0) {
            head = head.next;
            if (size == 1) {
                tail = null;
            }
        } else if (position >= size) {
            Node tempNode = head;
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                while (tempNode.next.next != null) {
                    tempNode = tempNode.next;
                }
                tempNode.next = null;
                tail = tempNode;
            }
        } else {
            Node tempNode = head;
            for (int i = 1; i < position; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
        }
        size--;
    }
    public int length(){
        return size;
    }
}
