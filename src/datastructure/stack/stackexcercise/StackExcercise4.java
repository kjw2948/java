package datastructure.stack.stackexcercise;
import java.util.Stack;
public class StackExcercise4 {
    public static boolean compareString(String s1, String s2) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        for (String str : s1.split("")) {
            if (str.equals("#")) {
                stack1.pop();
            }
            else {
                stack1.push(str);
            }
        }
        for (String str : s2.split("")) {
            if (str.equals("#")) {
                stack2.pop();
            }
            else {
                stack2.push(str);
            }
        }
        System.out.println(stack1);
        System.out.println(stack2);
        if(stack1.equals(stack2)) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s1 = "th#ree";
        String s2 = "tree";
        System.out.println(compareString(s1,s2));
    }
}
