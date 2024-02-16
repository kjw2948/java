package datastructure.queue.excercise;
import java.util.LinkedList;
import java.util.Queue;
public class Excercise3 {
    public static int findLastCard(int N){
        Queue queue = new LinkedList();
        int count = 1;
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while(queue.size()>1){
            if(count % 2 == 1){
                queue.poll();
            }
            else{
                int a = (int) queue.poll();
                queue.add(a);
            }
            count ++;
        }
        return (int) queue.peek();
    }

    public static void main(String[] args) {
        System.out.println(findLastCard(4));
        System.out.println(findLastCard(7));
        System.out.println(findLastCard(9));
    }
}
