import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '0') {
                answer += "5";
            } else if (rsp.charAt(i) == '2') {
                answer += "0";
            } else {
                answer += "2";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int age = 23;
        int[] emergency = {3, 17, 6};
        System.out.println(solution(".... . .-.. .-.. ---"));
    }
}
