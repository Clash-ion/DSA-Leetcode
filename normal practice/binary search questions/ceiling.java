public class ceiling {

    static int binarySearch(int[] arr, int x){
        int start = 0, end = arr.length -1,mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == x){
                return mid;
            }
            if (arr[mid] < x){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7,8,9};
        System.out.println(binarySearch(arr, 3));
    }
}
