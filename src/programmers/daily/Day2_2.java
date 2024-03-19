package programmers.daily;

import java.util.Scanner;

public class Day2_2 {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);

        return answer = Integer.parseInt(str1+str2)>Integer.parseInt(str2+str1) ? Integer.parseInt(str1+str2) : Integer.parseInt(str2+str1);
    }
}
