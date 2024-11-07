package baekjoon.samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 시험장의 개수
        long[] arr = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken()); // 감독관 담당인원(한 교실에 1명)
        int C = Integer.parseInt(st.nextToken()); // 부감독관 담당인원(여러명 가능)

        long result = 0;

        for (int i = 0; i < N; i++) {
            long num = arr[i] - B;
            result ++;
            if (num <= 0) {
                continue;
            }
            if (num % C == 0) {
                result += (int)num / C;
            } else {
                result += (int)num / C + 1;
            }
        }
        System.out.println(result);
    }
}
