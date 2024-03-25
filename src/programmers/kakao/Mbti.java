package programmers.kakao;

import java.util.HashMap;
public class Mbti {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> result = new HashMap<>();
        char[] mbti = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for (int i = 0; i < mbti.length; i++) {
            result.put(mbti[i], 0);
        }
        for (int i = 0; i < choices.length; i++) {
            switch(choices[i]){
                case 1 :
                    result.put(survey[i].charAt(0), result.get(survey[i].charAt(0)) + 3);
                    break;
                case 2 :
                    result.put(survey[i].charAt(0), result.get(survey[i].charAt(0)) + 2);
                    break;
                case 3 :
                    result.put(survey[i].charAt(0), result.get(survey[i].charAt(0)) + 1);
                    break;
                case 5 :
                    result.put(survey[i].charAt(1), result.get(survey[i].charAt(1)) + 1);
                    break;
                case 6 :
                    result.put(survey[i].charAt(1), result.get(survey[i].charAt(1)) + 2);
                    break;
                case 7 :
                    result.put(survey[i].charAt(1), result.get(survey[i].charAt(1)) + 3);
                    break;
            }
        }
        char a = ' ';
        for (int i = 0; i < mbti.length; i++) {
            if(i%2==1){
                if(result.get(a)>=result.get(mbti[i])){
                    answer += a;
                }else{
                    answer += mbti[i];
                }
            }else {
                a = mbti[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        //rt cf jm an
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution(survey, choices));
    }
}
