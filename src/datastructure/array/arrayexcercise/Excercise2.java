package datastructure.array.arrayexcercise;
import java.util.Arrays;

public class Excercise2 {
        public static void main(String[] args) {
            int[] arr = {1, 3, 7, 9};
            for (int i = 0; i < arr.length/2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
}
