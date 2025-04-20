public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        // Time complexity of below code is O(n2)
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){

        //         // primary diagonal sum
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }

        //         // secondary diagonal sum
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // return sum;

        // optimal soln => O(n)
        for(int i=0; i<matrix.length; i++){
            // primary diagonal sum
            sum += matrix[i][i];

            // secondary diagonal sum
            // use below loop for 3x3 matrix, in which the middle element count 2 times
            if(i != matrix.length-1-i){ 
                sum += matrix[i][matrix.length-1-i];   // i+j=n-1 => j=n-1-i
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        System.out.println("Diagonal sum: " + diagonalSum(matrix));
    }
}
