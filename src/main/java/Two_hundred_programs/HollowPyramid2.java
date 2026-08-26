package Two_hundred_programs;

public class HollowPyramid2 { public static void main(String[] args) { int n=5; for(int i = 1; i<=n; i++){for(int s = n; s>i; s--)System.out.print(" ");for(int j = 1; j<=2*i-1; j++)System.out.print(i==n||j==1||j==2*i-1?"*":" ");System.out.println();} } }
