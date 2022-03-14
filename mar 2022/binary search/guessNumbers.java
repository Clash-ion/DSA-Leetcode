import java.util.Scanner;

public class guessNumbers {
    private static int guessValue;

    static int guessNumber(int n) {
        int start = 1, end = n, mid = 0;
        while (start <= end) {
            mid = start + (end - mid) / 2;
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private static int guess(int num) {
        if (num == guessValue)
            return 0;
        else if (num < guessValue)
            return 1;
        return -1;
    }

    static void setGuess(int num) {
        guessNumbers.guessValue = num;
    }
    static int getRandomNumber( int max) {
        int min = 1;
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        System.out.println("Input max range");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        setGuess(getRandomNumber(n));
        System.out.println("System's pick " + guessValue);
        scan.close();
        System.out.println(guessNumber(n));
    }
}
