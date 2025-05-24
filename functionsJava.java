import java.util.*;

// public class myFuncion {
//     // public static int addSum(int a, int b) {
//     //     int sum = a + b;
//     //     return sum;
//     // }

//     // public static int multuplyNum(int a, int b) {
//     //     return a * b;
//     // }

//     // public static int factorialNum(int f) {
//     //     if (f < 0) {
//     //         System.out.println("invalid number");
//     //         return -1;
//     //     }
//     //     int factorial = 1;

//     //     for (int i = f; i>=1; i--) {
//     //         factorial = factorial * i;
//     //     }

//     //     return factorial;
//     // }
//     // public static int averageNum(int a, int b, int c){
//     //     return (a+b+c) / 3;
//     // }

//     // public static void printOfallOddSum(int n) {
//     //     int sum = 0;
//     //     for (int i = 1; i <= n; i++){
//     //         if (i % 2 != 0) {
//     //             sum = sum + i;
//     //         }
//     //     }
//     //     System.out.println(sum);
//     // }
//     // public static int getGreator(int a, int b) {
//     //     if(a > b) {
//     //         return a; 
//     //     } else {
//     //         return b;
//     //     }

//     // }

//     // public static double circleOfCircumference(double radius) {
//     //     return 2 * 3.14 * radius;
//     // }

//     // public static boolean getVoteEligblity(int n) {
//     //     if (n > 18) {
//     //         return true;
//     //     }
//     //     else {
//     //         return false;
//     //     }
//     // }

//     public static void getnumbersOfCount(int n) {
//         int pos = 0;
//         int neg = 0;
//         int zer = 0;
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         while (n == 1) {
//             System.out.println("enter you number: ");
//             int num = sc.nextInt();
//             if (num > 0) {
//                 pos = pos + 1;
//             }
//             else if (num < 0) {
//                 neg = neg + 1;
//             }
//             else {
//                 zer = zer + 1;
//             }
//             System.out.println("Press 1 to contiue 0 to stop");
//             n = sc.nextInt();

//         }
//         System.out.println("Postives: "+ pos);
//         System.out.println("Negativs: " + neg);
//         System.out.println("Zeros: "+ zer);
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         // int sum = addSum(a, b);
//         // System.out.println("Value of your (a), (b) Sum: "+sum);
//         // System.out.println("Multiply of two number of: "+ multuplyNum(a, b));
//         // System.out.println("Your Enter Number of Factorial is: " + factorial(n));
//         // int result = factorialNum(n);
//         // if (result != -1) {
//         //     System.out.println("factorial of " + n + " is "+ result);
//         // }
//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         // int c = sc.nextInt();
//         // int average = averageNum(a,b,c);
//         // System.out.println("You're Given value average is: "+ average);

//         // int n = sc.nextInt();
//         // printOfallOddSum(n);
//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         // System.err.println(getGreator(a, b));
//         //  int r = sc.nextInt();
//         //  System.out.println(circleOfCircumference(r));
//         // int age = sc.nextInt();
//         // System.out.println(getVoteEligblity(age));
//         int n = sc.nextInt();
//         getnumbersOfCount(n);
//     }
// }

// for tae input for enter inpput from user x and n which x^n 
// class Solution {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number x: ");
//         int x = sc.nextInt();
//         System.out.println("enter number n");
//         int n = sc.nextInt();
//         int result = 1;
//         for (int i = 0; i<n; i++){
//             result = result * x;
//         }
//         System.out.println("x is the power of n: "+ result);

//     }
// }

//  Find GCD Values

// class Solution {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter value of n1: ");
//         int n1 = sc.nextInt();
//         System.out.println("enter value of n2: ");
//         int n2 = sc.nextInt();

//         while (n1 != n2) {
//             if (n1 > n2) {
//                 n1 = n1 - n2;
//             } else {
//                 n2 = n2 -n1;
//             }
//         }
//         System.out.println("You're enter values of GCD: "+ n2);
//     }
// }

// Fibonacci Series

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        if (n < 1) {
            System.out.println("enter the positive value");
        }
        
        
        if (n > 1) {
            System.out.print(a+" ");
            for (int i = 2; i <= n; i++) {
                System.out.print(b+" ");
                int temp = b;
                b = b + a;
                a = temp;
            }
            System.out.println();
        }
    }
}