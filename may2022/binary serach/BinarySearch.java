public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 5, 9, 12 };
        System.out.println(search(arr, 9));
    }

    static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1 , mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
