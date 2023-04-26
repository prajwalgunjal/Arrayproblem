import java.util.Arrays;
import java.util.Scanner;

public class arr2 {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 8, 6};
        int[] sortedArr = sortByBits(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] sortByBits(int[] arr) {
       Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && Integer.bitCount(arr[j]) > Integer.bitCount(key)) {
                arr[j + 1] = arr[j];
                j--;
            }

            while (j >= 0 && Integer.bitCount(arr[j]) == Integer.bitCount(key) && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
