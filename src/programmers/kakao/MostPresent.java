package programmers.kakao;

import java.io.BufferedReader;
import java.util.Collections;
import java.util.HashMap;
public class MostPresent {
    public static int solution(String[] friends, String[] gifts) {
        HashMap<String , Integer> present = new HashMap();
        int[][] arr = new int[friends.length][2];
        for (int i = 0; i < arr.length; i++) {

        }

        for (int i = 0; i < gifts.length; i++) {
            String[] str = gifts[i].split(" ");
            present.put(str[0], present.getOrDefault(str[0], 0) + 1);
            present.put(str[1], present.getOrDefault(str[1], 0) - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi",
                "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(solution(friends, gifts));

    }
}
