package datastructure.queue.excercise;
// ArrayList를 이용한 queue 구현
import java.util.ArrayList;
public class Excercise1 {
    ArrayList list;
    Excercise1(){
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
        if(this.list.size()==0){
            return true;
        }
        else {
            return false;
        }
    }

    public void push(int data) {
        list.add(data);
    }

    public Integer poll() {
        if(isEmpty()){
            System.out.println("Queue is Empty!!!");
            return null;
        }
        else{
            int a = (int) this.list.get(0);
            this.list.remove(0);
            return a;
        }
    }

    public Integer peek() {
        if(isEmpty()){
            System.out.println("Queue is Empty!!!");
            return null;
        }
        else{
            int a = (int) this.list.get(0);
            return a;
        }
    }

    public void printQueue() {
        System.out.println(list);
    }
    public static void main(String[] args) {
        Excercise1 queue = new Excercise1();
        System.out.println(queue.isEmpty());
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());
        queue.push(4);
        System.out.println(queue.poll());
        queue.push(5);
        queue.printQueue();
    }
}
