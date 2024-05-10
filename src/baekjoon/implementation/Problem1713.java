package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 창틀 갯수
        int choose = Integer.parseInt(br.readLine()); // 전체 횟수
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] checkOld = new int[N]; //언제 들어옴?
        int[] student = new int[N]; // 학생 번호
        int[] vote = new int[N]; // 학생이 받은 추천 수

        String result = "";

        for (int i = 0; i < choose; i++) {
            int n = Integer.parseInt(st.nextToken()); // 투표 받은 학생 번호
            int changeIdx = 0;

            for (int j = 0; j < N; j++) {
                if (student[j] == 0 || student[j] == n) {
                    changeIdx = j;
                    break;
                }

                if (vote[changeIdx] > vote[j] || (vote[changeIdx] == vote[j] && checkOld[changeIdx] > checkOld[j])) {
                    changeIdx = j;
                    break;
                }
            }

            if(student[changeIdx] != n){
                vote[changeIdx] = 0;
                student[changeIdx] = n;
                checkOld[changeIdx] = i;
            }

            vote[changeIdx] ++;
        }
        Arrays.sort(student);
        for (int i = 0; i < student.length; i++) {
            if(student[i]!=0) {
                result += Integer.toString(student[i]) + " ";
            }
        }
        System.out.print(result);
    }
}
