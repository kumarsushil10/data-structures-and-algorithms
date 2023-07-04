package javaCode;

import java.util.HashSet;

public class Questions {


    public void removeDuplicate(LinkedList linkedList) {
        Node currentNode = linkedList.head;
        HashSet<Integer> hashSet = new HashSet();
        Node previous = null;
        while (currentNode != null) {
            if (hashSet.contains(currentNode.value)) {
                previous.next = currentNode.next;
                linkedList.size--;
            } else {
                hashSet.add(currentNode.value);
                previous = currentNode;
            }
            currentNode = currentNode.next;
        }
    }

    public Node nthNodeFromLast(LinkedList linkedLists, int positionFromLast) {
        int position = linkedLists.size + 1 - positionFromLast;
        Node tempNode = linkedLists.head;
        for (int i = 1; i < position; i++) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }
}
