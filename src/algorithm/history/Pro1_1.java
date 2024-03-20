package algorithm.history;

public class Pro1_1 {

    public static void main(String[] args) {
        int[] appletrees = {10,10,20,20,30,30};
        int a = 5;
        int b = 3;
        int answer = 0;
        for (int i = 0; i < appletrees.length; i++) {
            if (appletrees[i] - a <= 0) {
                answer += 1;
            } else {
                if ((appletrees[i] - a) % b == 0) {
                    answer += ((appletrees[i] - a) / b) + 1;
                } else {
                    answer += ((appletrees[i] - a) / b) + 2;
                }
            }
        }
        System.out.println(answer);
    }
}
