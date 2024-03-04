package programmers.hash;

import java.util.*;

public class OnlyOneChar {
    public static String solution(String s) {
        String answer = "";
        HashMap<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!result.containsKey(s.charAt(i))){
                result.put(s.charAt(i), 1);
            }else{
                result.put(s.charAt(i), result.get(s.charAt(i))+1);
            }
        }
        List<Character> list = new ArrayList<>(result.keySet());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if(result.get(list.get(i))==1){
                answer += list.get(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = "qwerty";
        System.out.println(solution(s));
    }
}
