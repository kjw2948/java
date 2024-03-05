package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5613 {
    public static int solution() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(bf.readLine());
        while(true){
            String str = bf.readLine();
            if (str.equals("=")) {
                break;
            }
            switch(str){
                case "+" :
                    answer += Integer.parseInt(bf.readLine());
                    break;
                case "-" :
                    answer -= Integer.parseInt(bf.readLine());
                    break;
                case "*" :
                    answer *= Integer.parseInt(bf.readLine());
                    break;
                case "/" :
                    answer /= Integer.parseInt(bf.readLine());
                    break;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException{
        System.out.println(solution());
    }
}
