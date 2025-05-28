
import java.util.*;

class Revision {

    // Sudoku
    public static boolean sudoku(char board[][]) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isSafe(board, row, col, c)) {
                            board[row][col] = c;
                            if (sudoku(board)) {
                                return true;
                            }
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSafe(char board[][], int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }
        int gr = (row / 3) * 3;
        int gc = (col / 3) * 3;
        for (int i = gr; i < gr + 3; i++) {
            for (int j = gc; j < gc + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard(char board[][]) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Nqueens
    public static List<List<String>> solveNqueen(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        helper(0, board, allBoards, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1]);
        return allBoards;
    }

    public static void helper(int row, char board[][], List<List<String>> allBoards, boolean cols[], boolean diag1[], boolean diag2[]) {
        int n = board.length;
        if (row == n) {
            List<String> config = new ArrayList<>();
            for (char r[] : board) {
                config.add(new String(r));
            }
            allBoards.add(config);
            return;
        }
        for (int col = 0; col < n; col++) {
            int d1 = row - col + n - 1;
            int d2 = row + col;
            if (cols[col] || diag1[d1] || diag2[d2]) {
                continue;
            }
            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;
            helper(row + 1, board, allBoards, cols, diag1, diag2);
            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }

    public static void printqb(List<List<String>> solutions) {
        int count = 1;
        for (List<String> board : solutions) {
            System.out.println("Soultions# " + count++);
            for (String row : board) {
                for (char c : row.toCharArray()) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // String Permutaions
    public static void strPurm(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            String nStr = str.substring(0, i) + str.substring(i + 1);
            strPurm(nStr, perm + curChar, idx + 1);
        }
    }

    // find subsequeces
    public static void strSubs(String str, int idx, String nStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(nStr)) {
                return;
            }
            System.out.println(nStr);
            set.add(nStr);
            return;
        }
        char curChar = str.charAt(idx);
        strSubs(str, idx + 1, nStr + curChar, set);
        strSubs(str, idx + 1, nStr, set);
    }

    // keypad Strings
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void keypadpair(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char curChar = str.charAt(idx);
        String maping = keypad[curChar - '0'];
        for (int i = 0; i < maping.length(); i++) {
            keypadpair(str, idx + 1, combination + maping.charAt(i));
        }
    }

    public static void main(String args[]) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        if (sudoku(board)) {
            System.out.println("Solutions of sudoku: ");
            printBoard(board);
        } else {
            System.out.println("Solutions not possible: ");
        }
        System.out.println();
        System.out.println("NQeens problem solve:");
        List<List<String>> solutions = solveNqueen(4);
        printqb(solutions);
        System.out.println();
        System.out.println("String Permutations:");
        strPurm("abc", "", 0);
        System.out.println();
        System.out.println("Find Subsequences:");
        HashSet<String> set = new HashSet<String>();
        strSubs("lll", 0, "", set);
        System.out.println("Find Keypad pairing:");
        System.out.println();
        keypadpair("24", 0, "");
    }

}
