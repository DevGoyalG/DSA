public class ReverseOfGivenNum {
    public static void main(String[] args) {
        int n = 99801;
        int rev = 0;
        while(n>0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}
