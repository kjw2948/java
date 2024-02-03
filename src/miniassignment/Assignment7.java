package miniassignment;
//@author 김정원
import java.util.Random;
import java.util.Scanner;

public class Assignment7 {
    // 로또 생성 함수
    public static int[] lotto() {
        Random rd = new Random();
        int[] lottoArray = new int[6];
        int temp = 0;

        for (int i = 0; i < 6; i++) {
            lottoArray[i] = rd.nextInt(45) + 1;
            //중복된 값들 제거하기
            for (int j = 0; j < i; j++) {
                if (lottoArray[i] == lottoArray[j]) {
                    i--;
                    break;
                } else if (lottoArray[i] < lottoArray[j]) {
                    temp = lottoArray[i];
                    lottoArray[i] = lottoArray[j];
                    lottoArray[j] = temp;
                }
            }
        }
        return lottoArray;
    }
    // 일치 갯수 구하는 함수
    public static int checkLotto(int[] lottoArray, int[] winner){
        int count = 0;
        for (int i = 0; i < lottoArray.length; i++) {
            for (int j = i; j < winner.length; j++) {
                if(lottoArray[i]==winner[j]){count++;}
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[로또 당첨 프로그램]");
        System.out.print("로또 개수를 입력해 주세요:(숫자 1~10):");
        int num = sc.nextInt();
        int[][] lottoArray = new int[num][5];
        int[] winner = lotto();
        //로또 출력
        for (int i = 0; i < num; i++) {
            lottoArray[i] = lotto();
            System.out.print((char)(i+65)+ "\t");
            for (int j = 0; j < 6; j++) {
                System.out.print(String.format("%02d",lottoArray[i][j]));
                if(j==5){break;}
                System.out.print(",");
            }
            System.out.println("");
        }
        System.out.println("");
        //당첨 로또 출력
        System.out.println("[로또 발표]");
        for (int i = 0; i < 6; i++) {
            System.out.print(String.format("%02d",winner[i]));
            if(i==5){
                System.out.println(" ");
                break;
            }
            System.out.print(",");
        }
        // 결과 출력
        System.out.println("[내 로또 결과]");
        for (int i = 0; i < num; i++) {
            int count = checkLotto(lottoArray[i], winner);
            System.out.print((char)(i+65)+ "\t");
            for (int j = 0; j < 6; j++) {
                System.out.print(String.format("%02d",lottoArray[i][j]));
                if(j==5){break;}
                System.out.print(",");
            }
            System.out.println(" => "+ count +"개 일치");
        }
    }
}
