import java.util.Arrays;

public class binSearch2dFS {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        System.out.println(Arrays.toString(binarySearch2dFS(arr, 12)));
    }

    static int[] binarySearch2dFS(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;

        if (row == 1) {
            return binarySearch(arr, 0, 0, col - 1, target);
        }
        int rstart = 0;
        int rend = row - 1;
        int cmid = col / 2;

        while (rstart < (rend - 1)) {
            int mid = rstart + (rend - rstart) / 2;
            if (arr[mid][cmid] == target) {
                return new int[] { mid, cmid };
            }
            if (arr[mid][cmid] < target) {
                rstart = mid;
            } else {
                rend = mid;
            }
        }

        if (arr[rstart][cmid] == target) {
            return new int[] { rstart, cmid };
        }
        if (arr[rstart + 1][cmid] == target) {
            return new int[] { rstart + 1, cmid };
        }

        if (target <= arr[rstart][cmid - 1]) {
            return binarySearch(arr, rstart, 0, cmid - 1, target);
        }
        if (target >= arr[rstart][cmid + 1] && target <= arr[rstart][col - 1]) {
            return binarySearch(arr, rstart, cmid + 1, col - 1, target);
        }
        if (target <= arr[rstart + 1][cmid - 1]) {
            return binarySearch(arr, rstart + 1, 0, cmid - 1, target);
        } else {
            return binarySearch(arr, rstart + 1, cmid + 1, col - 1, target);
        }

        // return new int[] { -1, -1 };
    }

    static int[] binarySearch(int[][] arr, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (arr[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (arr[row][mid] < target) {
                cstart = mid + 1;
            } else {
                cend = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }
}
