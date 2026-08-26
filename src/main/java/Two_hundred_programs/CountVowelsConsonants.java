package Two_hundred_programs;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String s="Hello World".toLowerCase(); int v=0,c=0;
        for(char ch:s.toCharArray()) {
            if(ch>='a'&&ch<='z') { if("aeiou".indexOf(ch)>=0) v++; else c++; }
        }
        System.out.println("Vowels="+v+" Consonants="+c);
    }
}
