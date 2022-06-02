package ch1;

/**
 * @author Xu Zheng
 * @description
 */
public class Seven_RotateMatrix {
    //let's assume the matrix is n*n and length > 0
    private static void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp = 0;
        //note that j ends before n-i-1
        //drawing helps
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                temp = matrix[i][j]; //top
                matrix[i][j] = matrix[n - 1 - j][i]; //left to top
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];  //bottom to left
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];  //right to bottom
                matrix[j][n - 1 - i] = temp; //top to right
            }
        }
        //this is O(n^2) time, which is the best we can do
    }

    public static void main(String[] args) {
        int[][] m1 = {{1}};
        int[][] m2 = {{1, 2}, {3, 4}};
        int[][] m3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(m1);
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j]);
            }
            System.out.println();
        }
        rotate(m2);
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print(m2[i][j]);
            }
            System.out.println();
        }
        rotate(m3);
        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                System.out.print(m3[i][j]);
            }
            System.out.println();
        }
    }
}
