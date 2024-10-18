package eyelevel.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Day12_13335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int time = 0;
        int weight = 0;
        Deque<Integer> truck = new LinkedList<>(); // 트럭 정보를 순서대로 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            truck.offer(Integer.parseInt(st.nextToken()));
        }

        Deque<Integer> bridge = new LinkedList<>(); // 다리 정보를 저장
        for (int i = 0; i < W; i++) {
            bridge.offer(0);
        }

        while (!bridge.isEmpty()) {
            // 시간 증가
            time ++;
            //  weight : 현재 bridge의 총 무게
            weight -= bridge.poll(); // 시간이 지나 다리의 맨 마지막 값이 이동했을테니 그 값을 빼줌 (트럭이 있다면 트럭의 무게가 빠지고
            // 비어있다면 무게는 그대로 유지


            if (!truck.isEmpty()) {
                if (truck.peek() + weight <= L) { // 새로운 트럭이 bridge에 올라올 수 있는경우
                    weight += truck.peek();   // 다리 위 무게에 truck 무게를 더해주고
                    bridge.offer(truck.poll()); // truck을 bridge 큐에 넣어줌
                } else {
                    bridge.offer(0); // 무게가 크면 0을 추가해줌
                }
            }
        }
        // bridge가 비었다는 것은 마지막 트럭까지 다리를 지나갔다는 뜻이므로 while문 빠져나오고 시간 출력
        System.out.println(time);
    }
}
