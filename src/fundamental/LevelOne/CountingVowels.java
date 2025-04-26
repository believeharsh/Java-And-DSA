package fundamental.LevelOne;

public class CountingVowels {
    public static void main(String[] args) {
        CountVowelsAndConsonants("Hello World");
    }

    static void CountVowelsAndConsonants(String str) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        String vowels = "aeiou";
        String input = str.trim().toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        System.out.println("Number of vowels in given String  -> " + vowelsCount);
        System.out.println("Number of consonants in given String  -> " + consonantsCount);
    }
}
