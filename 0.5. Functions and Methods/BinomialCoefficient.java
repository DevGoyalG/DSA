public class BinomialCoefficient{
    public static int fact(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f*=i;
        }
        return f;
    }

    public static int binCoeff(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);

        int binCoeff = n_fact / ( r_fact * nmr_fact);
        return binCoeff;
    }
    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2));
        
    }
}