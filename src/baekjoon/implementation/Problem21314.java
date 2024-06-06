package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem21314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mk = br.readLine();

        String[] mkArray = mk.split("K");

        String max = "";
        String min = "";
        boolean checkLastK;
        if (mk.charAt(mk.length() - 1) == 'K') {
            checkLastK = true;
        }else{
            checkLastK = false;
        }

        System.out.println(mkArray.length);

        for (int i = 0; i < mkArray.length; i++) {
            int len = mkArray[i].length();
            if (len == 0) {
                min += "5";
                max += "5";
                continue;
            }
            String num = "1";
            for (int j = 0; j < len-1; j++) {
                num += "0";
            }
            if (!checkLastK && i == mkArray.length-1) {
                min += num;
                max += num;
                break;
            }
            min += num + "5";
            num += "0";
            max += num.replace('1', '5');
        }

        System.out.println(max);
        System.out.println(min);
    }
}
