package ch1;

/**
 * @author Xu Zheng
 * @description
 */
public class Eight_ZeroMatrix {
    //there is a seemingly more efficient way in the textbook
    //but I'm gonna stick with this one
    //the matrix is M * N, let's assume M > 0 and N > 0
    private static void setZeros(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }
        for (int i = 0; i < rows.length; i++) {
            if (rows[i]) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < columns.length; i++) {
            if (columns[i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        //this is O(n^2) time
    }

    public static void main(String[] args) {
        int[][] m1 = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        setZeros(m1);
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j]);
            }
            System.out.println();
        }
    }
}
