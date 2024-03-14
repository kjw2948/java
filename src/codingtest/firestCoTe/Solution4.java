package codingtest.firestCoTe;

public class Solution4 {
    static int answer = 1;
    public static int check(int size, int start_row, int start_col, int i, int j) {
        //1번 구역
        if (i >= start_row && i < start_row + size/2  && j >= start_col+ size/2 && j < start_col+size) {
            check(size / 2, start_row, start_col + size / 2, i, j);
        }
        //2번 구역
        if (i >= start_row && i < start_row + size/2 && j >= start_col && j < start_col + size/2) {
            answer += size*size/4;
            check(size / 2, start_row, start_col, i, j);
        }
        //3번 구역
        if (i >= start_row+ size/2 && i < start_row+size && j >= start_col && j < start_col + size/2) {
            answer += size*size/4 * 2;
            check(size / 2, start_row + size / 2, start_col, i, j);
        }
        //4번 구역
        if (i >= start_row+ size/2 && i < start_row+size && j >= start_col+ size/2 && j < start_col+size) {
            answer += size*size/4*3;
            check(size / 2, start_row + size / 2, start_col + size / 2, i, j);
        }
        if (start_row == i && start_col == j) {
            return answer;
        }
        return 0;
    }

    public static int solution(int n, int i, int j) {
        check(n, 0, 0, i, j);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(4,1,3));
    }
}
