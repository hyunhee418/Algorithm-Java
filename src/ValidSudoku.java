public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board =
                {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
        System.out.print(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        boolean result = true;
        // row
        for (int i = 0; i < 9; i++) {
            int[] check = new int[9];
            char[] row = board[i];
            for (int j = 0; j < 9; j++) {
                if (row[j] != '.') {
                    int element = row[j]-'0';
                    if (check[element - 1] == 1) return false;
                    check[element - 1] = 1;
                }
            }
        }
        // column
        for (int i = 0; i < 9; i++) {
            int[] check = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    int element = board[j][i]-'0';
                    if (check[element - 1] == 1) return false;
                    check[element - 1] = 1;
                }
            }
        }
        // sub-boxes
        int box = 0;
        while (box != 9) {
            int row = box % 3 * 3;
            int column = box / 3 * 3;
            int[] check = new int[9];
            for (int i = row; i < row+3; i++) {
                for (int j = column; j < column + 3; j++) {
                    if (board[i][j] != '.') {
                        int element = board[i][j]-'0';
                        if (check[element - 1] == 1) return false;
                        check[element - 1] = 1;
                    }
                }
            }
            box++;

        }
        return result;
    }
}
