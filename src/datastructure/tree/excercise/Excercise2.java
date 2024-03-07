package datastructure.tree.excercise;

class BinaryTree {
    int h;
    int[] arr;
    int res;

    public BinaryTree(int h, int[] w) {
        this.h = h;
        arr = new int[(int) Math.pow(2, h + 1)];
        res = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = w[i - 2];
        }
    }

    public int dfs(int idx, int h) {
        if (this.h == h) {
            res += arr[idx];
            return arr[idx];
        }
        int left = dfs(idx*2 , h + 1);
        int right = dfs(idx*2 + 1, h + 1);
        res += arr[idx] + Math.abs(left - right);
        return arr[idx] + Math.max(left, right);
    }
}
public class Excercise2 {

}
