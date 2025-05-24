import java.util.*;

public class Main {
    public static void main(String args[]) {
        // System.out.print("Hii This is me seocnd code in java.. \n");
        // System.out.println("Hello Java Dsa!!");
        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");

        // Variables

        // String name = "my Name is xyz";
        // System.out.println(name);
        // int a = 10;
        // int b = 5;
        // int sum = a + b;
        // int diff = b - a;
        // int ans = (a * b) / (a -b);
        // System.out.println(sum);
        // System.out.println(diff);
        // System.out.println(ans);

        // Scanner sc = new Scanner(System.in);
        // String name2 = sc.nextLine();
        // System.out.println(name2);

        // Scanner sc = new Scanner(System.in);
        // Add Two Variables and taking output from input
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("your sum value: " + sum);
        // find area of rectangle
        // int l = sc.nextInt();
        // int w = sc.nextInt();
        // int area = l * w;
        // System.err.println("Area of Rectangle is " + area);
        // find age
        // int age = sc.nextInt();
        // if (age > 18) {
        //    System.out.println("You are Adult..");
        // }
        // else if (age == 17) {
        //     System.out.println("You are sem Adult..");
        // }
        // else {
        //     System.out.println("You are not Adult..");
            
        // }

        // find odd even number

        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        //     System.out.println("Even");
        // } 
        // else {
        //     System.out.println("Odd");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a == b) {
        //     System.out.println("Value of a and value of b are equal..");
        // }
        // else if (a > b) {
        //     System.out.println("Value of a is greater then b..");
        // }
        // else if (a < b) {
        //     System.out.println("Value of a is lower then b..");
        // }
        // else {
        //     System.out.println(" please put the Value ");

        // }

            // Switch cases
            // int button = sc.nextInt();
            // switch (button) {
            //     case 1 : System.out.println("Google");
            //     break;
            //     case 2 : System.out.println("Microsoft");
            //     break;
            //     case 3 : System.out.println("Meta");
            //     break;
            //     default : System.out.println("Invalid put the Button...");
            // }
            // Calculator
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // String opr = sc.next();

            // if (opr.equals("+")) {
            //    System.out.println("Add: " + (a + b));
            // }
            // else if (opr.equals("-")) { 
            //     System.out.println("Minus: " + (a - b));
            // }
            // else if (opr.equals("*")) { 
            //     System.out.println("Multiply: " + (a * b));
            // }
            // else if (opr.equals("/")) { 
            //     if (b != 0) {
            //         System.out.println("Devide: " + (a / b));
            //     }
            //     else {
            //         System.out.println("you devided by zero...🤒");

            //     }
            // }
            // via Switch case
            // switch (opr) {
            //     case "+": System.out.println("Addition: "+(a+b));
            //     break;
            //     case "-": System.out.println("Subtraction: "+(a-b));
            //     break;
            //     case "*": System.out.println("Multiplication: "+(a*b));
            //     break;
            //     case "/": 
            //         if (b != 0) {
            //             System.out.println("Division: "+(a/b));
            //         }
            //         else {
            //             System.out.println("You divided by zero..");
            //         }
            //     break;
            //     default:System.out.println("Invalid opr...");
            // }
        
            // Loops
            // for loops
            // for (int i = 1; i < 11; i=i+1) {
            //     System.out.println("9 * " + (9*i));
            // }
            // while loop
            // Scanner sc = new Scanner(System.in);
            // int i = 1;
            // while (i < 11) {
            //     System.out.println("Google");
            //     i = i + 1;
            // }
            // int i = 10;
            // while (i<9) {
            //     System.out.println("it's posible...");
            // }
            // do { 
            //     System.out.println("it is possible");
            // } while (i < 8);

            // ques
            Scanner sc = new Scanner(System.in);
            int  n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println(sum);

    }
}