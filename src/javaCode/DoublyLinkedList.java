package javaCode;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public void createLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        node.previous = null;
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
            head.previous = node;
            node.next = head;
            head = node;
        } else if (position >= size) {
            tail.next = node;
            node.previous = tail;
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

    public void deleteAt(int position) {
        if (head == null) {
            System.out.println("No any item to delete.");
            return;
        } else if (position == 0) {
            head = head.next;
            if (size == 1) {
                head = null;
                tail = null;
            }
        } else if (position >= size) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                Node tempNode = head;
                while (tempNode.next != tail) {
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
            tempNode.next.previous = tempNode;
        }
        size--;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("LinkedList not created yet");
        } else {
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
    }

    public void printReversedLinkedList() {
        if (head == null) {
            System.out.println("LinkedList not created yet");
        } else {
            Node tempNode = tail;
            for (int i = size; i >= 1; i--) {
                System.out.print(tempNode.value);
                if (i > 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.previous;
            }
            System.out.println();
        }
    }

    public void search(int value) {
        if (head != null) {
            Node tempNode = head;
            boolean flag = false;
            for (int i = 1; i <= size; i++) {
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
    }
}
