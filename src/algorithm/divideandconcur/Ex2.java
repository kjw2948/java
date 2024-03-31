package algorithm.divideandconcur;


public class Ex2 {
    public static void solution(int[] arr, int left, int right) {


    }
    public static int sliceArray(int[] arr, int left, int right) {
        if(left==right){
            return arr[left];
        }
        int mid = left + (right - left) / 2;

        int leftArray = sliceArray(arr, left, mid);
        int rightArray = sliceArray(arr, mid+1, right);

        return 0;
    }
    public static int getSum(int[] arr, int left, int right) {
        int sumValue = 0;
        int minValue = Integer.MIN_VALUE;

        return 0;
    }


    public static void main(String[] args){
        int[] arr = {-5, 0, -3, 4, -1, 3, 1, -5, 8};

    }
}
