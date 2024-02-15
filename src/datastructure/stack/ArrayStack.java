package datastructure.stack;

import java.util.ArrayList;

// 배열을 이용하여 스택 구현하기
public class ArrayStack {
    Integer[] arr;
    int top = -1;

    ArrayStack(int size) {
        this.arr = new Integer[size];
    }

    public boolean isEmpty() {
        if(this.top==-1) return true;
        else return false;
    }

    public void push(int a) {
        this.arr[++top] = a;
    }

    public Integer pop() {
        if(top==-1) {
            System.out.println("스택이 비어있습니다");
            return null;
        }
        int a = this.arr[top];
        this.arr[top--] = null;
        return a;
    }

    public Integer peek() {
        if(top==-1) {
            System.out.println("스택이 비어있습니다");
            return null;
        }
        int a = this.arr[top];
        return a;
    }

    public void printStack() {
        for (int i = 0; i < top+1; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
}