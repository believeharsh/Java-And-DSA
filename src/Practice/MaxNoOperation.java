package Practice ; 
public class MaxNoOperation {

    public static void main(String[] args) {
        String S = "1001101" ; // should print = 4 ; 
        String S2 = "000111" ; // should print = 0 ;
        System.out.println(maxOperations(S));
        System.out.println(maxOperations(S2));
    }

    static int maxOperations(String S){
        int n = S.length(), cnt = 0, ans = 0 ; 
        for(int i = 0 ; i < n ; i++){
            if(S.charAt(i) == '0'){
                ans += cnt ; 
                while(i < n && S.charAt(i) != '1'){
                    i++ ; 
                }
            }
            cnt++ ; 
        }
        return ans ; 

    }
}