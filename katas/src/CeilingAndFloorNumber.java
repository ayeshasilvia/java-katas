public class CeilingAndFloorNumber {

    //atom -> mota
    public static void main(String[] args) {
        System.out.println(findceiling(new int[] {4,5,8,10,14,16,20}, 6)); //8
        System.out.println(findceiling(new int[] {4,5,8,10,14,16,20}, 11)); //14
        System.out.println(findceiling(new int[] {11,24,33,45,67,78,89}, 78)); //78
        System.out.println(findceiling(new int[] {11,24,33,45,67,78,89}, 55)); //67
        System.out.println(findceiling(new int[] {11,24,33,45,67,78,89}, 100)); //-1
        System.out.println("Floor");
        System.out.println(findFloor(new int[] {4,5,8,10,14,16,20}, 6)); //5
        System.out.println(findFloor(new int[] {4,5,8,10,14,16,20}, 11)); //10
        System.out.println(findFloor(new int[] {11,24,33,45,67,78,89}, 78)); //78
        System.out.println(findFloor(new int[] {11,24,33,45,67,78,89}, 55)); //45
        System.out.println(findFloor(new int[] {11,24,33,45,67,78,89}, 10)); //-1
    }

    //smallest number >= target
    public static int findceiling(int [] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        if (target > arr[end]) {
            return -1;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target) {
                return target;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return arr[start];
    }

    //greatest number <= target
    public static int findFloor(int [] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        if (target < arr[0]) {
            return -1;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target) {
                return target;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return arr[end];
    }


}
