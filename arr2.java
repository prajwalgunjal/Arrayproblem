import java.util.Arrays;

public class arr2 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 8, 6};
        sortByBits(arr);
//        System.out.println(Arrays.toString(sortedArr));
    }

    public static void sortByBits(int[] arr) {
//        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (Integer.bitCount(arr[i]) > Integer.bitCount(arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (Integer.bitCount(arr[i]) == Integer.bitCount(arr[j])) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
