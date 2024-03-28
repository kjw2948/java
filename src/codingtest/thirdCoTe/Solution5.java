package codingtest.thirdCoTe;

import java.util.ArrayList;
import java.util.Collections;

public class Solution5 {
    static int min = Integer.MAX_VALUE;
    public static int solution(int[] reward, int[] health, int[] optional) {
        dfs(reward, health, optional, 0, 0, 1);
        return min;
    }
    public static void dfs(int[] reward, int[] health, int[] optional, int index, int answer, int attack){
        if(index==health.length){
            if(min>answer){
                min = answer;
            }
            return ;
        }
        if(optional[index]==1){
            dfs(reward, health, optional, index+1, answer, attack);
            if (health[index] % attack == 0) {
                answer += health[index] / attack;
                attack += reward[index];
            } else {
                answer += health[index] / attack + 1;
                attack += reward[index];
            }
            dfs(reward, health, optional, index+1, answer, attack);
        }else {
            if (health[index] % attack == 0) {
                answer += health[index] / attack;
                attack += reward[index];
            } else {
                answer += health[index] / attack + 1;
                attack += reward[index];
            }
            dfs(reward, health, optional, index + 1, answer, attack);
        }
    }


    public static void main(String[] args) {
        int[] reward = {1, 2, 2, 0, 3, 5};
        int[] health = {10, 20, 20, 20, 40, 30};
        int[] optional = {1, 0, 1, 0, 0, 0};
        System.out.println(solution(reward, health, optional));
    }
}
