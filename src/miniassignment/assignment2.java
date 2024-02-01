package miniassignment;
import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액): ");
        int payment = sc.nextInt();
        int cashback = payment / 10;

        if(cashback>=300) {cashback = 300;}
        else if(cashback>=200) {cashback = 200;}
        else if(cashback>=100) {cashback = 100;}
        else cashback = 0;

        System.out.println("결제금액은 " +payment + "원이고, 캐시백은 " + cashback +"원 입니다.");
    }
}
