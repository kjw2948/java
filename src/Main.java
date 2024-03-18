import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] morseArr = letter.split(" ");
        for (String s : morseArr) {
            for (int i = 0; i < morse.length; i++) {
                if (s.equals(morse[i])) {
                    answer += Character.toString(i + 'a');
                }
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
