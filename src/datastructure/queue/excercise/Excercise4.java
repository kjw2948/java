package datastructure.queue.excercise;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Excercise4 {
    public static ArrayList getJosephusPermutaion(int N, int K) {
        Queue queue = new LinkedList();
        ArrayList arrayList = new ArrayList();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (queue.size() > 0) {
            int data = (int)queue.remove();
            if((count+1)%K == 0){
                arrayList.add(data);
            }
            else{
                queue.add(data);
            }
            count++;
        }
        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(getJosephusPermutaion(5, 2));
        System.out.println(getJosephusPermutaion(7, 3));
    }
}
