package baekjoon.graphSerach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5639 {
    static class Node {
        Node left, right;
        int num;

        Node(int num) {
            this.num = num;
        }

        Node(int num, Node left, Node right) {
            this.num = num;
            this.left = left;
            this.right = right;
        }

        void insert(int n) {
            if (n < this.num) {
                if (this.left == null) this.left = new Node(n);
                else this.left.insert(n);
            } else {
                if (this.right == null) this.right = new Node(n);
                else this.right.insert(n);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Node node = new Node(Integer.parseInt(br.readLine()));
        String input;
        while (true) {
            input = br.readLine();
            if (input == null || input.equals("")) {
                break;
            }
            node.insert(Integer.parseInt(input));
        }
        postOrder(node);
    }

    private static void postOrder(Node root) {
        if (root.left != null) {
            postOrder(root.left);
        }

        if (root.right != null) {
            postOrder(root.right);
        }
        System.out.println(root.num);
    }
}

