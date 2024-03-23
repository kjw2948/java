package programmers.kakao;

import java.util.ArrayList;
import java.util.Collections;

class Rate{
    double ratio;
    int index;
    Rate(double ratio, int index) {
        this.ratio = ratio;
        this.index = index;
    }
}
public class FailRatio {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] fail = new int[N];
        int[] complete = new int[N];
        for (int i = 0; i < stages.length; i++) {
            for (int j = 1; j <= stages[i]; j++) {
                if(j==N+1){
                    continue;
                }
                complete[j-1]++;
            }
            if(stages[i]==N+1){
                continue;
            }
            fail[stages[i]-1]++;
        }
        ArrayList<Rate> rate = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (complete[i] == 0) {
                rate.add(new Rate(0.0, i + 1));
                continue;
            }
            rate.add(new Rate(((double) fail[i] / complete[i]),i+1));
        }
        Collections.sort(rate, (((o1, o2) -> Double.compare(o2.ratio , o1.ratio))));
        for (int i = 0; i < N; i++) {
            answer[i] = rate.get(i).index;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3}; // 3, 4, 2, 1, 5
        int N = 5;
        int[] answer = solution(N, stages);
        for (int i = 0; i < N; i++) {
            System.out.print(answer[i] + " ");
        }
    }

}
