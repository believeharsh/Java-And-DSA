package DSAlgo.Algo.LinearSearch;
import java.util.Arrays;

public class SearchInStr {
    public static void main(String[] args) {
        String name = "HarshDahiya" ; 
        char target = 'D' ;

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(searchInStr(name, target));
        System.out.println(searchInStr2(name, target));
        System.out.println();
       
    }
    static boolean searchInStr(String str, char target) {
        if(str.length() == 0 ) return false ; 
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) return true ; 
            
        }
        return false ; 
    }
    static boolean searchInStr2(String str, char target) {
        if(str.length() == 0 ) return false ; 
         for (char ch   : str.toCharArray()) {
            if(ch == target) return true ; 
         }
        return false ; 
    }
}
