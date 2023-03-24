package day16_17;
import java.util.Arrays;
//If this element item is smaller than previous then swap
//small element will replace to first
public class InsertionSort16_17 {
    public class InsertionSort {
        public static void sort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 6, 1, 4};
        System.out.println("Before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        InsertionSort.sort(arr);
        System.out.println("\nAfter sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}


