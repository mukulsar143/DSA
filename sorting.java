import java.util.*;

class Sorting {
    public static void array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 4, 6, 8, 2, 0, 1, 9 };

        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        array(arr);
        System.out.print("Bubble Sorted array: " + Arrays.toString(arr));
        System.out.println();
        
        // Selection Sort Algorithm
        for(int i = 0; i<arr.length - 1;i++){
            int smalest = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[smalest] > arr[j] ){
                    smalest = j;
                }
            }
            int temp = arr[smalest];
            arr[smalest] = arr[i];
            arr[i] = temp;

        }

        array(arr);
        System.out.print("Selection Sorted array: " + Arrays.toString(arr));
        System.out.println();
        
        // Insertion Sort Algorithm
        for (int i = 1; i<arr.length-1; i++){
            int current = arr[i];
            int j = i - 1;
            while  (j >= 0 && current <= arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        array(arr);
        System.out.print("Insertion Sorted array: " + Arrays.toString(arr));
        System.out.println();
    }
}