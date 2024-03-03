public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {45, 25, 3, 14, 65, 87, 22, 32};
        int n = arr.length;
        insertionSort(arr, n);
        printArray(arr);
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int[] insertionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                //swap
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }

        }
        return arr;
    }
}
