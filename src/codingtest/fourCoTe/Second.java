package codingtest.fourCoTe;

public class Second {
    public static int[] solution(String[] words, String[] queries) {
        int[] answer = new int[queries.length];
        int[] str = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            if(queries[i].charAt(0)=='*') {
                String str1 = queries[i].substring(1, queries[i].length());
                for (int j = 0; j < words.length; j++) {
                    if(words[j].length()<str1.length()){
                        continue;
                    }
                    if (words[j].substring(words[j].length() - str1.length(), words[j].length()).equals(str1)) {
                        answer[i]++;
                    }
                }
            }
            else if(queries[i].charAt(queries[i].length()-1)=='*'){
                String str1 = queries[i].substring(0,queries[i].length()-1);
                for (int j = 0; j < words.length; j++) {
                    if(words[j].length()<str1.length()){
                        continue;
                    }
                    if (words[j].substring(0, str1.length()).equals(str1)) {
                        answer[i]++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "hell", "good", "goose", "children", "card", "teachable"};
        String[] queries = {"hell*", "goo*", "*able", "qua*"};
        String[] words1 = {"zero", "base", "students", "are", "the", "best"};
        String[] queries1 = {"z*", "*e", "s*"};
        int[] answer = solution(words1, queries1);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
