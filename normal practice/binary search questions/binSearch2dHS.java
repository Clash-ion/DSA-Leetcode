import java.util.Arrays;

class binSearch2dHS {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 5, 9, 13 },
                { 2, 6, 10, 14 },
                { 3, 7, 11, 15 },
                { 4, 8, 12, 16 }
        };
        System.out.println(Arrays.toString(binarySearch2dHS(arr, 8)));
    }

    static int[] binarySearch2dHS(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new int[] { row, col };
            } else if (arr[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }
}