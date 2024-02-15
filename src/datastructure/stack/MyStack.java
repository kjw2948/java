package datastructure.stack;
// ArrayList를 이용하여 스택 메소드 구현하기

import java.util.ArrayList;
public class MyStack {
    ArrayList<Integer> list;

    MyStack(){
        this.list = new ArrayList<Integer>();
    }
    public boolean isEmpty(){
        if(list.size()==0)
            return true;
        else
            return false;
    }
    public void push(int a){
        list.add(a);
    }
    public Integer pop(){
        if(isEmpty()){
            System.out.println("스택이 비어있습니다");
            return null;
        }
        int a = list.get(list.size()-1);
        list.remove(list.size()-1);
        return a;
    }
    public Integer peek(){
        if(isEmpty()){
            System.out.println("스택이 비어있습니다");
            return null;
        }
        return list.get(list.size()-1);
    }
    public void printStack(){
        System.out.println(list);
        }
}
