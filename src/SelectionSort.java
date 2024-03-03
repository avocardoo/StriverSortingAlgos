public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {45, 25, 3, 14, 65, 87, 22, 32};
        selectionSort(arr);
        printArray(arr);
    }
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
