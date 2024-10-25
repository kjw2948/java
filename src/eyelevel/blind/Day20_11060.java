package eyelevel.blind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day20_11060 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // DP를 이용하기 위한 배열
        dp = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 결과값 출력을 위한 변수 , 최소값을 얻어야하므로 초기화는 MAX_VALUE로 한다.
        int result = Integer.MAX_VALUE;

        // N==1이면 가만히 있어도 되기때문에 예외로 추가
        if (N == 1) {
            System.out.println(0);
            return;
        }

        //DP 수행
        for (int i = 1; i <= N; i++) {
            // i번째 미로 값 저장
            int num = Integer.parseInt(st.nextToken());

            // 시작 지점이 아닌데 dp 값이 0이면 해당지점은 도달할 수 없다는 뜻
            if(i!=1 && dp[i] == 0) break;

            // 미로위치 + 값 >= N이면 오른쪽끝에 도달했다는 뜻
            if (i + num >= N) {

                // 현재위치에서 점프 한번만 더하면 되므로 dp[i]+1 과 result 비교하여 최소값 저장
                result = Math.min(result, dp[i]+1);
                continue;
            }

            // 현재위치에서 이동할 수 있는 모든곳의 값 갱신
            for (int j = i+1; j <= i+num && j<=N ; j++) {

                // 처음 방문한 곳은 현재값 + 1
                if (dp[j] == 0) {
                    dp[j] = dp[i] + 1;
                } else {
                    // 그 외에는 비교하여 최소값 저장
                    dp[j] = Math.min(dp[j], dp[i] + 1);
                }
            }
        }
        // result가 바뀌지 않았다는 것은 도달하지 못한다는 뜻
        if (result == Integer.MAX_VALUE) {
            System.out.println(-1);
        }else {
            System.out.println(result);
        }
    }
}
