import java.util.*;

public class SmallestNumIn2D {
    public static int smallestNum(int matrix[][]){
        int smallest = Integer.MAX_VALUE;

        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array: ");
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Smallest value: " + smallestNum(matrix));
    }
}
