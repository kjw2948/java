package baekjoon.silver;

import java.util.Scanner;

public class Problem20546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jh = 0;
        int sm = 0;
        int money = sc.nextInt();
        int smMoney = money;
        int down = 0;
        int up = 0;
        int[] stock = new int[14];
        for (int i = 0; i < stock.length; i++) {
            stock[i] = sc.nextInt();
        }
        for (int i = 0; i < stock.length; i++) {
            if(money>=stock[i]){
                jh = money/stock[i];
                money -= jh*stock[i];
            }
            if(i==stock.length-1){
                money += jh*stock[i];
            }
            if(i>=1 && i< stock.length){
                if(stock[i]>stock[i-1]){
                    up++;
                    down = 0;
                }else if(stock[i]<stock[i-1]){
                    down ++;
                    up = 0;
                } else{
                    down = 0;
                    up =0;
                }
            }
            if(smMoney >= stock[i] && down >=3){
                sm = smMoney / stock[i];
                smMoney -= stock[i]*sm;
            }
            if(up>=3){
                smMoney += sm*stock[i];
                sm = 0;
                up = 0;
            }
        }
        if (smMoney > money) {
            System.out.println("TIMING");
        } else if (smMoney < money) {
            System.out.println("BNP");
        } else {
            System.out.println("SAMESAME");
        }
    }
}
