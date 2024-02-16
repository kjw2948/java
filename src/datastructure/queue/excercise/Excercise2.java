package datastructure.queue.excercise;
// 배열을 이용하여 기본 큐 구현하기 (원형 큐)
public class Excercise2{
    int[] arr;
    int rear;
    int front;

    Excercise2(int size){
        arr = new int[size + 1]; // 원형큐는 front 자리를 비워두기 때문
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public boolean isFull() {
        return (this.rear + 1) % this.arr.length == this.front;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is Full!");
        }
        else{
            this.rear = (this.rear + 1) / this.arr.length;
            this.arr[this.rear] = data;
        }
    }
    public Integer dequeue() {
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return null;
        }
        else{
            int data = this.arr[this.front+1];
            this.arr[this.front] = 0;
            front++;
            return data;
        }
    }

    public void printQueue() {
        for (int i = front+1; i <= rear; i++) {
            System.out.print(this.arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Excercise2 queue = new Excercise2(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        queue.printQueue();
    }
}
