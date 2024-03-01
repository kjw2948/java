package datastructure.list.linkedlist;

import datastructure.array.arrayexcercise.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class Excercise {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 1, 4, 2, 4, 2};
        LinkedList list = new LinkedList();
        LinkedList list_clone = new LinkedList();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        list_clone = (LinkedList) list.clone();
        ArrayList result = new ArrayList();
        for (int i = 0; !list.isEmpty();) {
            result.add(list.get(i));
            while(list.contains(list_clone.get(i))){
                list.remove(list_clone.get(i));
            }
        }
        System.out.println("1");
    }
}
