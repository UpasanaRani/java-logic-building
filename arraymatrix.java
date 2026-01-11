public class arraymatrix {
    public static void main(String[] args) {
        // Sum of 2 matrix of size 2*3

        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrix2 = { { 7, 8, 9 }, { 10, 11, 12 } };
        int[][] result = { { 0, 0, 0 }, { 0, 0, 0 } };

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
                // result[i][j] = matrix1[i][j] + matrix2[i][j];

            }
            System.out.println();
        }

        // System.out.println();
    }

}
