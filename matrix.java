public class matrix {
    public static void main(String[] args) {

        int[][] matrix1 = {
                { 2, 5, 3 },
                { 4, 1, 6 }
        };
        int[][] matrix2 = {
                { 1, 4, 3 },
                { 3, 2, 1 }
        };

        int[][] hasil = tambahMatrix(matrix1, matrix2);

        System.out.println("Matriks 1:");
        printMatrix(matrix1);

        System.out.println("\nMatriks 2:");
        printMatrix(matrix2);

        System.out.println("\nHasil penjumlahan matriks 1 dan matriks 2:");
        printMatrix(hasil);
    }

    public static int[][] tambahMatrix(int[][] matrix1, int[][] matrix2) {
        int baris = matrix1.length;
        int kolom = matrix1[0].length;
        int[][] hasil = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return hasil;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
