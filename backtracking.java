
import java.util.*;

// class Backtracking {
//     // String Permutaions
//     public static void stringPermutation(String str, String strPerm, int idx) {
//         if (str.length() == 0) {
//             System.out.println(strPerm);
//             return;
//         }
//         for (int i = 0; i < str.length(); i++) {
//             char curChar = str.charAt(i);
//             String newStr = str.substring(0, i) + str.substring(i + 1);
//             stringPermutation(newStr, strPerm + curChar, idx + 1);
//         }
//     }
//     public boolean isSafe(int row, int col, char board[][]) {
//         // horizontal
//         for (int i = 0; i < board.length; i++) {
//             if (board[row][i] == 'Q') {
//                 return false;
//             }
//         }
//         for (int j = 0; j < board.length; j++) {
//             if (board[j][col] == 'Q') {
//                 return false;
//             }
//         }
//         // upper left
//         int r = row;
//         for (int c = col; c >= 0 && r >= 0; r--, c--) {
//             if (board[r][c] == 'Q') {
//                 return false;
//             }
//         }
//         // upper right
//         r = row;
//         for (int c = col; c < board.length && r >= 0; r--, c++) {
//             if (board[r][c] == 'Q') {
//                 return false;
//             }
//         }
//         // lower left
//         r = row;
//         for (int c = col; c >= 0 && r < board.length; r++, c--) {
//             if (board[r][c] == 'Q') {
//                 return false;
//             }
//         }
//         // lower right
//         for (int c = col; c < board.length && r < board.length; c++, r++) {
//             if (board[r][c] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public void saveBoard(char board[][], List<List<String>> allBoards) {
//         String row = "";
//         List<String> newboard = new ArrayList<>();
//         for (int i = 0; i < board.length; i++) {
//             row = "";
//             for (int j = 0; j < board[0].length; j++) {
//                 if (board[i][j] == 'Q') {
//                     row += 'Q';
//                 } else {
//                     row += '.';
//                 }
//             }
//             newboard.add(row);
//         }
//         allBoards.add(newboard);
//     }
//     // Solve N Queens Problem
//     public void helper(char board[][], List<List<String>> allBoards, int col) {
//         if (col == board.length) {
//             saveBoard(board, allBoards);
//             return;
//         }
//         for (int row = 0; row < board.length; row++) {
//             if (isSafe(row, col, board)) {
//                 board[row][col] = 'Q';
//                 helper(board, allBoards, col + 1);
//                 board[row][col] = '.';
//             }
//         }
//     }
//     public List<List<String>> solveNQueens(int n) {
//         List<List<String>> allBoards = new ArrayList<>();
//         char board[][] = new char[n][n];
//         for (int i = 0; i < n; i++) {
//             Arrays.fill(board[i], '.');
//         }
//         helper(board, allBoards, 0);
//         return allBoards;
//     }
//     public static void main(String args[]) {
//         Backtracking obj = new Backtracking();
//         stringPermutation("abc", "", 0);
//         List<List<String>> solutions = obj.solveNQueens(4);
//         for (List<String> board : solutions) {
//             for (String row : board) {
//                 System.out.println(row);
//             }
//             System.out.println();
//         }
//     }
// }
// NQueens Another approach to solve
// class NQueens {
//     public void helper(int row, int n, char[][] board, List<List<String>> allBoards, boolean cols[], boolean diag1[], boolean diag2[]) {
//         if (row == n) {
//             saveBoard(board, allBoards);
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
//             helper(row + 1, n, board, allBoards, cols, diag1, diag2);
//             board[row][col] = '.';
//             cols[col] = diag1[d1] = diag2[d2] = false;
//         }
//     }
//     public void saveBoard(char board[][], List<List<String>> allBoards) {
//         List<String> newBoard = new ArrayList<>();
//         for (char row[] : board) {
//             newBoard.add(new String(row));
//         }
//         allBoards.add(newBoard);
//     }
//     public List<List<String>> solveNQueen(int n) {
//         List<List<String>> allBoards = new ArrayList<>();
//         char board[][] = new char[n][n];
//         for (int i = 0; i < n; i++) {
//             Arrays.fill(board[i], '.');
//         }
//         boolean cols[] = new boolean[n];
//         boolean diag1[] = new boolean[2 * n - 1];
//         boolean diag2[] = new boolean[2 * n - 1];
//         helper(0, n, board, allBoards, cols, diag1, diag2);
//         return allBoards;
//     }
//     public static void main(String args[]) {
//         NQueens obj = new NQueens();
//         List<List<String>> solutions = obj.solveNQueen(4);
//         System.out.println();
//         System.out.println("NQueens Solutions: ");
//         for (List<String> board : solutions) {
//             for (String row : board) {
//                 System.out.println(row);
//             }
//             System.out.println();
//         }
//     }
// }
// Another NQueens solving approach with visual
class NQueensVisual {

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

    public static void printBoards(List<List<String>> boards) {
        int count = 1;
        for (List<String> board : boards) {
            System.out.println("Solutions #" + count++);
            for (String row : board) {
                for (char c : row.toCharArray()) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static List<List<String>> solveNQueen1(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        helper(0, board, allBoards, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1]);
        return allBoards;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueen1(n);
        printBoards(solutions);
    }
}
