package miniassignment;
import java.time.chrono.ChronoLocalDate;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
public class Assignment5 {
    public static void getCalender(int year, int month){
        LocalDate localDate = LocalDate.of(year, month, 1);
        int day=localDate.getDayOfWeek().getValue();  // 월:1 ~ 일:7
        System.out.println("["+year+"년 "+month+"월]");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int j = 0; j < day%7; j++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= localDate.lengthOfMonth(); i++) {
            if(day%7!=6) {
                System.out.print(String.format("%02d", i)+"\t");
            }
            else{
                System.out.println(String.format("%02d", i));
            }
            day++;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        //System.out.print("달력의 년도를 입력해주세요:(yyyy):");
        //int year = sc.nextInt();
        //System.out.print("달력의 월을 입력해주세요.(mm):");
        //int month = sc.nextInt();
        int year=2023;
        int month=10;
        getCalender(year, month);
    }
}
