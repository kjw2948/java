import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] complete = new int[N];
        int[] step = new int[N];
        double[] fail = new double[N];
        for(int i = 0; i<stages.length; i++){
            if(stages[i]==N+1){
                break;
            }else {
                for (int j = 0; j < stages[i]; j++) {
                    complete[j]++;
                }
            }
        }
        for(int i = 0; i<stages.length; i++){
            if(stages[i]==N+1){
                break;
            }else {
                for (int j = 0; j <= stages[i]; j++) {
                    step[j]++;
                }
            }
        }
        for(int i =0; i<N; i++){
            if(step[i]==0){
                fail[i] = 0;
            }else{
                fail[i] = (double)((step[i] - complete[i])) / step[i];
            }
        }
        double[] sortFail = fail.clone();
        Arrays.sort(sortFail);

        for(int i = 0; i<N; i++){
            answer[i] = Arrays.stream(fail).boxed().collect(Collectors.toList())
                    .indexOf(sortFail[i]) + 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = solution(5,arr);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] +" ");
        }
    }
}
