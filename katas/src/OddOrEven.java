public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(findOdd(4));
        System.out.println(findOdd(5));
        System.out.println(findOdd(0));
        System.out.println(findOdd(1));
    }

    private static boolean findOdd(int num) {
        return (num & 1) == 1;
    }
}
