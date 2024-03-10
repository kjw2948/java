package programmers.dfsbfs;

public class TargetNumber {
    static int answer = 0;
    public static int solution(int[] numbers, int target) {
        int sum = 0;
        dfs(numbers, 0, target, sum);
        return answer;
    }
    public static void dfs(int[] numbers, int depth, int target, int sum) {
        if (numbers.length == depth) {
            if(target == sum) {
                answer++;
            }
        }
        else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers, target));
    }
}
