package baekjoon.gold;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Problem25556 {
    public static void solution(int[] arr) {
        Stack<Integer>[] listStack = new Stack[4];
        for (int i = 0; i < 4; i++) {
            listStack[i] = new Stack<>();
            listStack[i].push(0);
        }
        boolean isCheck = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 4; j++) {
                if((int) listStack[j].peek() < arr[i]){
                    listStack[j].push(arr[i]);
                    break;
                }
                if(j==3 && (int) listStack[j].peek() > arr[i]){
                    isCheck = false;
                }
            }
            if(isCheck == false){
                break;
            }
        }

        if(isCheck){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        solution(arr);
    }
}
