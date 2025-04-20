import java.util.Scanner;

public class LargestNumIn2D {
    public static int largestNum(int matrix[][]){
        int largest = Integer.MIN_VALUE;

        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
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

        System.out.println("Largest value: " + largestNum(matrix));
    }
}
