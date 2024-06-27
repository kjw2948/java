package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem12919 {
    static boolean isValid;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder S =  new StringBuilder(br.readLine());
        String T = br.readLine();


        SandT(S, T);
        if (isValid) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }


    }
    static void SandT(StringBuilder S, String T) {
        if (S.toString().equals(T)) {
            isValid = true;
            return;
        }
        if (T.length() <= S.length()) {
            return;
        }
        StringBuilder S2 = new StringBuilder(S);

        S.append("A");
        S2.append("B");
        S2.reverse();

        SandT(S, T);
        SandT(S2, T);
    }
}
