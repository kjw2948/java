package baekjoon;

//백준 2908번 문제
public class Problem2908 {
    public static void main(String[] args) {
        int num1 = 734;
        int num2 = 891;
        int num3 = 0;
        int num4 = 0;
        int count = 2;

        while(num1>0 && num2>0){
            int a = num1 % 10;
            int b = num2 % 10;
            num1 /= 10;
            num2 /= 10;
            for (int i = 0; i < count; i++) {
                a *= 10;
                b *= 10;
            }
            num3 += a;
            num4 += b;
            count--;
        }
        System.out.println(num3 > num4 ? num3 : num4);
    }
}
