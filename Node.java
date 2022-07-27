package akm;

public class Node {
    int data;
    Node left, right;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
