package samsung.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2072 {

    public static void main(String[] args) throws Exception, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            while (st.hasMoreTokens()) {
                int n = Integer.parseInt(st.nextToken());
                if(n%2==1){
                    sum += n;
                }
            }
            sb.append("#" + (i + 1) + " ").append(sum + "\n");
        }
        System.out.println(sb.toString());
    }
}
