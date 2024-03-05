package programmers.array;

public class ArrayRotate {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        switch(direction){
            case "left" :
                int temp = numbers[0];
                for (int i = 0; i < numbers.length-1; i++) {
                    answer[i] = numbers[i+1];
                }
                answer[numbers.length-1] = temp;
                break;
            case "right" :
                int temp2 = numbers[numbers.length-1];
                for (int i = 1; i < numbers.length; i++) {
                    answer[i] = numbers[i-1];
                }
                answer[0] = temp2;
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        String direction = "right";
        int[] answer = solution(numbers, direction);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] +" ");
        }
    }
}
