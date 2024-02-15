package datastructure.stack.stackexcercise;
// 스택을 이용하여 괄호 짝 찾기
import java.util.Stack;
public class StackExcercise2 {
    public static void checkParenthesis(String str){
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        boolean paren = true;
        int check = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = (char) stack.pop();
            if(c ==')') check++;
            else if(c == '(') check --;

            if(check < 0) {
                paren = false;
                break;
            }
        }
        if(check!=0)
            paren = false;
        if(paren == true) System.out.println("PASS!");
        else System.out.println("FAIL!");
    }
    public static void main(String[] args) {
        checkParenthesis("(");
        checkParenthesis(")");
        checkParenthesis("()");
        checkParenthesis("()()()");
        checkParenthesis("(()(((()))))");
    }
}
