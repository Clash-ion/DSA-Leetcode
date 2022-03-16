import java.util.Arrays;

public class TwoSum2InputArrayIsSorted {
    static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1, sum = 0;
        while (start < end) {
            sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[] { start + 1, end + 1 };
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 11, 15 };
        System.out.println(Arrays.toString(twoSum(arr, 13)));
    }

}
