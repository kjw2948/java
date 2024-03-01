package algorithm.greedy;

import java.util.ArrayList;
import java.util.Collections;

class Activity{
    String name;
    int start;
    int end;

    public Activity(String name, int start, int end) {
        this.end = end;
        this.start = start;
        this.name = name;
    }
}
public class Greedy {
    public static void selectActivity(ArrayList<Activity> list) {
        Collections.sort(list, (x1, x2) -> x1.end - x2.end);
        for (Activity activity : list) {
            System.out.println(activity.name);
        }
    }

    public static void main(String[] args) {
        ArrayList<Activity> list = new ArrayList<>();
        list.add(new Activity("A", 1, 5));
        list.add(new Activity("B", 4, 5));
        list.add(new Activity("C", 2, 3));
        list.add(new Activity("D", 4, 7));
        list.add(new Activity("E", 6, 10));
        selectActivity(list);
    }
}
