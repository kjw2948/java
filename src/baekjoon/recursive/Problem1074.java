package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1074 {
    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, N);

        cal(0, 0, r, c, size);
        System.out.println(result);
    }
    public static void cal(int x, int y, int r, int c, int size) {
        if (x == r && y == c) {
            return;
        }

        if(r<x+size/2 && c<y+size/2){ //1사분면
            cal(x, y, r, c, size / 2);

        }else if(r<x+size/2 && c>=y+size/2) { //2사분면
           result += size*size/4;
           cal(x , y + size/2, r, c, size / 2);
        } else if (r >= x+size/2 && c < y+size/2) { //3사분면
            result += size*size/4*2;
            cal(x+ size/2, y , r, c, size / 2);
        } else { //4사분면
            result += size*size/4*3;
            cal(x + size/2, y + size/2, r, c, size / 2);
        }
    }
}
