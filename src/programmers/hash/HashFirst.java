package programmers.hash;

import java.util.Hashtable;

public class HashFirst {
    public static int solution(int[] arr) {
        int answer = 0;
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            if(!ht.contains(arr[i])){
                ht.put(i, arr[i]);
            }
        }
        if(ht.size()> arr.length /2){
            answer = arr.length / 2;
        } else{
            answer = ht.size();
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 2, 2, 4};
        System.out.println(solution(arr));
    }
}
