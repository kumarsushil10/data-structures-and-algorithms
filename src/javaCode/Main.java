package javaCode;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.print();

        stack.pop();
        stack.print();
        stack.push(5);
        stack.print();

    }
}
