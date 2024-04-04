package codingtest.fourCoTe;

import java.util.*;

public class First {
    public static String[][] solution(String[] titles, String[] lyrics, String[] problems) {
        String[][] answer;
        ArrayList<String[]> result = new ArrayList<>();

        for (String problem : problems) {
            int length = problem.length();
            ArrayList<String> strList = new ArrayList<>();
            int count = 0;
            for (int i = 0; i < lyrics.length; i++) {
                String str = lyrics[i].substring(0, length);
                if(str.equals(problem)){
                    strList.add(titles[i]);
                    count++;
                }
                if(i== lyrics.length-1 && count ==0){
                    strList.add("");
                }
            }
            result.add(strList.stream().toArray(String[]::new));
        }
        return answer = result.stream().toArray(String[][]::new);
    }

    public static void main(String[] args) {
        String[] lyrics = {"산다는게다그런거지누구나빈손으로와...(후략)", "아기상어뚜루루뚜루귀여운뚜루루뚜루...(후략)", "개울가에올챙이한마리꼬물꼬물헤엄치다...(후략)", "산다는건다그런거래요힘들고아픈날도많지만...(후략)"};
        String[] titles = {"아모르파티", "아기상어", "올챙이와개구리", "산다는건"};
        String[] problems = {"산다", "아기상어", "올챙이"};
        String[][] answer = solution(titles, lyrics, problems);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] +" ");
            }
            System.out.println(" ");
        }
    }
}
