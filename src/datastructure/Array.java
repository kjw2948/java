package datastructure;

public class Array {
    int[] arr;
    // 배열의 초기 사이즈 생성
    Array(int size){
        this.arr = new int[size];
    }
    // 배열에 데이터 삽입
    public void insertData(int index, int data) {
        if(index<0 || index> this.arr.length){
            System.out.println("Index Error");
            return;
        }
        int[] arrDup = this.arr.clone();
        this.arr = new int[this.arr.length+1];
        for (int i = 0; i < this.arr.length; i++) {
            if(i<index){
                this.arr[i] = arrDup[i];
            }
            else if(i==index){
                this.arr[i] = data;
            }
            else {
                this.arr[i] = arrDup[i-1];
            }
        }
    }
    // 배열에서 특정 데이터 삭제
    public void removeData(int data){
        int targetIndex = -1;
        int[] arrDup = this.arr.clone();
        this.arr = new int[arr.length-1];

        for (int i = 0; i < arrDup.length; i++) {
            if(arrDup[i] == data){
                targetIndex = i;
                break;
            }
        }
        if(targetIndex == -1){
            System.out.println("해당 데이터가 없습니다");
        }
        else {
            for (int i = 0; i < targetIndex; i++) {
                this.arr[i] = arrDup[i];
            }
            for (int i = targetIndex; i < this.arr.length; i++) {
                this.arr[i] = arrDup[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Array arr1 = new Array(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr1.arr[i] = arr[i];
        }
        arr1.insertData(5,6);
        for (int i = 0; i < arr1.arr.length; i++) {
            System.out.print(arr1.arr[i]);
        }
        System.out.println("");
        arr1.removeData(3);
        for (int i = 0; i < arr1.arr.length; i++) {
            System.out.print(arr1.arr[i]);
        }
    }
}
