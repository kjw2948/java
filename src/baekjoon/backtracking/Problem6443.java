package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem6443 {
    static char[] str;
    static int[] visit = new int[26];
    static void dfs(int x, int len)
    {
        if(x==len)
        {
            System.out.println(str);
        }
        else
        {
            for(int i=0; i<26; i++)
            {
                if(visit[i] > 0)
                {
                    visit[i]--;
                    str[x] = (char)(i + 'a');
                    dfs(x+1, len);
                    visit[i]++;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++)
        {
            String x = br.readLine();
            str = new char[x.length()];
            for(int j=0; j<x.length(); j++)
            {
                visit[x.charAt(j) - 'a']++;
            }
            dfs(0, x.length());
            Arrays.fill(visit, 0);
        }
    }
}
