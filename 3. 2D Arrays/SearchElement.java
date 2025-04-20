import java.util.*;

public class SearchElement {
    public static boolean searchKey(int matrix[][] , int key){
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == key){
                    System.out.print("Key is found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.print("Key not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        System.out.print("Enter matrix: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        searchKey(matrix, key);
    }
}
