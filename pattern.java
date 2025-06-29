// import java.util.*;

// public class pattern {
//     public static void main(String args[]) { 
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // int m = sc.nextInt();
//         // star pattern
//         // for (int i = 1; i <= n; i++) {
//         //     for (int j = 1; j <= m; j++) {
//         //         System.out.print("*");
//         //     }
//         //     System.out.println();
//         // }
//         // star rectangle paatern
//         // for (int i = 1; i <= n; i++) {
//         //     for (int j = 1; j <= m; j++){
//         //         if (i == 1 || j == 1 || i == n || j == m) {
//         //             System.out.print("*");
//         //         } else {
//         //             System.out.print(" ");
//         //         }
//         //     }
//         //     System.out.println();
//         // }
//         // half pyramid
//         int n = sc.nextInt();
//         // for (int i = n; i >= 1; i-- ){
//         //     for (int j = 1; j <= i; j++) {
//         //         System.out.print("*");
//         //     }
//         //     System.out.println();
//         // }
//         // for (int i = 1; i<=n; i++) { 
//         //     for (int j = 1; j<=n-i; j++){
//         //         System.out.print(" ");
//         //     }
//         //     for (int j = 1; j<=i; j++){
//         //         System.out.print("*");
//         //     }
//         //     System.out.println();
//         // }
//         // for (int i = 1; i<=n; i++) {
//         //     for (int j = 1;j <= i; j++) {
//         //         System.out.print(j+" ");
//         //     }
//         //     System.out.println();
//         // }
//         // for (int i = 1; i <= n; i++){
//         //     for (int j = 1; j<=n-i+1; j++){
//         //         System.out.print(j+" ");
//         //     }
//         //     System.out.println();
//         // }
//         // Floyd pyramid
//         // int number = 1;
//         // for (int i = 1; i<=n; i++) {
//         //     for (int j = 1; j<=i; j++){
//         //         System.out.print(number+" ");
//         //         number++;
//         //     }
//         //     System.out.println();
//         // }
//         // 0-1 pyramid
//         // for (int i = 1; i<=n; i++) {
//         //     for(int j = 1; j<=i; j++){
//         //         int sum = i+j;
//         //         if (sum % 2 == 0) {
//         //             System.out.print("1"+" ");
//         //         }
//         //         else {
//         //         System.out.print("0"+" ");                    
//         //         }
//         //     }
//         //     System.out.println();
//         // }
//         // butterfly pattern
//         // upper half
//         // for (int i = 1; i<=n; i++) {
//         //     for (int j = 1; j<=i; j++){
//         //         System.out.print("* ");
//         //     }
//         //     // for spaces
//         //     int spaces = 2 * (n-i);
//         //     for (int j = 1; j<=spaces; j++) {
//         //         System.out.print(" "+" ");
//         //     }
//         //     for (int j = 1; j<=i; j++){
//         //         System.out.print(" *");
//         //     }
//         //     System.out.println();
//         // }
//         // // lower half
//         // for (int i = n; i >= 1; i-- ) {
//         //     for (int j = 1; j <= i; j++ ){
//         //         System.out.print("* ");
//         //     }
//         //     int spaces = 2 * (n-i);
//         //     for (int j = 1; j<= spaces; j++){
//         //         System.out.print(" "+" ");
//         //     }
//         //     for (int j = 1; j <= i; j++){
//         //         System.out.print(" *");
//         //     }
//         //     System.out.println();
//         // }
//         // rombus pattern
//         // int m = sc.nextInt();
//         // for (int i = 1; i<=n; i++) {
//         //     // spaces
//         //     for (int j = 1; j <= n-i; j++) {
//         //         System.out.print(" ");
//         //     }
//         //     for (int j = 1; j<=m; j++) {
//         //         System.out.print("* ");
//         //     }
//         //     System.out.println();
//         // }
//         // number pattern
//         // for (int i = 1; i<=n ; i++){
//         //     // spaces
//         //     for (int j = 1; j<= n-i; j++){
//         //         System.out.print(" ");
//         //     }
//         //     for (int j = 1; j <= i; j++){ 
//         //         System.out.print(i+" ");
//         //     }
//         //     System.out.println();
//         // }
//         // Diamon pattern
//         // for (int i = 1; i <= n; i++){
//         //     for (int j = 1; j<=n-i; j++){
//         //         System.out.print(" ");
//         //     }
//         //     for (int j = 1; j<=i; j++) {
//         //         System.out.print("*"+" ");
//         //     }
//         //     System.out.println();
//         // }
//         // for (int i = n; i>=1; i--){
//         //     for (int j = 1; j<=n-i; j++){
//         //         System.out.print(" ");
//         //     }
//         //     for (int j = 1; j<=i; j++) {
//         //         System.out.print("*"+" ");
//         //     }
//         //     System.out.println();
//         // }
//         // another approach for diamond pattern
//         for (int i = 1; i<=n; i++){
//             for (int j = 1; j<=n-i; j++){
//                 System.out.print(" "+" ");
//             }
//             for (int k = 1; k<=2*i-1;k++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//         for (int i = n; i>=1; i--){
//             for (int j = 1; j<=n-i; j++){
//                 System.out.print(" "+" ");
//             }
//             for (int k = 1; k<=2*i-1;k++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//         // palandromic numbers
//         for (int i = 0; i<=n; i++){
//             // spaces
//             for (int j=1; j<=n-i;j++) {
//                 System.out.print(" "+" ");
//             }
//             // first half
//             for (int j = i; j>=1; j--){
//                 System.out.print(j+" ");
//             }
//             // second half
//             for (int j=2; j<=i;j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }
class Revission {

    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("Next;");
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("Next;");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 5 || j == 5 || i == 1 || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Next;");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("Next;");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("Next;");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 5 - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("Next;");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Next;");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == i || j == 5 - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Next;");
        for (int i = 6 / 2; i <= 6; i += 2) {
            for (int j = 1; j < 6 - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 6; i >= 1; i--) {
            for (int j = i; j < 6; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Next;");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println("Next;");
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
        System.out.println("Next;");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (5 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (5 - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Next;");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Next;");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Next;");
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
