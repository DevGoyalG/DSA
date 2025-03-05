public class MaxSubarraySum1{
    public static void maxSubarraySum(int nums[]){
        int currSum= 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int start = i;

            for(int j=i; j<nums.length; j++){
                int end = j;
                currSum = 0;

                for(int k=start; k<=end; k++){
                    // subarray sum
                    currSum += nums[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum: " + maxSum);
    }
    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};

        maxSubarraySum(nums);

    }    
}