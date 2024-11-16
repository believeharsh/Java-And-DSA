package DSAlgo.DS.Strings;

// problem Link : https://leetcode.com/problems/isomorphic-strings/ ; 
public class IsomorphicStr {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        boolean ans = Isisomirphic("paper", "title") ; 
        System.out.println(ans);
        
    }
    public static boolean Isisomirphic(String s, String t){
        int[] indexS = new int[200]; // Stores index of characters in string s
        int[] indexT = new int[200]; // Stores index of characters in string t
        
        // Get the length of both strings
        int len = s.length();
        
        // If the lengths of the two strings are different, they can't be isomorphic
        if(len != t.length()) {
            return false;
        }
        
        // Iterate through each character of the strings
        for(int i = 0; i < len; i++) {
            // Check if the index of the current character in string s
            // is different from the index of the corresponding character in string t
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                // here we are passing strings to the int array so the ascaii 
                // unicode values will be inserted;
                return false; // If different, strings are not isomorphic
            }
            
            // Update the indices of characters in both strings
            indexS[s.charAt(i)] = i + 1; // updating index of current character
            indexT[t.charAt(i)] = i + 1; // updating index of current character
            System.out.println(indexS[s.charAt(i)] + " and " + indexT[t.charAt(i)]);
        }
        
        // If the loop completes without returning false, strings are isomorphic
        return true;
    }
}