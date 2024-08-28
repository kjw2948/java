package nocode.dp;
//leet 70
public class ClimbStair {
    static int[] stair;
    public static int climb(int n) {
        if (n == 1) {
            return stair[n] = 1;
        }
        if (n == 2) {
            return stair[n] = 2;
        }
        if (stair[n] != 0) {
            return stair[n];
        } else {
            return stair[n] = climb(n-1) + climb(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        stair = new int[n+1];
        System.out.println(climb(n));
    }
}
