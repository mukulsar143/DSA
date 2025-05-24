
import java.util.ArrayList;

//     // Print the sum of first n natural numbers.
//     public static int addSum(int a, int b) {
//         if (a > b) {
//             return 0;
//         }
//         return a + addSum(a + 1, b);
//     }
//     // Print factorial of a number n.
//     public static int factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }
//         int fact = n * factorial(n - 1);
//         return fact;
//     }
//     // Print the fibonacci sequence till nth term.
//     public static int fibonacci(int a, int b, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         int c = a + b;
//         System.out.print(c + " ");
//         return fibonacci(b, c, n - 1);
//     }
//     // Print x^n (with stack height = n)
//     public static int printPower(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         if (x == 0) {
//             return 0;
//         }
//         int xpowernm1 = printPower(x, n - 1);
//         int xpowern = x * xpowernm1;
//         return xpowern;
//     }
//     // Print x^n (with stack height = logn)
//     public static int isPowerLog(int x, int n) {
//         if (x == 0) {
//             return 0;
//         }
//         if (n == 0) {
//             return 1;
//         }
//         if (n % 2 == 0) {
//             return isPowerLog(x, n / 2) * isPowerLog(x, n / 2);
//         } else {
//             return isPowerLog(x, n / 2) * isPowerLog(x, n / 2) * x;
//         }
//     }
//     public static void main(String args[]) {
//         int ans = addSum(1, 5);
//         int a = 0;
//         int b = 1;
//         int n = 6;
//         System.out.println(ans);
//         System.out.println(factorial(6));
//         System.out.print(a + " ");
//         System.out.print(b + " ");
//         System.out.println(fibonacci(a, b, n - 1));
//         System.out.println(printPower(2, 5));
//         System.out.println(isPowerLog(2, 7));
//     }
// }
// class Recursion2 {
//     // Tower of Hanoi
//     public static int step = 1;
//     public static void towerOfHanoi(int n, String src, String help, String dest) {
//         if (n == 1) {
//             System.out.println(step++ + "." + " Transfer Disc " + n + " from " + src + "  to " + dest);
//             return;
//         }
//         towerOfHanoi(n - 1, src, dest, help);
//         System.out.println(step++ + "." + " Transfer Disc " + n + " from " + src + "  to " + dest);
//         towerOfHanoi(n - 1, help, src, dest);
//     }
//     // Reverse String
//     public static void reverseStr(String str, int idx) {
//         if (idx == 0) {
//             System.out.print(str.charAt(idx));
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         reverseStr(str, idx - 1);
//     }
//     // string of char occurance count
//     public static int first = -1;
//     public static int last = -1;
//     public static void strOcc(String str, int idx, char element) {
//         if (idx == str.length() - 1) {
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         if (curChar == element) {
//             if (first == -1) {
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }
//         strOcc(str, idx + 1, element);
//     }
//     // Check Sorted Array
//     public static boolean isSorted(int arr[], int idx) {
//         if (idx == arr.length - 1) {
//             return true;
//         }
//         if (arr[idx] >= arr[idx + 1]) {
//             return false;
//         }
//         return isSorted(arr, idx + 1);
//     }
//     // move repeated char into last
//     public static void moveE(String str, int idx, int count, String newString) {
//         if (idx == str.length()) {
//             for (int i = 0; i < count; i++) {
//                 newString += 'i';
//             }
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if (currChar == 'i') {
//             count++;
//             moveE(str, idx + 1, count, newString);
//         } else {
//             newString += currChar;
//             moveE(str, idx + 1, count, newString);
//         }
//     }
//     public static void main(String args[]) {
//         int n = 2;
//         towerOfHanoi(n, "Source Pol", "Help Pol", "Destination Pol");
//         System.out.println();
//         String str = "elgooG";
//         reverseStr(str, str.length() - 1);
//         System.out.println();
//         String str1 = "ahbfgaaolma";
//         strOcc(str1, 0, 'a');
//         System.out.println();
//         int arr[] = {1, 2, 9, 10};
//         System.out.println(isSorted(arr, 0));
//         System.out.println();
//         String str2 = "Gooiglie";
//         moveE(str2, 0, 0, "");
//     }
// }
// class Recursion3 {
//     // Remove Duplicates in Strings
//     public static boolean map[] = new boolean[26];
//     public static void removeDuplicates(String str, int idx, String newString) {
//         if (idx == str.length()) {
//             System.out.println(newString);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         if (map[curChar - 'a']) {
//             removeDuplicates(str, idx + 1, newString);
//         } else {
//             newString += curChar;
//             map[curChar - 'a'] = true;
//             removeDuplicates(str, idx + 1, newString);
//         }
//     }
//     // Subsequences of String
//     public static void strSubsequences(String str, int idx, String newString) {
//         if (idx == str.length()) {
//             System.out.println(newString);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         // to be
//         strSubsequences(str, idx + 1, newString + curChar);
//         // not to be
//         strSubsequences(str, idx + 1, newString);
//     }
//     // Unique Subsequnces of String
//     public static void strUniqueSubsequences(String str, int idx, String newString, HashSet<String> set) {
//         if (idx == str.length()) {
//             if (set.contains(newString)) {
//                 return;
//             } else {
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }
//         char curChar = str.charAt(idx);
//         // to be
//         strUniqueSubsequences(str, idx + 1, newString + curChar, set);
//         // not to be
//         strUniqueSubsequences(str, idx + 1, newString, set);
//     }
//     // keypad number String mapping
//     public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
//     public static void keypadStr(String str, int idx, String combination) {
//         if (idx == str.length()) {
//             System.out.println(combination);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         String maping = keypad[curChar - '0'];
//         for (int i = 0; i < maping.length(); i++) {
//             keypadStr(str, idx + 1, combination + maping.charAt(i));
//         }
//     }
//     // Solution of printing of the quenstion
//     public static void main(String args[]) {
//         HashSet<String> set = new HashSet<>();
//         removeDuplicates("abbcbda", 0, "");
//         System.out.println();
//         strSubsequences("aaa", 0, "");
//         System.out.println();
//         strUniqueSubsequences("aaa", 0, "", set);
//         System.out.println();
//         keypadStr("2548", 0, "");
//     }
// }
class Recursion4 {

    // String Permutation 1
    public static void strPerm(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            strPerm(newStr, perm + curChar);
        }
    }

    // String Permutation 1
    public static void strPerm2(char arr[], int idx) {
        if (idx == arr.length) {
            System.out.println(String.valueOf(arr));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            swap(arr, idx, i);
            strPerm2(arr, idx + 1);
            swap(arr, idx, i);
        }
    }

    public static void swap(char arr[], int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Maze Path Cuunt Print
    public static int pathCount(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == (n - 1) && j == (m - 1)) {
            return 1;
        }
        int way1 = pathCount(i + 1, j, n, m);

        int way2 = pathCount(i, j + 1, n, m);
        return way1 + way2;
    }

    // Places tiles
    public static int placetile(int n, int m) {
        if (n < m) {
            return 1;
        } else if (n == m) {
            return 2;
        }
        int way1 = placetile(n - 1, m);
        int way2 = placetile(n - m, m);
        return way1 + way2;
    }

    // Pairing the firends
    public static int pairFrind(int n) {
        if (n <= 1) {
            return 1;
        }
        int way1 = pairFrind(n - 1);
        int way2 = (n - 1) * pairFrind(n - 2);
        return way1 + way2;
    }

    public static void findSubs(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubs(n - 1, subset);
        subset.remove(subset.size() - 1);
        findSubs(n - 1, subset);
    }

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String str = "abc";
        strPerm2(str.toCharArray(), 0);
        System.out.println();
        strPerm(str, "");
        System.out.println();
        int tot = pathCount(0, 0, 3, 3);
        System.out.println(tot);
        System.out.println();
        int totw = placetile(4, 2);
        System.out.println(totw);
        System.out.println(pairFrind(6));
        ArrayList<Integer> subset = new ArrayList<>();
        findSubs(3, subset);
    }
}
