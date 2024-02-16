package baekjoon.bronze;
import java.util.Scanner;
public class Problem10988 {
    public static int solution(String str){
        boolean result = true;
        for (int i = 0; i <str.length()/2 ; i++) {
            if(str.charAt(i)==str.charAt(str.length()-1-i)) {result = true;}
            else{
                result = false;
                break;
            }
        }
        return (result == true) ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.next()));
    }
}


/*
import java.util.Scanner;
public class Problem10988 {
    public static boolean solution(String str){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}*/