package javaCode;

public class CircularLinkedList {
    Node head;
    Node tail;
    int size;

    public void createCircularLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
    }
    public void insertAt(int position, int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCircularLinkedList(nodeValue);
            return;
        } else if (position == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (position >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
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
    public void printCircularLinkedList() {
        if (head == null) {
            System.out.println("Circular LinkedList not created yet");
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
    public void search(int value){
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
            System.out.println("Circular LinkedList not created yet");
            return;
        } else if (position == 0) {
            head = head.next;
            tail.next = head;
            if (size == 1) {
                head.next = null;
                head = null;
                tail = null;
            }
        }else if(position >= size){
            if (size == 1) {
                head.next = null;
                head = null;
                tail = null;
            }else {
                Node tempNode = head;
                while (tempNode.next !=tail){
                    tempNode = tempNode.next;
                }
                tail = tempNode;
                tail.next = head;

            }
        }else{
            Node tempNode = head;
            for (int i =1;i<position;i++){
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
