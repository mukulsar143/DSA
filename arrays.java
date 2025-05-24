import java.util.*;

// class Arrays {
//     public static void main(String args[]) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter the size of Array: ");
//         // int size = sc.nextInt();
//         // int arr[] = new int[size];

//         // for (int i = 0 ;i < size; i++) {
//         //     System.out.println("Enter the value");
//         //     arr[i] = sc.nextInt();
//         // }

//         // // find the x value
        
//         // for (int i=0; i<size;i++){
//         //     System.out.print(arr[i]+" ");
//         // }
//         // System.out.println();
//         // System.out.println("enter finding value: ");
//         // int x = sc.nextInt();
//         // for (int i = 0; i< arr.length; i++){
//         //     if (arr[i] == x) {
//         //         System.out.print("x found of index: "+ i);                
//         //     }
//         // }
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String names[] = new String[size];

//         for (int i = 0; i< size; i++) {
//             names[i] = sc.next();
//         }

//         for (int i = 0; i< names.length; i++) {
//                 System.out.println("name " + (i+1) +" is : " + names[i]);  
//         }
//     }
// }

// class Arrays {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int numbers[] = new int[size];

//         for (int  i = 0; i< size; i++) {
//             numbers[i] = sc.nextInt();
//         }
//         for (int  i = 0; i< numbers.length; i++) {
//             System.out.println(numbers[i]+ " ");
//         }

//         // int min = Integer.MIN_VALUE;
//         // int max = Integer.MAX_VALUE;
//         int min = numbers.length;
//         int max = numbers.length;
        
//         for (int i = 0; i< numbers.length; i++) {
//             if (numbers[i] < min) {
//                 min = numbers[i]; 
//             }
//             if (numbers[i] > max) {
//                 max = numbers[i];
//             }
//         }
//         System.out.println("min number of array: "+ min);
//         System.out.println("max number of array: "+max);
//     }
// }


// class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         for (int i = 1; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }
//         // boolean isAcending = true;

//         // for (int i = 1; i<arr.length-1; i++){
//         //     if (arr[i] > arr[i+1]){
//         //         isAcending = false;
//         //     }
//         //     else {
//         //         isAcending = true;
//         //     }
//         // }
//         // if (isAcending == true) {
//         //     System.out.println("Array is sorted");
//         // }
//         // else{
//         //     System.out.println("Array is not");
//         // }

//         // Easy
//         for (int i = 1; i< arr.length-1; i++) {
//             if (arr[i] > arr[i+1]) {
//                 System.out.println("Array is Not Sorted");
//             }
//         }

//             System.out.println("Array is Sorted");
        
//     }
// }

// 2D Arrays

// class TwoDArrays {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number of rows");
//         int rows = sc.nextInt();
//         System.out.println("enter number of cols");
//         int col = sc.nextInt();
//         int tarr[][] = new int[rows][col];

//         for (int i = 0; i<rows; i++) {
//             for (int j = 0; j< col; j++) {
//                 tarr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println();

//         for (int i = 0; i< rows; i++) {
//             for (int j = 0; j< col; j++){
//                 System.out.print(tarr[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println("Enter finding value: ");
//         int x = sc.nextInt();
//         for (int i = 0; i< rows; i ++){
//             for (int j = 0; j<col;j++){
//                 if(tarr[i][j] == x) {
//                     System.out.println("x found of location "+"(" + i+ "," + j+")");
//                 }
//             }
//         }
        
        
//     }
// }


// class SpiralArray {
//     public static void main(String args[]) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Enter Number of rows: ");
//          int rows = sc.nextInt();
//          System.out.println("Enter Number of cols: ");
//          int cols = sc.nextInt();
//          int matrix[][] = new int[rows][cols];

//          for (int i = 0; i< rows; i++){
//             System.out.println("Enter the values for row " + (i + 1) + ":");
//             for (int j = 0; j<cols; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//          }

//          System.out.println("The Spiral order of Matrix: ");

//          int start_row = 0;

//          int end_row = rows - 1;

//          int start_cols = 0;
         
//          int end_cols = cols - 1;

//          while (start_row <= end_row && start_cols <= end_cols) {

//             for (int col = start_cols; col <= end_cols; col++){
//                 System.out.print(matrix[start_row][col] + " ");
//             }
//             start_row++;

//             for (int row = start_row; row <= end_row; row++) { 
//                 System.out.print(matrix[row][end_cols] + " ");
//             }
//             end_cols--;
            
//             if (start_row <= end_row) {
                
//                 for (int col = end_cols; col >= start_cols; col--) {
//                     System.out.print(matrix[end_row][col]+ " ");
//                 } 
//                 end_row--;
//             }

//             if (start_cols <= end_cols) {

//                 for (int row = end_row;row >= start_row; row-- ) {
//                     System.out.print(matrix[row][start_cols]+ " ");
//                 }
//                 start_cols++;
                
//             }
//             System.out.println("");

//         }
//         for (int i = 0; i< rows; i++ ) {
//             for (int j = 0; j< cols; j++) {
//                 System.out.print(matrix[i][j]+ "\t");
//             }
//             System.out.println();
//         }


//     }
// }

// class VisualSpiralMatrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();

//         System.out.print("Enter number of columns: ");
//         int cols = sc.nextInt();

//         int[] input = new int[rows * cols];
 
//         System.out.println("Enter " + (rows * cols) + " values:");
//         for (int i = 0; i < input.length; i++) {
//             input[i] = sc.nextInt();
//         }

//         int[][] spiral = new int[rows][cols];

//         int top = 0, bottom = rows - 1;
//         int left = 0, right = cols - 1;
//         int index = 0;

//         while (top <= bottom && left <= right) {
//             // Left to Right
//             for (int i = left; i <= right; i++) {
//                 spiral[top][i] = input[index++];
//             }
//             top++;

//             // Top to Bottom
//             for (int i = top; i <= bottom; i++) {
//                 spiral[i][right] = input[index++];
//             }
//             right--;

//             // Right to Left
//             if (top <= bottom) {
//                 for (int i = right; i >= left; i--) {
//                     spiral[bottom][i] = input[index++];
//                 }
//                 bottom--;
//             }

//             // Bottom to Top
//             if (left <= right) {
//                 for (int i = bottom; i >= top; i--) {
//                     spiral[i][left] = input[index++];
//                 }
//                 left++;
//             }
//         }

//         System.out.println("Spiral Matrix visually:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(spiral[i][j] + "\t");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }



class TransposeMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of raws: ");
        int raws = sc.nextInt();
        System.out.print("enter number of cols: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[raws][cols];

        for (int i = 0; i< raws; i++) {
            for (int j = 0; j <cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose Matrix");

        for (int j = 0; j<cols; j++){
            for (int i = 0; i <raws; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}