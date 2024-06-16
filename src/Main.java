import java.util.Random;

public class Main{
    public int solution(String[][] clothes) {
        return 0;
    }
    public static void main(String[] args) {
        Random random = new Random();
        String correct = "";
        String[] recent = {"146362","472675", "419093","453064", "756397", "472377","489075","211988"};
        int[] checkCount = new int[8];
        int index = 0;
        int count = 0;
        sevenTwentyPlus();
        //sixFourFive();
    }

    public static void sixFourFive() {
        Random random = new Random();
        int[] arr = new int[6];
        for (int k = 0; k < 5; k++) {
            String winner = "";
            for (int i = 0; i < 6; i++) {
                int n = random.nextInt(0, 45) + 1;
                if (i == 0) {
                    arr[i] = n;
                }
                for (int j = 0; j < i; j++) {
                    if (n == arr[j]) {
                        i--;
                        break;
                    }
                    if (j == i - 1) {
                        arr[i] = n;
                    }
                }
            }
            for (int i = 0; i < 6; i++) {
                winner = winner + Integer.toString(arr[i]) + " ";
            }
            System.out.println(winner);
        }
    }
    public static void sevenTwentyPlus() {
        Random random = new Random();
        for (int j = 0; j < 5; j++) {
            String winner = " ";
            for (int i = 0; i < 7; i++) {
                if (i == 0) {
                    winner = Integer.toString(random.nextInt(0, 5) + 1) + winner;
                } else {
                    winner += Integer.toString(random.nextInt(0, 10));
                }
            }
            System.out.println(winner);
        }
    }
}
