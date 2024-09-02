package DSAlgo.DS.Strings;
public class OutermostParenthasis {
    public static void main(String[] args) {
        String str = "(()())(())" ; 
        String strafter = removeOuterParentheses(str) ; 
        System.out.println(strafter);
        
    } 
    public static String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count != 0) {
                    ans.append(c);
                }
                count++;
            } else {
                if (count > 1) {
                    ans.append(c);
                }
                count--;
            }
        }

        return ans.toString();
    }
    
}
