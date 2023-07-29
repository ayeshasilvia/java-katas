/**
 * https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 */
public class FindElementInInfiniteArray {

    public static void main(String[] args) {
        System.out.println(findElement(new int[]{2,3,5,6,7,8,10,11,12,15,27,22,31,34,45,67}, 15)); //9
    }

    public static int findElement(int[] nums,  int target) {
        int start = 0;
        int end = 1;
        while (target > nums[end]) {
            int temp = end + 1;
            end += (end - start + 1) * 2;
            start = temp;
        }

        return search(nums, target, start, end);

    }

    private static int search(int[] nums,  int target, int start, int end) {

        while(start <= end) {
            int mid = start + (end - start)/2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target){
                end = mid - 1;
            } else {
                return mid;
            }
            }

        return -1;
    }
}
