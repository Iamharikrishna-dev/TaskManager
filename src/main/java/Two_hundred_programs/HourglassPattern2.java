package Two_hundred_programs;

public class HourglassPattern2 { public static void main(String[] args) { for(int i = 5; i>=1; i--){for(int s = 5; s>i; s--)System.out.print(" ");for(int j = 0; j<2*i-1; j++)System.out.print("*");System.out.println();} for(int i = 2; i<=5; i++){for(int s = 5; s>i; s--)System.out.print(" ");for(int j = 0; j<2*i-1; j++)System.out.print("*");System.out.println();} } }
