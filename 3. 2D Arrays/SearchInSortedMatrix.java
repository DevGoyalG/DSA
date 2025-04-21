public class SearchInSortedMatrix {
    public static boolean searchInSortMatrix(int matrix[][], int key){
        // we consider TOP RIGHT element as starting position
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("key found at (" + row + "," + col + ")");
                return true;
            }

            // LEFT
            else if(key < matrix[row][col]){
                col--;
            }

            // BOTTOM
            else if(key > matrix[row][col]){
                row++;
            }
        }
        System.out.println("key not found");
        return false;


        // we consider BOTTOM LEFT element as starting position
        // int row = matrix.length-1, col = 0;
         
        // while(row >=0 && col < matrix[0].length){
        //     if(matrix[row][col] == key){
        //         System.out.println("keyis found at (" + row + "," + col + ")");
        //         return true;
        //     }

        //     //TOP
        //     else if(key < matrix[row][col]){
        //         row--;
        //     }

        //     // RIGHT
        //     else if(key > matrix[row][col]){
        //         col++;
        //     }
        // }

        // System.out.println("key not found!");
        // return false;

    }


    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        int key = 15;

        searchInSortMatrix(matrix, key);
    }
}
