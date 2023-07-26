import java.util.Arrays;

public class ArraySwap {

    //{1,3,5,2,7} -> {7,2,5,3,1}
    public static void main(String[] args) {
        Arrays.stream(solution(new int[]{1, 3, 5, 2, 7})).forEach(i -> System.out.print(i + ","));
    }

    public static int[] solution(int[] A) {
        int start = 0;
        int end = A.length-1;

        while(start < end){
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }

        return A;
    }


}
