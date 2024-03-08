package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node{
    char data;
    Node left;
    Node right;
    public Node(char data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Problem1991 {
    static Node[] tree;
    public static void inOrder(Node node) {
        if(node!=null){
            inOrder(node.left);
            System.out.print(node.data);
            inOrder(node.right);
        }
    }
    public static void preOrder(Node node) {
        if(node!=null){
            System.out.print(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public static void postOrder(Node node) {
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        tree = new Node[N + 1];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            char rootValue = st.nextToken().charAt(0);
            char leftValue = st.nextToken().charAt(0);
            char rightValue = st.nextToken().charAt(0);

            if (tree[rootValue - 'A'] == null) {
                tree[rootValue - 'A'] = new Node(rootValue);
            }
            if (leftValue != '.') {
                tree[leftValue - 'A'] = new Node(leftValue);
                tree[rootValue - 'A'].left = tree[leftValue - 'A'];
            }
            if (rightValue != '.') {
                tree[rightValue - 'A'] = new Node(rightValue);
                tree[rootValue - 'A'].right = tree[rightValue - 'A'];
            }
        }
        preOrder(tree[0]);
        System.out.println();
        inOrder(tree[0]);
        System.out.println();
        postOrder(tree[0]);
    }
}
