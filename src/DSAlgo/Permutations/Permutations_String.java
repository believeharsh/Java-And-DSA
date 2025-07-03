package DSAlgo.Permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations_String {

    public static void main(String[] args) {
        String s = "abc";

        List<String> perms = permute(s);

        System.out.println(perms); // [abc, acb, bac, bca, cab, cba]
    }

    /** Driver: returns all permutations of the given string. */
    static List<String> permute(String str) {
        char[] chars = str.toCharArray(); // work with an array for easy swapping
        List<String> ans = new ArrayList<>();
        generate(chars, 0, ans);
        return ans;
    }

    /** Recursive helper using in‑place swapping and backtracking. */
    private static void generate(char[] chars, int index, List<String> ans) {
        if (index == chars.length) {
            ans.add(new String(chars)); // convert current arrangement to String
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i); // place chars[i] at current index
            generate(chars, index + 1, ans);
            swap(chars, index, i); // back‑track
        }
    }

    /** Swaps two characters in the array. */
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
