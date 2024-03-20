package baekjoon.silver;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem6416 {
    public static boolean checkTree(ArrayList parent, ArrayList child) {

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> parent = new ArrayList<>();
        ArrayList<Integer>  child = new ArrayList<>();
        int k = 1;
        while(true){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            if (a == -1 && b == -1) {
                break;
            }
            if (a==0 && b ==0) {
                if (checkTree(parent, child)) {
                    System.out.println("Case " + k++ + " is a tree.");
                } else {
                    System.out.println("Case " + k++ + " is not a tree.");
                }
            }
            parent.add(a);
            child.add(b);
        }
    }
}
