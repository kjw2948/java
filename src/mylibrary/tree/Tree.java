package mylibrary.tree;

import java.util.ArrayList;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}

public class Tree {
    public static void main(String[] args) {
        int count = 7;
        Node[] tree = new Node[count+1];
        for (int i = 1; i <= count; i++) {
            Node node = new Node(i);
            tree[i] = node;
        }
        for (int i = 1; i*2 <= count; i++) {
            tree[i].left = tree[i*2];
            tree[i].right = tree[i*2 + 1];
        }
        System.out.println("---------preOrder---------");
        preOrder(tree[1]);
        System.out.println(" ");
        System.out.println("---------inOrder---------");
        inOrder(tree[1]);
        System.out.println(" ");
        System.out.println("---------postOrder---------");
        postOrder(tree[1]);
    }

    static void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    static void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    static void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

}
