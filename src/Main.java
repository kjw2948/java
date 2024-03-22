import java.util.*;

public class Main {
    public static int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<numbers.length; i++){
            set.add(numbers[i]);
        }
        int[] number = new int[set.size()];
        int[] answer = new int[set.size()*(set.size()-1)/2];
        Iterator<Integer> iter1 = set.iterator();
        int index = 0;
        while (iter1.hasNext()) {
            number[index++] = iter1.next();
        }
        index = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                answer[index++] = number[i] + number[j];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,1};
        int[] answer = solution(arr);
    }
}
