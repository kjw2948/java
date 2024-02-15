package datastructure.array.arrayexcercise;

public class Excercise1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 100, 1, 1 ,1 ,100};
        int index = -1;
        int target = 1;
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i] == target){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("해당 target이 없습니다");
        }
        else{
            System.out.println(index);
        }
    }
}
