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
        while(index<8){
            for (int i = 0; i < 6; i++) {
                correct += Integer.toString(random.nextInt(0, 10));
            }
            count ++;
            if(correct.equals(recent[index])){
                checkCount[index] = count;
                count = 0;
                index ++;
            }
            correct = "";
        }
        int sum = 0;
        for (int i = 0; i < checkCount.length; i++) {
            sum += checkCount[i];
        }
        int next = sum / 8;
        for (int i = 0; i < next; i++) {
            for (int j = 0; j < 6; j++) {
               Integer.toString(random.nextInt(0, 10));
            }
            if(i==next-1){
                for (int j = 0; j < 6; j++) {
                    correct += Integer.toString(random.nextInt(0, 10));
                }
            }
        }
        String prefix = Integer.toString(random.nextInt(1, 6));
        System.out.println("prefix = " + prefix);
        System.out.println("Last correct = " + prefix + correct);
    }
}
