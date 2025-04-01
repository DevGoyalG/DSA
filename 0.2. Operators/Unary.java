public class Unary {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;                    // Pre-increment (a is incremented to 11, then assigned to b)
        System.out.println(a);
        System.out.println(b);

        int c = 10;
        int d = c++;                    // Post-increment (c is assigned to d (10), then c is incremented to 11)
        System.out.println();
        System.out.println(c);
        System.out.println(d);

        int g = 10;
        int h = --g;                    // Pre-decrement (g is decremented to 10, then assigned to g)
        System.out.println();
        System.out.println(g);
        System.out.println(h);

        int e = 10;
        int f = e--;                    // Post-decrement (e is assigned to e (11), then e is decremented to 10)
        System.out.println();
        System.out.println(e);
        System.out.println(f);

    }  
}
