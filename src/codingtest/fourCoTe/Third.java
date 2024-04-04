package codingtest.fourCoTe;

import java.util.ArrayList;

public class Third {
    public static String[][] solution(String[] words, String[] queries) {
        String[][] answer;
        ArrayList<String[]> result = new ArrayList<>();
            for (int j = 0; j < queries.length; j++) {
                ArrayList<String> strList = new ArrayList<>();
                for (int i = 0; i < words.length; i++) {
                    String s = queries[j];
                    boolean check = true;
                    if (s.length() == words[i].length()) {
                        for (int k = 0; k < s.length(); k++) {
                            if (s.charAt(k) == '?' || words[i].charAt(k) == s.charAt(k)) {
                                continue;
                            }
                            check = false;
                        }
                        if (check) {
                            strList.add(words[i]);
                        }
                    }
                }
                result.add(strList.stream().toArray(String[]::new));
            }
        return answer = result.stream().toArray(String[][]::new);
    }

    public static void main(String[] args) {

    }
}
