package datastructure.tree;

class Node{
    int data;
    Node left;
    Node right;
}

class Tree {
    public Node root;
    public void setRoot(Node node) {
        this.root = node;
    }
    public Node getRoot() {
        return root;
    }

    public Node makeNode(int data, Node left, Node right) {
        Node node = new Node();
        node.data = data;
        node.left = left;
        node.right = right;
        return node;
    }
    public void inOrder(Node node) {
        if(node!=null){
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
    public void preOrder(Node node) {
        if(node!=null){
            System.out.print(node.data + " ");
            inOrder(node.left);
            inOrder(node.right);
        }
    }
    public void postOrder(Node node) {
        if(node!=null){
            inOrder(node.left);
            inOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}

class BinaryTree2 {
    Node head;
}
public class Practice2 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node n4 = tree.makeNode(4, null, null);
        Node n5 = tree.makeNode(5, null, null);
        Node n2 = tree.makeNode(2, n4, n5);
        Node n3 = tree.makeNode(3, null, null);
        Node n1 = tree.makeNode(1, n2, n3);
        tree.setRoot(n1);
        System.out.println("====== preOrder ======");
        tree.preOrder(n1);
        System.out.println("");
        System.out.println("====== inOrder ======");
        tree.inOrder(n1);
        System.out.println("");
        System.out.println("====== postOrder ======");
        tree.postOrder(n1);
        System.out.println("");
    }
}
