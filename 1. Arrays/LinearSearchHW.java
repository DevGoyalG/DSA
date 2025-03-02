public class LinearSearchHW {
    public static int linearSearchHW(String fruits[], String key){
        for(int i=0; i<fruits.length; i++){
            if(fruits[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana", "pineapple"};
        String key = "mango";

        int index = linearSearchHW(fruits, key);
        if(index==-1){
            System.out.println("index not found");
        } else {
            System.out.println("Key found at Index: "+ index);
        }
    }
}
