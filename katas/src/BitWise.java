public class BitWise {

    public static void main(String[] args) {
        System.out.println(findUnique(new int[]{22,3,3,4,4,2,6,4,2,4,6}));
        System.out.println(magicNumber(6));

    }

    private static int findUnique(int[] arr) {
        int unique = 0;

        for (int n: arr){
            unique ^= n;
        }
        return unique;
    }

    private static int magicNumber(int n){
        int ans = 0;
        int base = 5;
        while (n >0) {
            int lastDigit = n & 1;
            n = n >> 1;
            ans += base * lastDigit;
            base *= 5;
        }
        return ans;
    }
}
