package datastructure.stack.stackexcercise;
// 스택을 이용하여 문자열 뒤집기
import java.util.Stack;
public class StackExcercise1 {
    public static String reverserString(String str){
        Stack stack = new Stack();
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            result += stack.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        String result = reverserString("Hello");
        System.out.println("result = "+result);

        result = reverserString("1 3 5 7 9");
        System.out.println("result = "+result);
    }
}
