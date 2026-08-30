package Two_hundred_programs1;

public class StaticKeywordExample { static int count; StaticKeywordExample(){count++;} public static void main(String[] args){new StaticKeywordExample();new StaticKeywordExample();System.out.println(count);} }
