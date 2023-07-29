
/**
 * https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
 */
public class CountRotations {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{15, 18, 2, 3, 6, 12})); //2
        System.out.println(solution(new int[]{7, 9, 11, 12, 5})); //4
        System.out.println(solution(new int[]{3,4,6,9,12})); //0
    }
    private static int solution(int[] A) {
        return findPivot(A) + 1;
    }
    private static int findPivot(int[] A) {
        int start = 0;
        int end = A.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (mid < end && A[mid] > A[mid+1]){
                return mid;
            }
            if (mid < end && A[mid] < A[mid-1]){
                return mid-1;
            }
            if (A[start] >= A[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
