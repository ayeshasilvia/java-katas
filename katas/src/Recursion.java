public class Recursion {
    public static void main(String[] args) {

        System.out.println("Desc");
        printDesc(10);
        System.out.println("\nAsc");
        printAsc(10);
        System.out.println("\nFactorial of 5: " +  factorial(5));
        System.out.println("\nsumOfDigits of 13425: " +  sumOfDigits(13425));
        System.out.println("\nsumOfDigits of 1342: " +  sumOfDigits(1342));
        System.out.println("\nproductOfDigits of 52: " +  productOfDigits(52));
        System.out.println("\nproductOfDigits of 201: " +  productOfDigits(201));
        System.out.println("\nreverseNumber of 201: " +  reverseNumber(201));
        System.out.println("\nreverseNumber of 1824: " +  reverseNumber(1824));
        System.out.println("\nisPalindrome 1824: " +  isPalindrome(1824));
        System.out.println("\ncountZero 10802040: " +  countZero(10802040, 0));
        System.out.println("\ncountZero 10: " +  countZero(10, 0));
        System.out.println("\ncountZero 555: " +  countZero(555, 0));

    }

    private static void printDesc(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printDesc(n-1);
    }
    private static void printAsc(int n) {
        if (n == 0) {
            return;
        }

        printAsc(n-1);
        System.out.print(n + " ");
    }

    private static int factorial(int n){
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    private static int sumOfDigits(int n){
        if (n == 0) {
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
    private static int productOfDigits(int n){
        if (n%10 == n) {
            return n;
        }
        return n%10 * productOfDigits(n/10);
    }

    private static int reverseNumber(int n){
        if (n%10 == n) {
            return n;
        }
        return (n%10) * (int) Math.pow(10,  (int) Math.log10(n)) + reverseNumber(n/10);

    }

    private static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    private static int countZero(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n%10 == 0) {
            return countZero(n/10, ++count);
        } else {
            return countZero(n/10, count);
        }

    }
}
