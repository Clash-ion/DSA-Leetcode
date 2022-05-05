public class SearchInsertPosition {
    
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 2));;
    }

    static int searchInsert(int[] nums, int target) {
        
        int start = 0, end = nums.length, mid;

        while (start < end) {
            mid = start + (end - start)/2;
            if (nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

}
