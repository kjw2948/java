package baekjoon.silver;
import java.util.ArrayList;
import java.util.Scanner;
public class Problem28278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int count = 0;
        int num = sc.nextInt();
        int[] arr = new int[num];
        while (count < num) {
            int choose = sc.nextInt();
            switch (choose) {
                case 1: {
                    sc.nextInt();
                    int data = sc.nextInt();
                    list.add(data);
                    arr[count] = data;
                    break;
                }
                case 2: {
                    if (list.size() == 0)
                        arr[count] = -1;
                    else {
                        arr[count] = (int) list.get(-1);
                        list.remove(-1);
                    }
                    break;
                }
                case 3: {
                    arr[count] = list.size();
                    break;
                }
                case 4: {
                    if (list.isEmpty())
                        arr[count] = 1;
                    else
                        arr[count] = 0;
                    break;
                }
                case 5: {
                    if (list.size() == 0)
                        arr[count] = -1;
                    else
                        arr[count] = (int) list.get(-1);
                    break;
                }
            }
            count++;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }
}
