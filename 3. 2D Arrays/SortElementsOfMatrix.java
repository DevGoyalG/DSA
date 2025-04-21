import java.util.Arrays;

public class SortElementsOfMatrix {
    public static int[][] sortedMatrix(int matrix[][], int N) {
        
        // Firstly Flatten the matrix into a 1D array
        int[] flat = new int[N*N];
        
        int index = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                flat[index] = matrix[i][j];
                index++;
            }
        }
        
        // Now, Sort the 1D array
        Arrays.sort(flat);
        
        // Fill the sorted elements back into the matrix
        index = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                matrix[i][j] = flat[index];
                index++;
            }
        }
        return matrix;
        
    }

    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                            {15,25,35,45}, 
                            {27,29,37,48}, 
                            {32,33,39,50}};

        int N = matrix.length;

        int[][] result = sortedMatrix(matrix, N);

        // Print the sorted matrix
        System.out.println("Sorted Matrix:");
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
