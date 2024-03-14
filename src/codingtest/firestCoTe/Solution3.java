package codingtest.firestCoTe;

public class Solution3 {
    public static int combination(int N, int num_one) {
        int answer = 1;
        if(num_one<0){
            return 0;
        }
        for (int i = N; i > N-num_one; i--) {
            answer *= i;
        }
        for (int i = 1; i <= num_one; i++) {
            answer /= i;
        }
        return answer + combination(N-1, num_one-2);
    }
    public static int solution(int N) {
        int answer = 0;
        answer = combination(N, N);
        return answer;
    }

    public static void main(String[] args) {
        String[] names = {""};
        int N = 6;
        System.out.println(solution(N));
    }
}
