package DSAlgo.DS.Strings;

public class ReverseTheString {
    public static void main(String[] args) {
        String s = " hello world " ; 
        String ans = func(s) ; 
        System.out.println( "s" + ans + "s");
    
    }

    public static String func(String s){
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;

            // Find the end of the current word
            int j = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Extract the word and add it to the answer
            if (ans.length() > 0) {
                ans.append(" ");
            }
            ans.append(s.substring(i + 1 , j + 1 ));
            System.out.println(ans); 
        
           
        }

        return ans.toString();
    }
}
