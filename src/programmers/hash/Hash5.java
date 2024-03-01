package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Hash5 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Integer> map = new HashMap<>();
        //장르별 노래 검색
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
