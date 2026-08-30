package Two_hundred_programs1;

public class DiamondPattern { public static void main(String[] args) { for(int i = 1; i<=5; i++){for(int s = 5; s>i; s--)System.out.print(" ");for(int j = 0; j<2*i-1; j++)System.out.print("*");System.out.println();} for(int i = 4; i>=1; i--){for(int s = 5; s>i; s--)System.out.print(" ");for(int j = 0; j<2*i-1; j++)System.out.print("*");System.out.println();} } }
