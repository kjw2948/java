package datastructure.array.arrayexcercise;
// 2차원 배열 시계방향 회전
public class Excercise6 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int row = arr.length;
        int col = arr[0].length;
        int[][] arrResult = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arrResult[j][i] = arr[row-i-1][j];
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arrResult[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
