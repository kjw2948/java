package codingtest.fiveCoTe;

public class Solution3 {
    public static int solution(int[] arr) {
        int answer = 0;
        int a = arr[0] - arr[1];
        int b = arr[1] - arr[2];
        if(a>0){
            return -1;
        }
        if(a<0 && b>0){
            return 1;
        }
        for (int i = 3; i < arr.length; i++) {
            if(arr[i-1]<arr[i]){
                continue;
            }
            answer = i-1;
            break;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
