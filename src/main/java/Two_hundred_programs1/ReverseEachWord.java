package Two_hundred_programs1;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s="Java is powerful";
        for(String w:s.split("\\s+"))
            System.out.print(new StringBuilder(w).reverse()+" ");
    }
}
