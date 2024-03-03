import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import static java.lang.Long.sum;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix =
                {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.print(isValidSudoku(matrix));
    }
    public static List<Integer> isValidSudoku(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int maxRow =matrix.length;
        int maxColumn = matrix[0].length;
        int[][] check = new int[maxRow][maxColumn];
        int row = 0;
        int column = 0;
        int totalInd = 0;
        while (checkEnd(check, maxRow, maxColumn)){
            if (totalInd % 4 == 0) {
                while (column < maxColumn) {
                    if (check[row][column] != 1) {
                        result.add(matrix[row][column]);
                        check[row][column] = 1;
                    }
                    if (column + 1 == maxColumn || check[row][column+1] == 1) break;
                    column++;
                }
            } else if (totalInd % 4 == 1) {
                while (row < maxRow) {
                    if (check[row][column] != 1) {
                        result.add(matrix[row][column]);
                        check[row][column] = 1;
                    }
                    if (row + 1 == maxRow || check[row+1][column] == 1) break;
                    row++;
                }
            } else if (totalInd % 4 == 2) {
                while (column >= 0) {
                    if (check[row][column] != 1) {
                        result.add(matrix[row][column]);
                        check[row][column] = 1;
                    }
                    if (column - 1 < 0 || check[row][column-1] == 1) break;
                    column--;
                }
            } else {
                while (row >= 0) {
                    if (check[row][column] != 1) {
                        result.add(matrix[row][column]);
                        check[row][column] = 1;
                    }
                    if (row - 1 < 0 || check[row-1][column] == 1) break;
                    row--;
                }
            }
            totalInd ++;
        }
        return result;
    }

    private static boolean checkEnd(int[][] check, int maxRow, int maxColumn) {
        int total = 0;
        for (int[] checkRow:check) {
            total += Arrays.stream(checkRow).sum();
        }
        return total != maxRow * maxColumn;
    }
}
