package DSAlgo.DS.Strings;

public class PalindromeString {
    public static void main(String[] args){
        String str = "abcba" ; 
        System.out.println(palindromeString(str)) ; 
        
    }

    public static boolean palindromeString(String str){
        if(str == null || str.length() == 0 ){
            return true ; 
        }
        for(int i = 0 ; i < str.length() / 2 ; i++){
            char start = str.charAt(i) ; 
            char end = str.charAt(str.length() - 1 - i ) ; 
            if(start != end ){
                return false ; 
            }
        }
        return true ; 
    }
    
}
