package datastructure.stack;

public class Stack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        ArrayStack arrayStack = new ArrayStack(4);
        /*myStack.push(1);
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
        System.out.println(myStack.isEmpty());*/

        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.printStack();
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.peek());
        arrayStack.printStack();
        System.out.println(arrayStack.isEmpty());
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop();
        System.out.println(arrayStack.isEmpty());
    }
}
