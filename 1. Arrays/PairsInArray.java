public class PairsInArray {
    public static void printPairs(int nums[]){

        // let total pairs = 0 initially (use it to print total pairs)
        int tp=0;

        for(int i=0; i<nums.length; i++){
            int curr = nums[i];          // curr = 2 then 4 then 6 then 8 then 10
            for(int j=i+1; j<nums.length; j++){
                System.out.print("(" + curr + "," + nums[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + tp);
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10,12};

        printPairs(nums);
    }
}