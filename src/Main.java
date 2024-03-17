import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (int i = 0; i < morse.length; i++) {
            letter.replaceAll(morse[i], Character.toString((char)(i +'0')));
        }
        return letter;
    }
    public static void main(String[] args) {
        int age = 23;
        int[] emergency = {3, 17, 6};
        System.out.println(solution(".... . .-.. .-.. ---"));
    }
}
