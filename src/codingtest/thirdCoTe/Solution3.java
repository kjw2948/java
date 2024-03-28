package codingtest.thirdCoTe;

import java.util.ArrayList;

public class Solution3 {
    static ArrayList<Integer> list = new ArrayList<>();
    public static int solution(int delay, int N) {
        int answer = 1;
        int a = fibo(N, delay);
        int sum = 0;
        for (int i = 0; i < delay+1; i++) {
            list.add(1);
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        answer = 1 + sum*2;


        return answer;
    }
    public static int fibo(int n, int delay){
        if(n<=delay+1 && n>=1){
            return 1;
        }else{
            int sum = 0;
            sum = fibo(n-1,delay) + fibo(n-delay-1,delay);
            list.add(sum);
            return sum;
        }
    }


    public static void main(String[] args) {
        System.out.println(solution(2,5));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
