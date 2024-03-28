package codingtest.thirdCoTe;

import java.util.HashMap;

public class Solution1 {
    public static int solution(int N, int[][] trust) {
        int answer = 0;
        HashMap<Integer, Integer> result = new HashMap<>();
        if(trust.length==0)
        for (int i = 1; i < N+1; i++) {
            result.put(i, 0);
        }
        for (int i = 0; i < trust.length; i++) {
            result.put(trust[i][0], result.getOrDefault(trust[i][0], 0) + 1);
            result.put(trust[i][1], result.getOrDefault(trust[i][1], 0) + 100);
        }
        int count = 0;
        for (Integer integer : result.keySet()) {
            if(result.get(integer)>=100){
                count ++;
            }
            if(result.get(integer) % 100 == 0){
                answer = integer;
            }
            if(count==N){
                answer = 0;
            }
        }
        return answer == 0 ? -1 : answer;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {1, 4}, {1, 3}, {2, 1}, {4, 3}};
        //int[][] arr ={{1,3},{2,3}};

        System.out.println(solution(4, arr));

    }
}
