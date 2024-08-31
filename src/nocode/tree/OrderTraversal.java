package nocode.tree;

public class OrderTraversal {
    Node tree;
    int data;

    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void InOrder(Node node) {
        if (node != null) {
            preOrder(node.left);
            System.out.println(node.data);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            preOrder(node.left);
            preOrder(node.right);
            System.out.println(node.data);
        }
    }


    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public Node(Node left, Node right, int data) {
            this.left = left;
            this.right = right;
            this.data = data;
        }
    }

    public static void main(String[] args) {
        OrderTraversal tree = new OrderTraversal();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        tree.tree = node1;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.right = node5;

        tree.InOrder(tree.tree);
    }
}
