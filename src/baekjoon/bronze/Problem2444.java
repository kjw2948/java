package baekjoon.bronze;
import java.util.Scanner;
public class Problem2444 {
    public static void solution(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = N-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j<2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = N-1; i > 0; i--) {
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            for (int j = i*2-1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextInt());
    }
}
