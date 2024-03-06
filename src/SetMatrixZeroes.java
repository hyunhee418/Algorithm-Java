public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix =
                {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] result = setZeroes(matrix);
        for (int i=0;i<result.length;i++) {
            for (int j=0;j<result[0].length;j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] setZeroes(int[][] matrix) {
        int xMax = matrix[0].length;
        int yMax = matrix.length;
        int[][] check = new int[yMax][xMax];
        for (int i = 0; i < yMax; i++) {
            for (int j = 0; j < xMax; j++) {
                if (matrix[i][j] == 0 && check[i][j] != 1) {
                    for (int k = 0; k < yMax; k++) {
                        if (check[k][j] != 1 && matrix[k][j] != 0) {
                            matrix[k][j] = 0;
                            check[k][j] = 1;
                        }
                    }
                    for (int k = 0; k < xMax; k++) {
                        if (check[i][k] != 1 && matrix[i][k] != 0) {
                            matrix[i][k] = 0;
                            check[i][k] = 1;
                        }
                    }

                }
            }
        }

        return matrix;
    }
}
