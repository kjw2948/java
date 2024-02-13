package excercise.java;
import java.util.Arrays;
public class Excercise2 {
    public static void solution(int[] num){
        int idx = 0;
        for (int i : num) {
            if(idx==0 || i>num[idx-1]){
                num[idx++] = i;
            }
        }
        System.out.print("["+(idx) +"] ");
        for (int i = 0; i < idx; i++) {
            System.out.print(num[i]+ "\t");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {0,0,1,1,2};
        solution(arr1);
    }
}
