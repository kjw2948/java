package mylibrary.tree;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}
public class Tree {
    static void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    static void inOrder(Node node) {
        if (node != null) {
            preOrder(node.left);
            System.out.println(node.data + " ");
            preOrder(node.right);
        }
    }
    static void postOrder(Node node) {
        if (node != null) {
            preOrder(node.left);
            preOrder(node.right);
            System.out.println(node.data + " ");
        }
    }

}
