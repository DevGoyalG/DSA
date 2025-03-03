public class ReverseArray {
    public static void reverseArray(int nums[]){
        int first = 0, last = nums.length-1;

        while(first<last){
            // swap
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};

        reverseArray(nums);

        //print

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}