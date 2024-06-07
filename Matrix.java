public class Matrix {
    public static void main(String[] args) {
        int[][] array = {{2, 4}, {5, 6}, {2, 0}, {1, 10}};
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
}
