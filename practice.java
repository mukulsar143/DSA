
//         for (int row = 0; row < 9; row++) {
//             for (int col = 0; col < 9; col++) {
//                 if (board[row][col] == '.') {
//                     for (char c = '1'; c <= '9'; c++) {
//                         if (isSafe(board, row, col, c)) {
//                             board[row][col] = c;
//                             if (sudoku(board)) {
//                                 return true;
//                             }
//                             board[row][col] = '.';
//                         }
//                     }
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public static boolean isSafe(char board[][], int row, int col, char num) {
//         for (int i = 0; i < 9; i++) {
//             if (board[row][i] == num || board[i][col] == num) {
//                 return false;
//             }
//         }
//         int gr = (row / 3) * 3;
//         int gc = (col / 3) * 3;
//         for (int i = gr; i < gr + 3; i++) {
//             for (int j = gc; j < gc + 3; j++) {
//                 if (board[i][j] == num) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public static void printBoard(char board[][]) {
//         for (int row = 0; row < 9; row++) {
//             for (int col = 0; col < 9; col++) {
//                 System.out.print(board[row][col] + " ");
//             }
//             System.out.println();
//         }
//     }
//     // Nqueens
//     public static List<List<String>> solveNqueen(int n) {
//         List<List<String>> allBoards = new ArrayList<>();
//         char board[][] = new char[n][n];
//         for (int i = 0; i < n; i++) {
//             Arrays.fill(board[i], '.');
//         }
//         helper(0, board, allBoards, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1]);
//         return allBoards;
//     }
//     public static void helper(int row, char board[][], List<List<String>> allBoards, boolean cols[], boolean diag1[], boolean diag2[]) {
//         int n = board.length;
//         if (row == n) {
//             List<String> config = new ArrayList<>();
//             for (char r[] : board) {
//                 config.add(new String(r));
//             }
//             allBoards.add(config);
//             return;
//         }
//         for (int col = 0; col < n; col++) {
//             int d1 = row - col + n - 1;
//             int d2 = row + col;
//             if (cols[col] || diag1[d1] || diag2[d2]) {
//                 continue;
//             }
//             board[row][col] = 'Q';
//             cols[col] = diag1[d1] = diag2[d2] = true;
//             helper(row + 1, board, allBoards, cols, diag1, diag2);
//             board[row][col] = '.';
//             cols[col] = diag1[d1] = diag2[d2] = false;
//         }
//     }
//     public static void printqb(List<List<String>> solutions) {
//         int count = 1;
//         for (List<String> board : solutions) {
//             System.out.println("Soultions# " + count++);
//             for (String row : board) {
//                 for (char c : row.toCharArray()) {
//                     System.out.print(c + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }
//     // String Permutaions
//     public static void strPurm(String str, String perm, int idx) {
//         if (str.length() == 0) {
//             System.out.println(perm);
//             return;
//         }
//         for (int i = 0; i < str.length(); i++) {
//             char curChar = str.charAt(i);
//             String nStr = str.substring(0, i) + str.substring(i + 1);
//             strPurm(nStr, perm + curChar, idx + 1);
//         }
//     }
//     // find subsequeces
//     public static void strSubs(String str, int idx, String nStr, HashSet<String> set) {
//         if (idx == str.length()) {
//             if (set.contains(nStr)) {
//                 return;
//             }
//             System.out.println(nStr);
//             set.add(nStr);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         strSubs(str, idx + 1, nStr + curChar, set);
//         strSubs(str, idx + 1, nStr, set);
//     }
//     // keypad Strings
//     public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
//     public static void keypadpair(String str, int idx, String combination) {
//         if (idx == str.length()) {
//             System.out.println(combination);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         String maping = keypad[curChar - '0'];
//         for (int i = 0; i < maping.length(); i++) {
//             keypadpair(str, idx + 1, combination + maping.charAt(i));
//         }
//     }
//     public static void main(String args[]) {
//         char[][] board = {
//             {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//             {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//             {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//             {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//             {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//             {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//             {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//             {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//             {'.', '.', '.', '.', '8', '.', '.', '7', '9'},};
//         if (sudoku(board)) {
//             System.out.println("Solutions of sudoku: ");
//             printBoard(board);
//         } else {
//             System.out.println("Solutions not possible: ");
//         }
//         System.out.println();
//         System.out.println("NQeens problem solve:");
//         List<List<String>> solutions = solveNqueen(4);
//         printqb(solutions);
//         System.out.println();
//         System.out.println("String Permutations:");
//         strPurm("abc", "", 0);
//         System.out.println();
//         System.out.println("Find Subsequences:");
//         HashSet<String> set = new HashSet<String>();
//         strSubs("lll", 0, "", set);
//         System.out.println("Find Keypad pairing:");
//         System.out.println();
//         keypadpair("24", 0, "");
//     }
// }
// class LeetCode {
//     // array of product except itself
//     public static int[] arrPro(int nums[]) {
//         int n = nums.length;
//         int output[] = new int[n];
//         output[0] = 1;
//         for (int i = 1; i < n; i++) {
//             output[i] = output[i - 1] * nums[i - 1];
//         }
//         int suffix = 1;
//         for (int i = n - 1; i >= 0; i--) {
//             output[i] = suffix * output[i];
//             suffix *= nums[i];
//         }
//         return output;
//     }
//     // reverse word in a String
//     public static String reverseWord(String s) {
//         String word[] = s.trim().split("\\s+");
//         String nStr = "";
//         for (int i = word.length - 1; i >= 1; i--) {
//             nStr += word[i] + " ";
//         }
//         return nStr + word[0];
//     }
//     // reverse vowels in a String
//     public static String strvowel(String s) {
//         char chars[] = s.toCharArray();
//         int left = 0;
//         int right = chars.length - 1;
//         while (left < right) {
//             while (left < right && !isVowel(chars[left])) {
//                 left++;
//             }
//             while (left < right && !isVowel(chars[right])) {
//                 right--;
//             }
//             char temp = chars[left];
//             chars[left] = chars[right];
//             chars[right] = temp;
//             left++;
//             right--;
//         }
//         return new String(chars);
//     }
//     public static boolean isVowel(char c) {
//         return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'U';
//     }
//     // can flowerbed place
//     public static boolean flowerBed(int flower[], int n) {
//         int len = flower.length;
//         for (int i = 0; i < len; i++) {
//             boolean leftEmpty = (i == 0) || (flower[i - 1] == 0);
//             boolean rightEmpty = (i == len - 1) || (flower[i + 1] == 0);
//             if (leftEmpty && rightEmpty && flower[i] == 0) {
//                 flower[i] = n;
//                 n--;
//             }
//         }
//         return n <= 0;
//     }
//     // kids with n canies
//     public static List<Boolean> Ecandies(int candies[], int extraCan) {
//         List<Boolean> res = new ArrayList<>();
//         int max = -1;
//         for (int candy : candies) {
//             if (candy > max) {
//                 max = candy;
//             }
//         }
//         for (int candy : candies) {
//             if (candy + extraCan >= max) {
//                 res.add(true);
//             } else {
//                 res.add(false);
//             }
//         }
//         return res;
//     }
//     // GCD String
//     public static String gcdStr(String str1, String str2) {
//         if (!(str1 + str2).equals(str2 + str1)) {
//             return "";
//         }
//         int lengcd = gcd(str1.length(), str2.length());
//         return str1.substring(0, lengcd);
//     }
//     public static int gcd(int len1, int len2) {
//         while (len2 != 0) {
//             int temp = len1 % len2;
//             len1 = len2;
//             len2 = temp;
//         }
//         return len1;
//     }
//     // merge String alternatively
//     public static String altStr(String str1, String str2) {
//         StringBuilder res = new StringBuilder();
//         int i = 0;
//         while (i < str1.length() && i < str2.length()) {
//             if (i < str1.length()) {
//                 res.append(str1.charAt(i));
//             }
//             if (i < str2.length()) {
//                 res.append(str2.charAt(i));
//             }
//             i++;
//         }
//         return res.toString();
//     }
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 3, 4};
//         System.out.print(Arrays.toString(arrPro(arr)));
//         System.out.println();
//         System.out.println(reverseWord("i am a software engineer at Google"));
//         System.out.println();
//         System.out.println(strvowel("IceCreAm"));
//         System.out.println();
//         int flowr[] = {1, 0, 0, 0, 1};
//         System.out.println(flowerBed(flowr, 1));
//         System.out.println();
//         int candy[] = {2, 3, 4, 5, 3};
//         List<Boolean> res = Ecandies(candy, 3);
//         System.out.println(res);
//         String str1 = "ABCABC";
//         String str3 = "ABC";
//         String str2 = "ABC";
//         String str4 = "MNC";
//         System.out.println(gcdStr(str1, str2));
//         System.out.println();
//         System.out.println(altStr(str3, str4));
//     }
// }
// class Revision2 {
//     public static boolean solve(char board[][]) {
//         for (int row = 0; row < 9; row++) {
//             for (int col = 0; col < 9; col++) {
//                 if (board[row][col] == '.') {
//                     for (char chars = '1'; chars <= '9'; chars++) {
//                         if (isSafe(board, row, col, chars)) {
//                             board[row][col] = chars;
//                             if (solve(board)) {
//                                 return true;
//                             }
//                             board[row][col] = '.';
//                         }
//                     }
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public static boolean isSafe(char board[][], int row, int col, char num) {
//         for (int i = 0; i < 9; i++) {
//             if (board[row][i] == num || board[i][col] == num) {
//                 return false;
//             }
//         }
//         int gr = (row / 3) * 3;
//         int gc = (col / 3) * 3;
//         for (int i = gr; i < gr + 3; i++) {
//             for (int j = gc; j < gc + 3; j++) {
//                 if (board[i][j] == num) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public static void prbd(char board[][]) {
//         for (int row = 0; row < 9; row++) {
//             for (int col = 0; col < 9; col++) {
//                 System.out.print(board[row][col] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static List<List<String>> nQueen(int n) {
//         List<List<String>> allBoard = new ArrayList<>();
//         char board[][] = new char[n][n];
//         for (int i = 0; i < n; i++) {
//             Arrays.fill(board[i], '.');
//         }
//         helper(0, board, allBoard, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1]);
//         return allBoard;
//     }
//     public static void helper(int row, char board[][], List<List<String>> allBoard, boolean cols[], boolean diag1[], boolean diag2[]) {
//         int n = board.length;
//         if (row == n) {
//             List<String> config = new ArrayList<>();
//             for (char r[] : board) {
//                 config.add(new String(r));
//             }
//             allBoard.add(config);
//             return;
//         }
//         for (int col = 0; col < n; col++) {
//             int d1 = row - col + n - 1;
//             int d2 = row + col;
//             if (cols[col] || diag1[d1] || diag2[d2]) {
//                 continue;
//             }
//             board[row][col] = 'Q';
//             cols[col] = diag1[d1] = diag2[d2] = true;
//             helper(row + 1, board, allBoard, cols, diag1, diag2);
//             board[row][col] = '.';
//             cols[col] = diag1[d1] = diag2[d2] = false;
//         }
//     }
//     public static void printqb(List<List<String>> solution) {
//         int count = 1;
//         for (List<String> board : solution) {
//             System.out.println("Soultion# " + count++);
//             for (String row : board) {
//                 for (char c : row.toCharArray()) {
//                     System.out.print(c + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }
//     public static void revrseString(String str, int idx) {
//         if (idx == 0) {
//             System.out.print(str.charAt(idx));
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         revrseString(str, idx - 1);
//     }
//     public static void strperm(String str, int idx, String perm) {
//         if (str.length() == 0) {
//             System.out.println(perm);
//             return;
//         }
//         for (int i = 0; i < str.length(); i++) {
//             char curchar = str.charAt(i);
//             String newStr = str.substring(0, i) + str.substring(i + 1);
//             strperm(newStr, idx + 1, perm + curchar);
//         }
//     }
//     public static int first = -1;
//     public static int last = -1;
//     public static void strOcc(String str, int idx, char elem) {
//         if (idx == str.length() - 1) {
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         if (elem == curChar) {
//             if (first == -1) {
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }
//         strOcc(str, idx + 1, elem);
//     }
//     public static void tHanoi(int n, String s, String h, String d) {
//         if (n == 1) {
//             System.out.println("transfer disc " + n + " from " + s + " to " + d);
//             return;
//         }
//         tHanoi(n - 1, s, d, h);
//         System.out.println("transfer disc " + n + " from " + s + " to " + d);
//         tHanoi(n - 1, h, s, d);
//     }
//     public static void moveStr(String str, int idx, int count, String nStr) {
//         if (idx == str.length()) {
//             for (int i = 0; i < count; i++) {
//                 nStr += 'i';
//             }
//             System.out.println(nStr);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         if (curChar == 'i') {
//             count++;
//             moveStr(str, idx + 1, count, nStr);
//         } else {
//             nStr += curChar;
//             moveStr(str, idx + 1, count, nStr);
//         }
//     }
//     public static boolean sorArr(int arr[], int idx) {
//         if (idx == arr.length - 1) {
//             return true;
//         }
//         if (arr[idx] >= arr[idx + 1]) {
//             return false;
//         }
//         return sorArr(arr, idx + 1);
//     }
//     public static boolean map[] = new boolean[26];
//     public static void remDup(String str, int idx, String nStr) {
//         if (idx == str.length()) {
//             System.out.println(nStr);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         if (map[curChar - 'A']) {
//             remDup(str, idx + 1, nStr);
//         } else {
//             nStr += curChar;
//             map[curChar - 'A'] = true;
//             remDup(str, idx + 1, nStr);
//         }
//     }
//     public static void subStr(String str, int idx, String nStr, HashSet<String> set) {
//         if (idx == str.length()) {
//             if (set.contains(nStr)) {
//                 return;
//             }
//             System.out.println(nStr);
//             set.add(nStr);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         // to be
//         subStr(str, idx + 1, nStr + curChar, set);
//         // not to be
//         subStr(str, idx + 1, nStr, set);
//     }
//     public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
//     public static void pairKey(String str, int idx, String com) {
//         if (idx == str.length()) {
//             System.out.println(com);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         String maping = keypad[curChar - '0'];
//         for (int i = 0; i < maping.length(); i++) {
//             pairKey(str, idx + 1, com + maping.charAt(i));
//         }
//     }
//     public static void strperm2(char arr[], int idx) {
//         if (idx == arr.length) {
//             System.out.println(String.valueOf(arr));
//             return;
//         }
//         for (int i = idx; i < arr.length; i++) {
//             swap(arr, idx, i);
//             strperm2(arr, idx + 1);
//             swap(arr, idx, i);
//         }
//     }
//     public static void swap(char arr[], int i, int j) {
//         char temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//     public static int pathcount(int i, int j, int n, int m) {
//         if (i == n || j == m) {
//             return 0;
//         }
//         if (i == (n - 1) && j == (m - 1)) {
//             return 1;
//         }
//         int way1 = pathcount(i + 1, j, n, m);
//         int way2 = pathcount(i, j + 1, n, m);
//         return way1 + way2;
//     }
//     public static int placetiles(int n, int m) {
//         if (n < m) {
//             return 1;
//         }
//         if (n == m) {
//             return 2;
//         }
//         int way1 = placetiles(n - 1, m);
//         int way2 = (n - 1) * placetiles(n - m, m);
//         return way1 + way2;
//     }
//     public static int pairFrind(int n) {
//         if (n <= 1) {
//             return 1;
//         }
//         int way1 = pairFrind(n - 1);
//         int way2 = (n - 1) * pairFrind(n - 2);
//         return way1 + way2;
//     }
//     public static void findsums(int n, ArrayList<Integer> subset) {
//         if (n == 0) {
//             printsubset(subset);
//             return;
//         }
//         subset.add(n);
//         findsums(n - 1, subset);
//         subset.remove(subset.size() - 1);
//         findsums(n - 1, subset);
//     }
//     public static void printsubset(ArrayList<Integer> subset) {
//         for (int i = 0; i < subset.size(); i++) {
//             System.err.print(subset.get(i));
//         }
//         System.out.println();
//     }
//     public static int factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }
//         return n * factorial(n - 1);
//     }
//     public static void fibonacci(int a, int b, int n) {
//         if (n == 0) {
//             return;
//         }
//         int c = a + b;
//         System.out.print(c + " ");
//         fibonacci(b, c, n - 1);
//     }
//     public static int xpr(int x, int n) {
//         if (x == 0) {
//             return 0;
//         }
//         if (n == 0) {
//             return 1;
//         }
//         int xpwrn1 = xpr(x, n - 1);
//         int xprn = x * xpwrn1;
//         return xprn;
//     }
//     public static int xprn(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         if (x == 0) {
//             return 0;
//         }
//         if (n % 2 == 0) {
//             return xprn(x, n / 2) * xprn(x, n / 2);
//         } else {
//             return xprn(x, n / 2) * xprn(x, n / 2) * x;
//         }
//     }
//     public static void main(String args[]) {
//         char[][] board = {
//             {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//             {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//             {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//             {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//             {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//             {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//             {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//             {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//             {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
//         };
//         if (solve(board)) {
//             System.out.println("Solve Sudoku :");
//             prbd(board);
//         } else {
//             System.out.println("problem not solve");
//         }
//         System.out.println();
//         System.out.println("SOlve nQueen");
//         List<List<String>> solution = nQueen(4);
//         printqb(solution);
//         System.out.println();
//         String str = "ELGOOG";
//         revrseString(str, str.length() - 1);
//         System.out.println();
//         strperm("ABC", 0, "");
//         System.out.println();
//         strOcc("Microsoft", 0, 'o');
//         System.out.println();
//         tHanoi(2, "Source Pol", "Help Pol", "Destination Pol");
//         System.out.println();
//         moveStr("gooiglie", 0, 0, "");
//         System.out.println();
//         int arr[] = {4, 5, 6, 4, 9};
//         System.err.println(sorArr(arr, 0));
//         System.out.println();
//         remDup("ABBCDEE", 0, "");
//         System.out.println();
//         HashSet<String> set = new HashSet<>();
//         subStr("aaa", 0, "", set);
//         System.out.println();
//         pairKey("26", 0, "");
//         String str2 = "abc";
//         System.out.println();
//         strperm2(str2.toCharArray(), 0);
//         System.out.println();
//         System.out.println(pathcount(0, 0, 4, 2));
//         System.out.println(placetiles(4, 2));
//         System.out.println(pairFrind(9));
//         System.out.println();
//         ArrayList<Integer> subset = new ArrayList<>();
//         findsums(3, subset);
//         System.out.println();
//         System.out.print(factorial(5));
//         System.out.println();
//         int a = 0;
//         int b = 1;
//         System.out.print(a + " ");
//         System.out.print(b + " ");
//         fibonacci(a, b, 5);
//         System.out.println();
//         System.out.println(xpr(2, 4));
//         System.out.println();
//         System.out.println(xprn(2, 6));
//     }
// }
// class Revision5 {
//     public static void arrs(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             System.err.print(arr[i] + " ");
//         }
//     }
//     public static void bubleSort(int arr[]) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         arrs(arr);
//     }
//     public static void selectionSort(int arr[]) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             int smallest = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[smallest] > arr[j]) {
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         arrs(arr);
//     }
//     public static void insertionSort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             int current = arr[i];
//             int j = i - 1;
//             while (j >= 0 && current <= arr[j]) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = current;
//         }
//         arrs(arr);
//     }
//     public static void mergeSort(int arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         int mid = si + (ei - si) / 2;
//         mergeSort(arr, si, mid);
//         mergeSort(arr, mid + 1, ei);
//         conquer(arr, si, mid, ei);
//     }
//     public static void conquer(int arr[], int si, int mid, int ei) {
//         int merged[] = new int[ei - si + 1];
//         int idx1 = si;
//         int idx2 = mid + 1;
//         int x = 0;
//         while (idx1 <= mid && idx2 <= ei) {
//             if (arr[idx1] <= arr[idx2]) {
//                 merged[x++] = arr[idx1++];
//             } else {
//                 merged[x++] = arr[idx2++];
//             }
//         }
//         while (idx1 <= mid) {
//             merged[x++] = arr[idx1++];
//         }
//         while (idx2 <= ei) {
//             merged[x++] = arr[idx2++];
//         }
//         for (int i = 0, j = si; i < merged.length; i++, j++) {
//             arr[j] = merged[i];
//         }
//     }
//     public static void quicksort(int arr[], int low, int high) {
//         if (low < high) {
//             int pivot_index = partition(arr, low, high);
//             quicksort(arr, low, pivot_index - 1);
//             quicksort(arr, pivot_index + 1, high);
//         }
//     }
//     public static int partition(int arr[], int low, int high) {
//         int pivot = arr[high];
//         int i = low - 1;
//         for (int j = low; j < high; j++) {
//             i++;
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }
//         i++;
//         int temp = arr[i];
//         arr[i] = pivot;
//         arr[high] = temp;
//         return i;
//     }
//     public static void main(String args[]) {
//         System.out.println("Bubble Sort# ");
//         int arr[] = {4, 3, 5, 6, 7, 0, 1};
//         bubleSort(arr);
//         System.out.println();
//         System.out.println("Selection Sort# ");
//         int arr2[] = {6, 4, 0, 2, 9, 7, 6, 4, 3};
//         selectionSort(arr2);
//         System.out.println();
//         System.out.println("Insertions Sort# ");
//         int arr3[] = {6, 4, 0, 1, 2, 9, 7, 8, 5, 3};
//         insertionSort(arr3);
//         System.out.println();
//         System.out.println("Merge Sort# ");
//         int arr4[] = {6, 4, 0, 1, 2, 9, 7, 8, 5, 3, 10, 11};
//         int n = arr4.length;
//         mergeSort(arr4, 0, n - 1);
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr4[i] + " ");
//         }
//         System.out.println();
//         System.out.println("Quick Sort# ");
//         int arr6[] = {6, 4, 0, 1, 2, 9, 7, 8, 5, 3, 10, 11};
//         int n3 = arr6.length;
//         quicksort(arr4, 0, n3 - 1);
//         for (int i = 0; i < n3; i++) {
//             System.out.print(arr6[i] + " ");
//         }
//         System.out.println();
//     }
// }
class Revision6 {

    public static void reverseStr(StringBuilder sb) {
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }

    public static void replaceChar(String str, char cc, char rc) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == cc) {
                result += rc;
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void createUsername(String email) {
        String username = "";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                username += email.charAt(i);
            }
        }
        System.out.println(username);
    }

    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("elgooG");
        reverseStr(sb);
        String str = "Google";
        char cc = 'e';
        char rc = 'i';
        replaceChar(str, cc, rc);
        String email = "mukulgoogler@gmail.com";
        createUsername(email);
    }
}
