package datastructure.array.arrayexcercise;
// 배열 오름차순 정렬
public class Excercise4 {
    public static void main(String[] args) {
        int[] arr = {5,3,1,4,6,1,1,7,9,9};
        // 앞에 값이 뒤에 값보다 크면 서로 교환
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i + 1] = temp;
                for (int j = i; j > 0; j--) {
                    if(i!=0 && arr[j]<arr[j-1]){
                        int num = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = num;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        // 교환 후에 다시 비교
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.println(arr[i]);
            }
            else{
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
