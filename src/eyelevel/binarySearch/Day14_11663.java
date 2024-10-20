package eyelevel.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day14_11663 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // Input 입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] point = new int[N + 1];
        st = new StringTokenizer(br.readLine());

        // N개의 점 저장
        for (int i = 1; i <= N ; i++) {
            point[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int left = 1;
            int right = N;
            int sIdx = left;
            int eIdx = right;

            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            while (left <= right) {
                int mid = (left + right) / 2;
                if (point[mid] == start || left == right) {
                    sIdx = mid;
                    break;
                } else if (point[mid] < start) {
                    left = mid + 1;
                    sIdx = mid;
                } else {
                    right = mid;
                }
            }
            System.out.println("sIdx = " + sIdx);
            left = sIdx;
            right = N;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (point[mid] == end) {
                    eIdx = mid;
                    break;
                } else if (point[mid] < end) {
                    left = mid + 1;
                } else {
                    right = mid;
                    eIdx = mid - 1;
                }
                if (left == right) {
                    break;
                }
            }
            System.out.println("eIdx = " + eIdx);;

            if ( sIdx>eIdx  || (sIdx == eIdx && point[eIdx] > end)) {
                System.out.println(0);
            }else {
                System.out.println(eIdx - sIdx + 1);
            }
        }

    }
}
