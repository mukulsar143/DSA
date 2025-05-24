import java.util.*;

// class Strings {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // String cname = sc.nextLine();
//         // System.out.println(cname);
//         // System.out.println(cname.length());

//         // for (int i = 0; i< cname.length(); i++) {
//         //     System.out.println(cname.charAt(i));
//         // }
//         // String Comparition

//         // String name = sc.nextLine();
//         // String name1 = sc.nextLine();
//         // if (name.compareTo(name1) == 0) {
//         //     System.out.println("String are Equal");
//         // } else {
//         //     System.out.println("String are not Equal");
            
//         // }
//         // System.out.println(name.substring(0, 5));
//         int number = 12345;
//         String str = Integer.toString(number);
//         System.out.println(str);
        

//     }
// }

// class Strings {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // int size = sc.nextInt();
//         // String arr[] = new String[size];

//         // int totlenght = 0;

//         // for (int i = 0; i< size; i++) {
//         //     arr[i] = sc.next();
//         //     totlenght += arr[i].length();
//         // }
//         // System.out.println(totlenght);

//         // Replace word

//         String str = sc.next();

//         String result = "";

//         for (int i = 0; i <str.length(); i++) {
//             if(str.charAt(i) == sc.nextByte()) {
//                 result += nextByte();
//             }
//             else {
//                 result += str.charAt(i);
//             }
//         }
//         System.out.println(result);
//     }
// }

// class ReplaceChar {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         char tstr = sc.next().charAt(0);
//         char rstr = sc.next().charAt(0);
//         String result = "";

//         for (int i = 0; i < str.length(); i++) {
//             if(str.charAt(i) == tstr) {
//                 result += rstr;
//             }
//             else {
//                 result += str.charAt(i);
//             }
//         }
//         System.out.println(result);

//     }
// }

// class CreateEmailViaUsername {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String email = sc.next();
//         String username = "";

//         for (int i = 0; i<email.length(); i++) {
//             if (email.charAt(i) == '@') {
//                 break;
//             }
//             else {
//                 username += email.charAt(i);
//             }
//         }
//         System.out.println("Username: "+ username);
//     }
// }


// StringBuilder

// class Strings {
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("G");
//         // System.out.println(sb);
//         // System.out.println(sb.charAt(5));
//         // sb.setCharAt(5, 'i');
//         // System.out.println(sb);
//         // sb.insert(5, "im");
//         // System.out.println(sb);
//         // sb.delete(5,8);
//         // System.out.println(sb);
//         // sb.insert(5, "e");
//         // System.out.println(sb);
//         sb.append("o");
//         sb.append("o");
//         sb.append("g");
//         sb.append("l");
//         sb.append("e");
//         System.out.println(sb);
//         System.out.println(sb.length());
//         System.out.println(sb.reverse());

//         for  (int i = sb.length()-1; i > 0; i--){
//                 sb.append();
//             }
//             System.out.print(sb);
//     }
// }

class ReverseString {
    public static void main(String args[]) {
        StringBuilder sd = new StringBuilder("elgooG");

        for (int i = 0; i<sd.length()/2; i++) {
            int front = i;
            int back = sd.length() - 1 - i;
            
            char frontchar = sd.charAt(front);
            char backchar = sd.charAt(back);
            
            sd.setCharAt(front, backchar);
            sd.setCharAt(back, frontchar);
        }
        System.out.println(sd);
    }
}