public class nextGreatesLetters {
    public char nextGreatestLetter(char[] arr, char target) {
        int start = 0, end = arr.length - 1 , mid ;
                // if(target > arr[end]){
                //     return arr[0];
                // }
                while(start < end){ // misising equal to
                    mid = start + (end-start)/2;
                    // if(arr[mid]== target){
                    //     break;
                    // }
                    if(target<arr[mid]){
                        end = mid - 1;
                        
                    }
                    else{
                        start = mid + 1;
                    }
                }
                return arr[start%arr.length];    
        
            }
        // }

        public char nextGreatestLetter2(char[] letters, char target) {
// this is from kunal
            int start = 0;
            int end = letters.length - 1;
    
            while(start <= end) {
                // find the middle element
    //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                int mid = start + (end - start) / 2;
    
                if (target < letters[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return letters[start % letters.length];
        }
}
