import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {

        IntStream.range(0, 51).forEach(value -> System.out.println(isPrime(value) ? value + " is Prime" : value + " is not Prime"));
        printAllPrimeNumbersTill(40);
    }

    private static boolean isPrime(int A) {
        if (A <= 1) {
            return false;
        }
        for (int i = 2; i * i <= A; i++ ) {
            if (A % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static void printAllPrimeNumbersTill(int A) {

        boolean[] primes = new boolean[A+1];

        for (int i = 2; i*i <= A; i++) {
            if (!primes[i]) {
                for (int j = i*2; j <= A; j +=i) {
                    primes[j] = true;
                }
            }

        }

        for (int i = 2; i <= A; i++) {
            if (!primes[i]){
                System.out.print(i + " ");
            }
        }
    }

}
