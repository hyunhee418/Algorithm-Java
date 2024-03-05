import java.util.ArrayList;
import java.util.List;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix =
                {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = rotate(matrix);
        for (int i=0;i<result.length;i++) {
            for (int j=0;j<result.length;j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotate(int[][] matrix) {
        int len = matrix.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                list.add(matrix[len-j-1][i]);
            }
        }
        for (int li = 0; li < list.size(); li++) {
            matrix[li/len][li%len] = list.get(li);
        }
        return matrix;
    }
}
