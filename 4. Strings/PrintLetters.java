public class PrintLetters {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.err.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "Rohit Sharma";

        printLetters(str);
    }
}
