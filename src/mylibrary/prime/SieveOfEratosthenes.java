package mylibrary.prime;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int N = 90;
        boolean[] primeNumber = new boolean[N + 1];

        primeNumber[0] = true;
        primeNumber[1] = true;

        for (int i = 2; i < Math.sqrt(N); i++) {
            if(!primeNumber[i]){
                for (int j = i*i; j <= N; j++) {
                    primeNumber[j] = true;
                }
            }
        }
    }
}
