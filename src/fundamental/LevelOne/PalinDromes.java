package fundamental.LevelOne;

public class PalinDromes {
    public static void main(String[] args) {
        CheckPaliDromeNumber(1241);
        CheckPaliDromeString("Madam") ; 

    }

    static void CheckPaliDromeNumber(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        System.out.println(reversedNum == originalNum ? "Yes, this is a palindrome number"
                : "No, this is not a palindrome number");
    }

    static void CheckPaliDromeString(String str) {
        String tempStr = str.toLowerCase() ; 
        int start = 0 ; 
        int end = tempStr.length() - 1 ;
        boolean isPalindrome = true ; 
        while(start < end){
            if(tempStr.charAt(start) != tempStr.charAt(end)){
                isPalindrome = false ; 
                break ; 
            }
            start++ ; 
            end-- ; 
        }
        System.out.println(isPalindrome ?
        "Yes, this is a palindrome string" :
        "No, this is not a palindrome string");
    }
}