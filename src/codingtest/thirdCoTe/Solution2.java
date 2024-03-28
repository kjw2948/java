package codingtest.thirdCoTe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution2 {
    static ArrayList<Integer> list = new ArrayList<>();
    public static int solution(int[] numbers, int target) {
        int answer = 0;
        Arrays.sort(numbers);
        if(numbers[0]==0 && target ==0){
            return 1;
        }
        dfs(numbers, target, answer);
        Collections.sort(list);
        return list.size()==0 ? -1 : list.get(0);
    }
    public static void dfs(int[] numbers, int target, int answer){
        if(target<0){
            return ;
        }
        if(target==0){
            list.add(answer);
        }else{
            for (int i = numbers.length-1; i >= 0; i--) {
                if(numbers[i]==0 && target!=0){
                    continue;
                }
                if (numbers[i]!=1&&numbers[i]!=0 && target % numbers[i] == 0) {
                    answer ++;
                    dfs(numbers, (target / numbers[i]), answer);
                }else{
                    answer ++;
                    dfs(numbers, target - numbers[i], answer);
                }
                answer -= 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4};
        System.out.println(solution(numbers, 12));
    }
}
