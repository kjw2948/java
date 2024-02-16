package baekjoon.bronze;
import java.util.Scanner;
public class Problem5622 {
    public static int solution(String str){
        int sol = 0;
        for (int i = 0; i < str.length(); i++) {
            if(((int)str.charAt(i) + 1) /3 == 22){
                sol += 3;
            }
            else if(((int)str.charAt(i) + 1) /3 == 23){
                sol += 4;
            }
            else if(((int)str.charAt(i) + 1) /3 == 24){
                sol += 5;
            }
            else if(((int)str.charAt(i) + 1) /3 == 25){
                sol += 6;
            }
            else if(((int)str.charAt(i) + 1) /3 == 26){
                sol += 7;
            }
            else if(((int)str.charAt(i)) /4 == 20){
                sol += 8;
            }
            else if(((int)str.charAt(i)) /3 == 28){
                sol += 9;
            }
            else {
                sol += 10;
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
