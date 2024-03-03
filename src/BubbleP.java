public class BubbleP {
    public static void main(String[] args) {
        int[] arr = {2, 13, 4, 1, 3, 6};
        int n = arr.length;
        bubbleSort(arr, n);
        printArray(arr);
    }
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void bubbleSort(int[] arr, int n) {
        for (int i = n-1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) break;
        }
    }
}
