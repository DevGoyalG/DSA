public class LinearSearch {
    public static int linearSearch(int nums[], int key) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10,12,14,16};
        int key = 12;

        int index = linearSearch(nums, key);
        if(index==-1){
            System.out.println("Index not found.");
        } else {
            System.out.println("Key is at Index: " + index);
        }
    }
}
