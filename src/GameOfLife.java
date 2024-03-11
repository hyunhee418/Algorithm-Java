public class GameOfLife {

    public static void main(String[] args) {
        int[][] board =
                {{1,1},{1,0}};
        int[][] result = gameOfLife(board);
        for (int i=0;i<result.length;i++) {
            for (int j=0;j<result[0].length;j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] gameOfLife(int[][] board) {
        int maxX = board[0].length;
        int maxY = board.length;
        int[][] result = new int[maxY][maxX];
        for (int y = 0; y < maxY; y++) {
            for (int x = 0; x < maxX; x++) {
                int live = 0;
                for (int ny = -1; ny < 2; ny++) {
                    if (y + ny >= 0 && y + ny < maxY) {
                        for (int nx = -1; nx < 2; nx++) {
                            if (!(nx == 0 && ny == 0) && x + nx >= 0 && x + nx < maxX) {
                                if (board[y + ny][x + nx] == 1) live++;
                            }
                        }
                    }
                }
                if (live == 2) result[y][x] = board[y][x];
                if (live == 3) result[y][x] = 1;
            }
        }
        for (int y = 0; y < maxY; y++) {
            for (int x = 0; x < maxX; x++) {
                board[y][x] = result[y][x];
            }
        }
        return board;
    }
}
