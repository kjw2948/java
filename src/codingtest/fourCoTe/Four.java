package codingtest.fourCoTe;

import java.util.*;

public class Four {
    public static int[] solution(int[] start1, int[] time1) {
        ArrayList<Integer> answer = new ArrayList<>();
        Hashtable<Integer, Integer> result = new Hashtable<>();
        Hashtable<Integer, Integer> a = new Hashtable<>();
        Hashtable<Integer, Integer> b = new Hashtable<>();
        int[] start = new int[start1.length];
        int[] time = new int[time1.length];
        int[] idxx = new int[start1.length];
        for (int i = 0; i < start1.length; i++) {
            a.put(start1[i], time1[i]);
            b.put(start1[i], time1[i]);
        }
        List<Integer> Keys = new ArrayList<>(result.keySet());
        Collections.sort(Keys, (o1, o2)-> (a.get(o1).compareTo(a.get(o2))));
        int idx = 0;
        for (Integer i : a.keySet()) {
            for (int j = 0; j < start.length; j++) {
                if(i==start1[j]&&a.get(i)==time1[j]){
                    idxx[idx] = j;
                    idx ++;
                }
            }
        }
        for (Integer key : Keys) {
            start[idx] = key;
            time[idx] = a.get(key);
            idx++;
        }
        answer.add(0);
        int tm = time[0]; // 현재 시간
        int index = 1;
        while(index<start.length){
            int cur = index;
            if(start[index]>tm){
                tm = start[index];
            }
            while(index< start.length && tm>=start[index]){
                result.put(index,time[index]);
                index++;
            }
            //정렬
            List<Integer> keys = new ArrayList<>(result.keySet());
            Collections.sort(keys, (o1, o2)-> (result.get(o1).compareTo(result.get(o2))));
            for (Integer i : keys) {
                tm += result.remove(i);
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int[] start = {4, 2, 7, 2, 6};
        int[] time = {5, 2, 5, 4, 3}; // 0,1,3,2,4
        int[] answer = solution(start, time);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
