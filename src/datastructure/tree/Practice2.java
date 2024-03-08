package datastructure.tree;

class Node{
    char data;
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

    public Node makeNode(char data, Node left, Node right) {
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
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void postOrder(Node node) {
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
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
        Node H = tree.makeNode('H', null, null);
        Node I = tree.makeNode('I', null, null);
        Node D = tree.makeNode('D', H, I);
        Node J = tree.makeNode('J', null, null);
        Node E = tree.makeNode('E', J, null);
        Node B = tree.makeNode('B', D, E);
        Node F = tree.makeNode('F', null, null);
        Node G = tree.makeNode('G', null, null);
        Node C = tree.makeNode('C', F, G);
        Node A = tree.makeNode('A', B, C);
        tree.setRoot(A);
        System.out.println("====== preOrder ======");
        tree.preOrder(A);
        System.out.println("");
        System.out.println("====== inOrder ======");
        tree.inOrder(A);
        System.out.println("");
        System.out.println("====== postOrder ======");
        tree.postOrder(A);
        System.out.println("");
    }
}
