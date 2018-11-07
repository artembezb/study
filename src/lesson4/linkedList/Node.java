package lesson4.linkedList;

import lesson4.linkedList.LinkedList;

public class Node {
    int count;
    int nextCount;

    public Node(int count, int nextCount) {
        this.count = count;
        this.nextCount = nextCount;
    }

    public int getCount() {
        return count;
    }

    public int getNextCount() {
        return nextCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setNextCount(int nextCount) {
        this.nextCount = nextCount;
    }
}
