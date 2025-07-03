package DSAlgo.Subsets;

import java.util.ArrayList;
import java.util.List;

public class GetAllSubsets {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<Integer> current = new ArrayList<>(); // ✅ FIXED

        solve(0, current, arr);
    }

    // This was the solution with backtracking
    static void solve(int index, List<Integer> current, int[] arr) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Include current element
        current.add(arr[index]);
        solve(index + 1, current, arr);

        // Backtrack: undo the change
        current.remove(current.size() - 1);

        // Exclude current element
        solve(index + 1, current, arr);
    }

    // solution without backtracking
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }
}
