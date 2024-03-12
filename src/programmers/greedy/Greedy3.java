package programmers.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greedy3 {
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int index = 0;
        for (int i = people.length-1; i >= index ; i--) {
            if(people[i]+people[index] > limit){
                answer ++;
            } else{
                answer ++;
                index++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(solution(people, limit));
    }
}
