public class SmallestNumber {
    public static int getSmallest(int nums[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,6,3,5};
        
        System.out.println("smallest value: " + getSmallest(nums));
    }
}
