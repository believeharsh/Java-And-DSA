import java.util.*;

public class PhoneLetterCombinations {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
        // → [ad, ae, af, bd, be, bf, cd, ce, cf]
    }
    

    static final String[] MAP = {
        "", "", "abc", "def", "ghi", "jkl",
        "mno", "pqrs", "tuv", "wxyz"
    };

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        backtrack(0, new StringBuilder(), digits, result);
        return result;
    }

    private static void backtrack(int idx,
            StringBuilder current,
            String digits,
            List<String> result) {

        if (idx == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = MAP[digits.charAt(idx) - '0'];
        for (char c : letters.toCharArray()) {
            current.append(c);                // choose
            backtrack(idx + 1, current, digits, result);
            current.deleteCharAt(current.length() - 1); // undo
        }
    }

}
