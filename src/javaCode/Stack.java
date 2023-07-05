package javaCode;

public class Stack {
    Node top;
    int size;

    public void createStack(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        top = node;
        size = 1;
    }

    public void push(int value) {
        Node node = new Node();
        node.value = value;
        if (isEmpty()) {
            createStack(value);
        } else {
            node.next = top;
            top = node;
            size++;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("No any element in stack");
        } else {
            top = top.next;
            size--;
        }
    }

    public void print() {
        Node tempNode = top;
        if (isEmpty()) {
            System.out.println("Stack not created yet");
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
        return top == null;
    }

    public int len() {
        return size;
    }
}
