public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(2147483647));
    }

    static int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        int sum = 0;
        int count = 0;
        while (sum <= right) {
            sum += (left);
            left++;
            count++;
        }
        return count;
    }
}
