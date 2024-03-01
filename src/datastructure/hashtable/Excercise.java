package datastructure.hashtable;

import java.util.Hashtable;
public class Excercise {
    public static void solution(int[] arr1, int[] arr2) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for (int i = 0; i < arr1.length; i++) {
            ht.put(arr1[i], arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(ht.containsKey(arr2[i])){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {1, 2, 3, 4, 5};
        solution(arr1, arr2);
    }
}
