public class Massiv {


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {4, 5},
                {7, 8}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows-1; i++) {
            for (int j = 0; j < columns; j++) {
                int element = matrix[i][j];
                int element2 = matrix[i][j+1];
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
