class orderAgnostic{

    static int binarySearch(int[] arr,int n,int x){
        int start = 0, end = n - 1,mid;
        if (arr[start] <= arr[end]){
            while (start <= end) {
                mid = start + (end - start)/2;
                // mid = (start + end) / 2;
                if (arr[mid] == x){
                    return mid;
                }
                if (arr[mid] < x ){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            return -1;
        }
        else{
            while (start <= end) {
                mid = start + (end - start)/2;
                // mid = (start + end) / 2;
                if (arr[mid] == x){
                    return mid;
                }
                if (arr[mid] > x ){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            return -1;
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 6;
        System.out.println(binarySearch(arr,arr.length, target));
    }
}