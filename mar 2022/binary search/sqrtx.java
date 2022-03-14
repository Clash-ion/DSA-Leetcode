import java.util.Scanner;

// import javax.print.event.PrintEvent;


class sqrtx{
    // Solution obj = new Solution();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.print(mySqrt(num));
        scan.close();
    }
    static int mySqrt(int x) {
        if (x<= 1){
            return x;
        }
        int start = 1;
        int end = x/2;
        int ans = 0;
        int mid;
        long m;
        while(start <= end){
            mid = start + (end - start)/2;
            m = (long)mid*(long)mid;
            if (m == x){
                return mid;
            }
            else if(m < x){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}