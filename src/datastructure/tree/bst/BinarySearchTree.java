package datastructure.tree.bst;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int key;
    Node left;
    Node right;

    Node(int key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
}
public class BinarySearchTree {
    Node head;
    BinarySearchTree(int key) {
        this.head = new Node(key, null, null);
    }

    public void addNode(int key) {
        if (this.head == null) {
            this.head = new Node(key, null, null);
        } else {
            Node cur = this.head;
            while (true) {
                Node pre = cur;
                if (key < cur.key) {
                    cur = cur.left;
                    if (cur == null) {
                        pre.left = new Node(key, null, null);
                        break;
                    }
                } else {
                    cur = cur.right;
                    if (cur == null) {
                        pre.right = new Node(key, null, null);
                        break;
                    }
                }
            }
        }
    }

    public void removeNode(int key) {
        Node parent = null;
        Node successor = null;
        Node predecessor = null;
        Node child = null;

        Node cur = this.head;
        while (cur != null) {
            if (key == cur.key) {
                break;
            }
            parent = cur;
            if (key < cur.key) {
                cur = cur.left;
            } else{
                cur = cur.right;
            }
        }
        if (cur == null) {
            System.out.println("key에 해당되는 노드가 없습니다");
            return;
        }
        if (cur.left == null && cur.right == null) {
            if (parent == null) {
                child = cur.left;
            } else {
                child = cur.right;
            }
            if (parent == null) {
                this.head = child;
            } else {
                if (parent.left == cur) {
                    parent.left = child;
                } else {
                    parent.right = child;
                }
            }
        } else {
            predecessor = cur;
            successor = cur.left;

            while (successor.right != null) {
                predecessor = successor;
                successor = successor.right;
            }
            predecessor.right = successor.right;
            successor.left = cur.left;
            successor.right = cur.right;

            if (parent == null) {
                this.head = successor;
            } else {
                if (parent.left == cur) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
        }
    }
    public void levelOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.print(cur.key + " ");
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }
}
