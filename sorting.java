
//     public static void array(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int arr[] = {4, 6, 8, 2, 0, 1, 9};
//         // Bubble Sort Algorithm
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] < arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         array(arr);
//         System.out.print("Bubble Sorted array: " + Arrays.toString(arr));
//         System.out.println();
//         // Selection Sort Algorithm
//         for (int i = 0; i < arr.length - 1; i++) {
//             int smalest = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[smalest] > arr[j]) {
//                     smalest = j;
//                 }
//             }
//             int temp = arr[smalest];
//             arr[smalest] = arr[i];
//             arr[i] = temp;
//         }
//         array(arr);
//         System.out.print("Selection Sorted array: " + Arrays.toString(arr));
//         System.out.println();
//         // Insertion Sort Algorithm
//         for (int i = 1; i < arr.length - 1; i++) {
//             int current = arr[i];
//             int j = i - 1;
//             while (j >= 0 && current <= arr[j]) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = current;
//         }
//         array(arr);
//         System.out.print("Insertion Sorted array: " + Arrays.toString(arr));
//         System.out.println();
//     }
// }
class Sorting2 {

    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivot_index = partition(arr, low, high);
            quicksort(arr, low, pivot_index - 1);
            quicksort(arr, pivot_index + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = {5, 8, 1, 3, 7, 6, 9};
        int n = arr.length;

        System.err.print("Merge Sort Solution: ");
        mergesort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Quick Sort Solution: ");
        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
