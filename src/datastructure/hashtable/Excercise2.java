package datastructure.hashtable;
import java.util.Arrays;
import java.util.Hashtable;
public class Excercise2 {
    public static int[] solution(int[] arr, int target) {
        int[] result = new int[2];
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            if(ht.containsKey(arr[i])){
                result[0] = ht.get(arr[i]);
                result[1] = i;
                return result;
            }
            ht.put(target - arr[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3};
        int target = 10;
        System.out.println(Arrays.toString(solution(arr, target)));
    }
}
