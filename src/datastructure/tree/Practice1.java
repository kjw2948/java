package datastructure.tree;

class BinaryTree {
    char[] arr;

    BinaryTree(char[] data){
        this.arr = data.clone();
    }
    public void preOrder(int idx){
        System.out.println(this.arr[idx] + " ");

        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        if (left < this.arr.length) {
            this.preOrder(left);
        }
        if (right < this.arr.length) {
            this.preOrder(right);
        }
    }
    public void inOrder(int idx){
        int left = idx*2 + 1;
        int right = idx*2 + 2;
        if(left < arr.length){
            this.inOrder(left);
        }
        System.out.println(this.arr[idx]);
        if(right < arr.length){
            this.inOrder(right);
        }
    }
    public void postOrder(int idx){
        int left = idx*2 + 1;
        int right = idx*2 + 2;
        if(left < arr.length){
            this.postOrder(left);
        }
        if(right < arr.length){
            this.postOrder(right);
        }
        System.out.println(this.arr[idx]);
    }
}


public class Practice1 {
    public static void main(String[] args) {
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) ('A' + i);
        }
        BinaryTree bt = new BinaryTree(arr);
        System.out.println("== Preorder ==");
        bt.preOrder(0);
        System.out.println();

        System.out.println("== Inorder ==");
        bt.inOrder(0);
        System.out.println();

        System.out.println("== Postorder ==");
        bt.postOrder(0);
        System.out.println();
    }
}
