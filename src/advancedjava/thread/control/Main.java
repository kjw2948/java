package advancedjava.thread.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 혼자 연습해보려구 만든 클래스
interface IAdd {
    public int print(int x, int y);

}

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.sort(list);
        IAdd add = (x, y) -> {return  x+y;};
        int c = add.print(10, 13);
        System.out.println(c);
    }
}

