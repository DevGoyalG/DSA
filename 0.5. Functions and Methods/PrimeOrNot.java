public class PrimeOrNot {
    // only for n>=2
    // public static boolean isPrime(int n){
    //     // corner cases
    //     // 2

    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2; i<n-1; i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     } 
    //     return true;
    // }


// optimum soln below
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
}
