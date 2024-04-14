package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem20546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int money = N;
        int stuck = 0; // 주식 수
        int jh = 0; // 준현이 돈
        int sm = 0; // 성민이 돈

        int[] arr = new int[14];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 14; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 준현이 로직
        for (int i = 0; i < 14; i++) {
            if(money >= arr[i]){
                int n = money / arr[i];
                stuck += n;
                money -= arr[i]*n;
            }
        }
        jh = (stuck * arr[13]) + money;

        //성민이 로직
        money = N;
        stuck = 0;
        int up = 0;
        int down = 0;
        for (int i = 1; i < 14; i++) {
            if(down>=2){
                if(money>=arr[i]){
                    int stuck1 = money / arr[i];
                    stuck += stuck1;
                    money -= stuck1 * arr[i];
                }
            }
            if(up>=2){
                money += stuck * arr[i];
                stuck = 0;
            }
            if(arr[i-1]>arr[i]){
                down ++;
                up = 0;
            } else if(arr[i-1]==arr[i]){
                up = 0;
                down = 0;
            }else{
                up ++;
                down = 0;
            }
        }
        sm = money + (stuck*arr[13]);
        System.out.println(jh);
        System.out.println(sm);

        if(jh>sm){
            System.out.println("BNP");
        }else if(jh<sm){
            System.out.println("TIMING");
        }else{
            System.out.println("SAMESAME");
        }
    }
}
