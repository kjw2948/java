package codingtest.fiveCoTe;

import java.util.ArrayList;

public class Solution2 {
    public static void checkArray(ArrayList<Integer> num){

    }
    public static String solution(int[] numbers) {
        String answer = "";
        int count = 0;
        ArrayList<Integer>[] list = new ArrayList[10];
        for (int i = 0; i < numbers.length; i++) {
            int a = Integer.toString(numbers[i]).charAt(0) + '0';
            list[a].add(numbers[i]);
        }
        while (count <= numbers.length) {
            for (int i = 9; i <= 0; i++) {
                if(list[i].isEmpty()){
                    continue;
                }
                if(list[i].size()==1){
                    answer += Integer.toString(list[i].get(0));
                    count ++;
                    continue;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};

    }
}
