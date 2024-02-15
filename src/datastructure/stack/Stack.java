package datastructure.stack;

public class Stack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.printStack();
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        myStack.printStack();
        System.out.println(myStack.isEmpty());
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.isEmpty());

    }
}
