package samsung.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 1; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N + 1];
            st = new StringTokenizer(br.readLine());
            int index = 1;
            int sum = 0;
            while (st.hasMoreTokens()) {
                arr[index++] = Integer.parseInt(st.nextToken());
            }
            for (int j = 3; j < N - 1; j++) {
                if (j == 3) {
                    if (arr[j] > arr[j + 1] && arr[j] > arr[j + 2]) {
                        int max = Integer.MAX_VALUE;
                        for (int k = 1; k <= 2; k++) {
                            if (max > arr[j] - arr[j + k]) {
                                max = arr[j] - arr[j + k];
                            }
                        }
                        sum += max;
                    }
                    continue;
                }
                if (j == N - 2) {
                    if (arr[j] > arr[j - 1] && arr[j] > arr[j - 2]) {
                        int max = Integer.MAX_VALUE;
                        for (int k = -2; k <= -1; k++) {
                            if (max > arr[j] - arr[j + k]) {
                                max = arr[j] - arr[j + k];
                            }
                        }
                        sum += max;
                    }
                    continue;
                }
                    if (arr[j] > arr[j - 1] && arr[j] > arr[j - 2] && arr[j] > arr[j + 1] && arr[j] > arr[j + 2]) {
                        int max = Integer.MAX_VALUE;
                        for (int k = -2; k <= 2; k++) {
                            if(k==0){
                                continue;
                            }
                            if (max > arr[j] - arr[j + k]) {
                                max = arr[j] - arr[j + k];
                            }
                        }
                        sum += max;
                    }
                }
            sb.append("#").append(i).append(" ").append(sum).append("\n");
            }
        System.out.println(sb.toString());
        }
    }
