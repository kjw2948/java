package programmers.greedy;
// 체육복 문제
public class Greedy1 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer ++;
                    reserve[j] = -100;
                    lost[i] = -300;
                    break;
                }
            }
        }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(reserve[j]+1 == lost[i] ||reserve[j]-1 == lost[i] ){
                    answer ++;
                    reserve[j] = -200;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n =5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(solution(n, lost, reserve));
    }
}
