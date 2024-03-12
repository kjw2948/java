package surpriseAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mission1_2 {
    static double MAX_VALUE = 1.7976931348623157E308;
    public static double getDistance(int my_x, int my_y, int x, int y) {
        double result = Math.sqrt((Math.pow(my_x - x, 2) + Math.pow(my_y - y, 2)));
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double min = MAX_VALUE;
        int[][] arr = new int[10][2];
        double[] result = new double[10];
        int idx = 0;

        System.out.println("내 좌표 x값을 입력해주세요.");
        int my_x = Integer.parseInt(br.readLine());
        System.out.println("내 좌표 y값을 입력해주세요.");
        int my_y = Integer.parseInt(br.readLine());
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+"/10번째 입력");
            System.out.println("임의의 좌표 x값을 입력해주세요");
            int x = Integer.parseInt(br.readLine());
            System.out.println("임의의 좌표 y값을 입력해주세요");
            int y = Integer.parseInt(br.readLine());
            arr[i][0] = x;
            arr[i][1] = y;
            result[i] = getDistance(my_x, my_y, x, y);
            if (min > result[i]) {
                min = result[i];
                idx = i;
            }
            // 겹치는 내용 check
            for (int j = 0; j < i; j++) {
                if(x==arr[j][0] && y==arr[j][1]){
                    System.out.println("동일한 좌표가 존재합니다. 다른 좌표를 입력해주세요.");
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d, %d) => %.6f\n",arr[i][0],arr[i][1], result[i]);
        }
        System.out.println("제일 가까운 좌표: ");
        System.out.printf("(%d, %d) => %.6f\n",arr[idx][0], arr[idx][1], min);
    }
}
