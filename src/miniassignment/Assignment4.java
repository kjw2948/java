package miniassignment;
import java.util.Scanner;
import java.util.Random;
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int random_num = random.nextInt(999999)+1;
        System.out.println("[주민등록번호 계산]");
        // 년도 입력
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        // 월 입력
        System.out.print("출생월을 입력해 주세요.(mm):");
        String month = String.format("%02d", sc.nextInt());
        // 일 입력
        System.out.print("출생일을 입력해 주세요:(dd):");
        String day = String.format("%02d", sc.nextInt());
        // 성별 입력
        System.out.print("성별을 입력해 주세요:(m/f):");
        char gender = sc.next().charAt(0);
        //생성로직
        year %= 100; // 앞자리 생성 ex) 2021 -> 21
        String gender_num = (gender == 'm') ? "3" : "4";

        System.out.println(year+month+day+"-"+gender_num+random_num);
    }
}
