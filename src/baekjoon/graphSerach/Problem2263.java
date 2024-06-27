package baekjoon.graphSerach;

public class Problem2263 {
    static class Node {
        Node left, right, parent;
        int num;

        Node(int num) {
            this.num = num;
        }
        Node(int num, Node parent) {
            this.num = num;
            this.parent = parent;
        }
        public void insert(int n) {
        }
    }
}
