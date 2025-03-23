public class MaxSubarraySum3{
    public static void kadanes(int nums[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE; 

        for(int i=0; i<nums.length; i++){
            cs = cs + nums[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Subarray sum: " + ms);
        
    }
    public static void main(String[] args) {
        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        kadanes(nums);

    }    
}