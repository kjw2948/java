package datastructure.array.solution;

public class Excercise4Solution {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 6, 1};
        int[] visited = new int[arr.length];
        int visitCnt = 0;
        
        while (visitCnt < arr.length){
            int minVal = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]<minVal && visited[i]==0){
                    minVal = arr[i];
                    minIdx = i;
                }
            }
            System.out.print(minVal + " ");
            visited[minIdx] = 1;
            visitCnt ++;
        }
    }
}
