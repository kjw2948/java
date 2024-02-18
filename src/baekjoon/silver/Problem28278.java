package baekjoon.silver;
import java.util.ArrayList;
import java.util.Scanner;
public class Problem28278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int count = 0;
        int num = sc.nextInt();
        while (count < num) {
            int choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    sc.nextInt();
                    int data = sc.nextInt();
                    System.out.println(list.add(data));
                    break;
                }
                case 2: {
                    if (list.size() == 0)
                        System.out.println(-1);
                    else {
                        System.out.println(list.get(-1));
                        list.remove(-1);
                    }
                    break;
                }
                case 3: {
                    System.out.println(list.size());
                    break;
                }
                case 4: {
                    if (list.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                }
                case 5: {
                    if (list.size() == 0)
                        System.out.println(-1);
                    else
                        System.out.println(list.get(-1));
                    break;
                }
            }
            count++;
        }
    }
}
