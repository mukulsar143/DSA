import java.util.*;

public class bitManipulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 5;
        int pos = 3;
        
        // Get Bit
        int bitmask_g = 1 << pos;
        if ((bitmask_g & n) == 0) {
            System.out.println("Bit was 0:");
        } else {
            System.out.println("Bit was 1:");

        }
        // Set Bit
        int bitmask_s = 1 << pos;
        int newNumber = bitmask_s | n;
        System.out.println(newNumber);


        // Update Bit
        int bitmask_U = 1<<pos;
        int notbitmask = ~(bitmask_U);
        int newNumber1 = notbitmask & n;
        System.out.println(newNumber1);

        // Clear bit
        int bitmask_c = 1<<pos;
        System.out.print("Enter the operation which one is perform: ");
        int operation = sc.nextInt();
        if (operation == 1){
            int newNumber2 = bitmask_c | n;
            System.out.println(newNumber2); 
        } else if (operation > 1) {
            operation = 0;
            int notbitmask2 = ~(bitmask_c);
            int newNumber4 = notbitmask2 & n;
            System.out.println(newNumber4);
        } else {
            int notbitmask2 = ~(bitmask_c);
            int newNumber4 = notbitmask2 & n;
            System.out.println(newNumber4);

        }
        
    }
}
