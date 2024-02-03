package miniassignment;
//@author 김정원
import java.util.Scanner;
public class Assignment8 {
    //세금과율 메소드
    public static int tax(int income, int[] taxRatio, int[] taxMoney) {
        int tax = 0;
        int index = 0;
        // 구간 산정
        for (int i = 1; i < taxRatio.length; i++) {
            if(income - taxMoney[i]>0) {
                index++;
            }
        }
        //세금계산
        if(index==0){
            System.out.println(String.format("%10d", income) + " * " + String.format("%2d", taxRatio[index]) + "%" + " =" + String.format("%11d", income/100*taxRatio[index]));
            tax = income / 100 * taxRatio[index];
        }
        else {
            for (int i = 0; i <= index; i++) {
                if (i == index) {
                    System.out.println(String.format("%10d", (income - taxMoney[i])) + " * " + String.format("%2d", taxRatio[i]) + "%"
                            + " =" + String.format("%11d", (income - taxMoney[i]) / 100 * taxRatio[i]));
                    tax += (income - taxMoney[i]) / 100 * taxRatio[i];
                } else {
                    System.out.println(String.format("%10d", (taxMoney[i + 1] - taxMoney[i])) + " * " + String.format("%2d", taxRatio[i]) + "%"
                            + " =" + String.format("%11d", (taxMoney[i + 1] - taxMoney[i]) / 100 * taxRatio[i]));
                    tax += (taxMoney[i + 1] - taxMoney[i]) / 100 * taxRatio[i];
                }
            }
        }
        return tax;
    }
    //누진공제 메소드
    public static int dedTax(int income, int[] taxRatio, int[] taxMoney, int[]dedMoney){
        int tax = 0;
        int index = 0;
        //구간 산정
        for (int i = 1; i < taxRatio.length; i++) {
            if(income - taxMoney[i]>0) {
                index++;
            }
        }
        //세금계산
        if(index==0){
            tax = income /100 * taxRatio[index];
        }
        else{
            tax = income /100  * taxRatio[index] - dedMoney[index];
        }
        return tax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] taxRatio = {6, 15, 24, 35, 38, 40, 42, 45};
        int[] taxMoney = {0, 12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000};
        int[] dedMoney = {0, 1080000, 5220000, 14900000, 25400000, 35400000, 65400000};
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.: ");
        int income = sc.nextInt();
        int totalTax = tax(income, taxRatio, taxMoney);
        int dedTax = dedTax(income, taxRatio, taxMoney, dedMoney);

        System.out.println("[세율에 의한 세금]:\t\t "+ String.format("%12d",totalTax));
        System.out.println("[누진공제 계산에 의한 세금]:"+ String.format("%12d",dedTax));
    }
}
