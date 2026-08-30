package Two_hundred_programs;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String s = "Hello World";
        int vowels = 0, consonants = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (!Character.isLetter(c)) continue;
            if ("aeiou".indexOf(c) >= 0) vowels++; else consonants++;
        }
        System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
    }
}