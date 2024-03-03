public class InsertionP {
    public static void main(String[] args) {
        int[] arr = {2, 13, 4, 1, 3, 6};
        int n = arr.length;
        insertionSort(arr, n);
        printArray(arr);
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for (int i = 0; i < size; i++) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
