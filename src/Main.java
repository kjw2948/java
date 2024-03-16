import java.util.ArrayList;

public class Main {
    public static String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        for (int i = 0; i < str.length(); i++) {
            int c = (int) str.charAt(i) + '1';
            answer += (char) c;
        }
        return answer;
    }
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution(age));
    }
}
