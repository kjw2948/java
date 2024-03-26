package programmers.dfsbfs;

public class MinimumRectangle {
    public static int solution(int[][] sizes) {
        int answer = 0;
        int max = sizes[0][0];
        int index = 0; // 최댓값 위치 인덱스를 찾기 위함
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length; j++) {
                if(max<sizes[i][j]){
                    max = sizes[i][j];
                    index = j;
                }
            }
        }
        for (int i = 0; i < sizes.length; i++) {
            if (index == 0) {
                if (sizes[i][0] < sizes[i][1]) {
                    int tmp = sizes[i][1];
                    sizes[i][1] = sizes[i][0];
                    sizes[i][0] = tmp;
                }
            } else {
                if (sizes[i][0] > sizes[i][1]) {
                    int tmp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = tmp;
                }
            }
        }
        int width = 0;
        int length = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0]>width){
                width = sizes[i][0];
            }
            if (sizes[i][1] > length) {
                length = sizes[i][1];
            }
        }
        return answer = width * length;
    }
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }
}
