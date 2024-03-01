package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Hash3 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> hm = new HashMap();
        for (int i = 0; i < phone_book.length; i++) {
            hm.put(phone_book[i], i);
        }
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (hm.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
