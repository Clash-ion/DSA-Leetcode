/**
 * GuessNumberHigherOrLower
 */
public class GuessNumberHigherOrLower {

    static int number;

    /**
     * Forward declaration of guess API.
     * 
     * @param num your guess
     * @return -1 if num is higher than the picked number
     *         1 if num is lower than the picked number
     *         otherwise return 0
     *         int guess(int num);
     */

    static void setNum(int num) {
        number = num;
    }

    public static void main(String[] args) {
        // GuessNumberHigherOrLower ob = new GuessNumberHigherOrLower(47);
        setNum(47);
        System.out.println(guessNumber(100));

    }

    static int guessNumber(int n) {
        int low = 1, high = n, mid, g = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            g = guess(mid);
            if (g == 0) {
                g = mid;
                break;
            } else if (g == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return g;
    }

    static int guess(int num) {
        // check if given number is equal to or less or more than our prediction.
        if (num == number) {
            return 0;
        } else if (num > number) {
            return -1;
        }
        return 1;
    }
}