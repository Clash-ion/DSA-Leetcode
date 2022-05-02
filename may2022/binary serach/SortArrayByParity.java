import java.util.Arrays;

/**
 * SortArrayByParity
 * It works and whole approach was thought by my crappy brain so hell yeah!!!
 */
public class SortArrayByParity {

    public static void main(String[] args) {
        int[] arr = {0,1,2};
        sortArrayByParity(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sortArrayByParity(int[] nums) {
        int temp,leng=nums.length;
        int start = 0,end = leng - 1;
        while(  start < end  ){
            while (start < end && (nums[start]&1) == 1){
                temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            }
            start++;
        }
        return nums;
    }
}