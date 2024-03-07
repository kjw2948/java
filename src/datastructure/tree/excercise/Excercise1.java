package datastructure.tree.excercise;

import java.util.TreeMap;

public class Excercise1 {
    public static void inOrder(int[] arr, int idx) {
        int left = idx * 2 + 1;
        int right = idx * 2 + 2;
        if(left<arr.length -1){
            inOrder(arr, left);
        }
        System.out.print(arr[idx]+" ");
        if(right<arr.length -1){
            inOrder(arr, right);
        }
    }
    public static void solution(int n) {
        int[] tree = new int[(int)Math.pow(2, n)];
        tree[0] = 0;
        for (int i = 0; i < Math.pow(2, (n-1))-1; i++) {
            tree[i * 2 + 1] = 0;
            tree[i * 2 + 2] = 1;
        }
        inOrder(tree, 0);
        System.out.println("");
    }

    public static void main(String[] args) {
        solution(1);
        solution(2);
        solution(3);
    }
}
