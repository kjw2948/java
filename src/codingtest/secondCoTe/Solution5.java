package codingtest.secondCoTe;


public class Solution5 {
    // static int[][] pos = {{-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {0, 0}, {0, 1}, {1, 0}, {1, 1}, {1, -1}};
    static int[][] board;
    static boolean[][] visit;
    public static int[][] solution(int[][] image, int K) {
        int length = image.length;
        int[][] answer = new int[length][length];

        board = new int[length+(K/2)*2][length+(K/2)*2];
        // board 작성
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i < K/2  || i >= board.length - K/2 || j < K/2  || j >= board.length - K/2) {
                    board[i][j] = 0;
                } else {
                    board[i][j] = image[i - K/2][j - K/2];
                }
            }
        }
        int index = 0;
        int[][] pos = new int[K * K][2];
        // pos 작성
        for (int i =  - K / 2; i <=  K / 2; i++) {
            for (int j = - K / 2; j <=  K / 2; j++) {
                pos[index][0] = i;
                pos[index][1] = j;
                index++;
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int sum = 0;
                for (int k = 0; k < pos.length; k++) {
                    int x = i+K/2 + pos[k][0];
                    int y = j+K/2 + pos[k][1];
                    sum += board[x][y];
                }
                answer[i][j] = sum / (K*K);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[][] image = {{4, 5, 2, 6, 7}, {5, 4, 2, 4, 6}, {6, 8, 4, 8, 7}, {7, 3, 6, 6, 4}, {5, 0, 4, 1, 5}};
        int K =3;
        int[][] answer = solution(image, K);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] +" ");
            }
            System.out.println("");
        }
    }
}
