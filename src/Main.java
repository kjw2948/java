import java.util.*;

public class Main {
    public static int solution(String[] array, String s) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length()>s.length()){
                continue;
            }
            String str = s.substring(0, array[i].length());
            if(str.equals(array[i])){
                answer ++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Integer[] nums = {1,3,4,5,2};
        int num = 10;
        String[] array = {"n", "eav", "nav"};
        String s = "naver";
        System.out.println(solution(array, s));
    }
        /*public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, Integer> result = new HashMap<>();
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            result.put(arr[i], result.getOrDefault(arr[i], 0) + 1);
        }
        List<String> keySet = new ArrayList<>(result.keySet());
        Collections.sort(keySet, ((o1, o2) -> result.get(o2).compareTo(result.get(o1))));
        for (String s1 : keySet) {
            answer.append(s1).append(" ");
        }
        String answer1 = answer.toString();
        for (int i = 0; i < 10; i++) {
            if(!answer1.contains(String.valueOf(i))){
                answer1 = answer1 + String.valueOf(i) +" ";
            }
        }
        return answer1.substring(0, answer1.length() - 1);
    }
    */
        /*public static int[] solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] check = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<=nums.length){
                check[nums[i]-1]++;
            }
        }
        for (int i = 0; i < check.length; i++) {
            if(check[i]==0){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
     */
        /*
    static List<Double> nums;
    static List<Character> ops;
    static void save(String s, List<Double> nums, List<Character> ops) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                if (i == 0) {
                    nums.add(0.0);
                    ops.add(c);
                } else {
                    nums.add(Double.parseDouble(sb.toString()));
                    ops.add(c);
                }
                sb = new StringBuilder();
            }
        }
        nums.add(Double.parseDouble(sb.toString()));
    }
    static double calculate(List<Double> nums, List<Character> ops){
        if(nums.size()==1 || ops.isEmpty()){
            return nums.get(0);
        }
        if(ops.get(0)=='*'||ops.get(0)=='/'){
            double num1 = nums.remove(0);
            double num2 = nums.remove(0);
            double result = (ops.remove(0)=='*')? num1*num2 : num1/num2;
            nums.add(0, result);
            return calculate(nums, ops);
        } else if(ops.get(0)=='+'){
            double num1 = nums.remove(0);
            char ops1 = ops.remove(0);
            double result = num1 + calculate(nums, ops);
            nums.add(0, result);
            return calculate(nums, ops);
        } else{
            double num1 = nums.remove(0);
            char ops1 = ops.remove(0);
            double result = num1 - calculate(nums, ops);
            nums.add(0, result);
            return calculate(nums, ops);
        }
    }
    public static double solution(String S) {
        double answer = 0;
        nums = new ArrayList<>();
        ops = new ArrayList<>();
        save(S, nums, ops);
        answer = Math.round(calculate(nums, ops)*100)/100.0;
        return answer;
    }
    */
}