import java.util.Scanner;

public class firstBadVersions {
    static int badNumber;


    static int firstBadVersion(int n) {
        int start = 1, end = n, mid = 0, ans = 1;
        while(start <= end){
            mid = start + (end - start) / 2;
            if (isBadVersion(mid)){
                end = mid - 1;
                ans = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isBadVersion(int num) {
        return num >= badNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int badNumber = scan.nextInt();
        scan.close();
        firstBadVersions.badNumber = badNumber;
        System.out.println(firstBadVersion(n));
    }
}
