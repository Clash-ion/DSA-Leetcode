/**
 * MaximumSubarray
 */
public class MaximumSubarray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4 };
        System.out.println(maxSubArray(arr));
    }

    static int totalSum(int[] arr, int start, int end) {
        int sum = 0;
        while (start <= end) {
            sum += arr[start];
            start++;
        }
        return sum;
    }

    static int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE, tans, left = 0, right = nums.length - 1;
        while (left <= right) {
            tans = totalSum(nums, left, right);
            if (tans > ans) {
                ans = tans;
            }

            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}