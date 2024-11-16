package DSAlgo.DS.Strings;
// Problem link : https://leetcode.com/problems/reverse-words-in-a-string/

public class ReverseTheString {
    public static void main(String[] args) {
        // String s = " hello world " ; 
        // String[] ans = s.trim().split("//s+");  
        //  for(int i = 0; i< ans.length ; i++){
        //     System.out.println(ans[i]);

        //  }

        // String ans = s.substring(6, 11) ; 
        // System.out.println(ans);
    
    }

    public static String func(String s){
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            } // this loop will work till it find the first charcter ; 

            if (i < 0) break;

            // Find the end of the current word
            int j = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            } // this loop will work till it find the first empty space ; 

            // Extract the word and add it to the answer
            if (ans.length() > 0) {
                ans.append(" ");
            }
            ans.append(s.substring(i + 1 , j + 1 ));
             // here we are using j+1 beacuse in java substring method exclude the second arugument value and give the result the value till next before the second arg value; 
            
        
           
        }

        return ans.toString();
    }
}
