package eyelevel.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day16_2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] solutions = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n개의 용액을 저장
        for(int i = 0; i<n; i++){
            solutions[i] = Integer.parseInt(st.nextToken());
        }
        int left = 0;
        int right = n-1;
        // 0에 가장 가까운 용액값을 저장할 변수
        int answer = Integer.MAX_VALUE;
        // 첫번째 용액 , 두번째 용액값을 저장할 변수
        int solution1 = 0, solution2 = 0;

        while(left < right){
            // 왼쪽 , 오른쪽 용액의 합을 구하고
            int sum = solutions[left] + solutions[right];
            // answer와 sum을 비교합니다. |sum| < |answer| 인 경우 0에 더 가까운 값이 바뀌었다는 뜻
            if(Math.abs(sum) < Math.abs(answer)){
                // answer를 sum으로 바꿔주고
                answer = sum;
                // 해당 left, right 위치의 값을 저장합니다.
                solution1 = solutions[left];
                solution2 = solutions[right];
            }

            // sum이 0이면 문제에 정확히 부합하는 경우이므로 반복문을 나갑니다.
            if(sum == 0){
                break;
            }
            // sum 자체가 음수이면 값을 더 크게 해야하므로 left를 늘립니다.
            else if(sum < 0){
                left++;
            } else {
                right--;
            }
        }
        System.out.println(solution1 + " " + solution2);
    }
}
