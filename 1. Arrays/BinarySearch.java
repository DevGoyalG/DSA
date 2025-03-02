public class BinarySearch {
    public static int binarySearch(int nums[] , int key){
        int start = 0, end = nums.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            // comparisons of mid and key

            if(nums[mid] == key){
                return mid;
            }
            if(nums[mid] < key){ // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10,12,14};
        int key=2;

        System.out.println("index: " + binarySearch(nums, key));
    }
}
