package day16_17;
//Dvide array and check
public class MergeSort16_17 {
        public static void mergeSort(int[] arr) {
            if (arr == null || arr.length == 0) {
                return;
            }
            int[] temp = new int[arr.length];
            mergeSort(arr, 0, arr.length - 1, temp);
        }
        private static void mergeSort(int[] arr, int left, int right, int[] temp) {
            if (left < right) {
                int mid = (left + right) / 2;
                mergeSort(arr, left, mid, temp);
                mergeSort(arr, mid + 1, right, temp);
                merge(arr, left, mid, right, temp);
            }
        }
        private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
            for (int i = left; i <= right; i++) {
                temp[i] = arr[i];
            }
            int i = left;
            int j = mid + 1;
            int k = left;
            while (i <= mid && j <= right) {
                if (temp[i] <= temp[j]) {
                    arr[k] = temp[i];
                    i++;
                } else {
                    arr[k] = temp[j];
                    j++;
                }
                k++;
            }
            while (i <= mid) {
                arr[k] = temp[i];
                k++;
                i++;
            }
        }
        public static void main(String[] args) {
            int[] arr = {5, 2, 6, 1, 3};
            mergeSort(arr);
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
}
