package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem106 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken()); // target
        int N = Integer.parseInt(st.nextToken());

        int[] cost = new int[C+1];
        List<Hotel> hotels = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int money = Integer.parseInt(st.nextToken());
            int people = Integer.parseInt(st.nextToken());

            hotels.add(new Hotel(money, people));
        }
        for (int i = 1; i < cost.length; i++) {
            int count = 0;
            for (int j = 0; j < hotels.size(); j++) {
                int num = i - hotels.get(j).getPeople();
                if (num < 0) {
                    count ++;
                    continue;
                }
                if(cost[i] == 0){
                    cost[i] = cost[num] + hotels.get(j).getMoney();
                }
            }
        }
    }

    static class Hotel {
        int money;
        int people;

        Hotel(int money, int people) {
            this.money = money;
            this.people = people;
        }

        public int getMoney() {
            return this.money;
        }

        public int getPeople() {
            return this.people;
        }
    }
}
