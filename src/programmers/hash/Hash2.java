package programmers.hash;

import java.util.HashMap;
public class Hash2 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : participant) {
            hm.put(s, hm.getOrDefault(s,0)+1);
        }
        for (String s : completion) {
            hm.put(s,hm.get(s)-1);
        }
        for (String s : hm.keySet()) {
            if(hm.get(s)!=0){
                answer = s;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] arr1 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] arr2 ={"josipa", "filipa", "marina", "nikola"};
        System.out.println(solution(arr1, arr2));
    }
}
