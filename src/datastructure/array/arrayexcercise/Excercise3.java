package datastructure.array.arrayexcercise;

public class Excercise3 {
    public static void main(String[] args) {
        int index = 0;
        int[] arr = {3,1,2,6,2,2,5,1,9,10,1,11};
        int[] sol = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                if(arr[i]>arr[i+1]){
                    sol[index++] = arr[i];
                    i++;
                }
            }
            else if(i==arr.length-1){
                if(arr[i]>arr[i-1]){
                    sol[index++] = arr[i];
                }
            }
            else{
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    sol[index++] = arr[i];
                }
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(sol[i] + "\t");
        }
    }
}
