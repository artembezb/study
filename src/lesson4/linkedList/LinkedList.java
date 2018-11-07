package lesson4.linkedList;

import java.util.Arrays;

public class LinkedList {
    int size;
    int quantity;
    Node[] linkedList;

    @Override
    public String toString() {
        return "LinkedList{" +
                "linkedList=" + Arrays.toString(linkedList) +
                '}';
    }

    public LinkedList(int quantity) {
        this.quantity = quantity;
        Node[] linkedList = new Node[quantity];
        this.linkedList = linkedList;
    }
}
