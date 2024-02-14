package datastructure.arrayexcercise;

public class Excercise5 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
        int[] arrResult = new int[arr.length];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            for (int j = 0; j < i; j++) {
                if(arr[i]==arr[j])
                    break;
                num ++;
            }
            if(i==0 || num == i){
                arrResult[cnt++] = arr[i];
            }
        }
        for (int i = 0; i < cnt; i++) {
            System.out.print(arrResult[i]+ " ");
        }
    }
}
