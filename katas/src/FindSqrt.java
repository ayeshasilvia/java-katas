import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class FindSqrt {
    public static void main(String[] args) {

        System.out.println(sqrt(40, 3));
        System.out.println("Newton: " + newtonSqrt(40));
    }

    private static double sqrt(int n, int  p) {
        double res = 0.0;
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) /2;
            if (mid * mid == n){
                return mid;
            }
            if (mid * mid > n) {
                end = mid -1;
            } else {
                start = mid + 1;
            }

        }

        double inc = 0.1;
        for (int i = 0; i < p; i++){

            while (res * res <= n) {
                res += inc;
            }
            res -= inc;
            inc /= 10;

        }

        return res;
    }

    private static double newtonSqrt(double n) {
        double x = n;
        double root = 0.0;
        while (true){
            root = (x + (n/x)) / 2;

            if (Math.abs(root - x) < 0.5){
                break;
            }
            x = root;
        }

        return root;

    }

}
