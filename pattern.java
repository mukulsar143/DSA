import java.util.*;


public class pattern {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // star pattern
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // star rectangle paatern
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++){
        //         if (i == 1 || j == 1 || i == n || j == m) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // half pyramid
        int n = sc.nextInt();

        // for (int i = n; i >= 1; i-- ){
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        // for (int i = 1; i<=n; i++) { 
        //     for (int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i<=n; i++) {
        //     for (int j = 1;j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j<=n-i+1; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // Floyd pyramid
        // int number = 1;
        // for (int i = 1; i<=n; i++) {
        //     for (int j = 1; j<=i; j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }
        // 0-1 pyramid
        // for (int i = 1; i<=n; i++) {
        //     for(int j = 1; j<=i; j++){
        //         int sum = i+j;
        //         if (sum % 2 == 0) {
        //             System.out.print("1"+" ");
        //         }
        //         else {
        //         System.out.print("0"+" ");                    
        //         }
        //     }
        //     System.out.println();
        // }

        // butterfly pattern
        // upper half
        // for (int i = 1; i<=n; i++) {
        //     for (int j = 1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     // for spaces
        //     int spaces = 2 * (n-i);
        //     for (int j = 1; j<=spaces; j++) {
        //         System.out.print(" "+" ");
        //     }

        //     for (int j = 1; j<=i; j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        // // lower half
        // for (int i = n; i >= 1; i-- ) {
        //     for (int j = 1; j <= i; j++ ){
        //         System.out.print("* ");
        //     }
        //     int spaces = 2 * (n-i);
        //     for (int j = 1; j<= spaces; j++){
        //         System.out.print(" "+" ");
        //     }
        //     for (int j = 1; j <= i; j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        // rombus pattern
        // int m = sc.nextInt();
        // for (int i = 1; i<=n; i++) {
        //     // spaces
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j<=m; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // number pattern

        // for (int i = 1; i<=n ; i++){
        //     // spaces
        //     for (int j = 1; j<= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++){ 
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // Diamon pattern
        // for (int i = 1; i <= n; i++){
        //     for (int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        // for (int i = n; i>=1; i--){
        //     for (int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        // another approach for diamond pattern
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" "+" ");
            }
            for (int k = 1; k<=2*i-1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = n; i>=1; i--){
            for (int j = 1; j<=n-i; j++){
                System.out.print(" "+" ");
            }
            for (int k = 1; k<=2*i-1;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        // palandromic numbers

        for (int i = 0; i<=n; i++){
            // spaces
            for (int j=1; j<=n-i;j++) {
                System.out.print(" "+" ");
            }
            // first half
            for (int j = i; j>=1; j--){
                System.out.print(j+" ");
            }
            // second half
            for (int j=2; j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
