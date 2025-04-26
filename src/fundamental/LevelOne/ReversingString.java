package fundamental.LevelOne;

public class ReversingString {
    public static void main(String[] args) {
        ReverseString("Harsh Dahiya") ; 
        reverseString("Harsh Dahiya") ; 

    }

    static void ReverseString(String str) {
        String reversedStr = "" ; 

        for(int i = str.length() - 1 ; i >= 0 ; i--){
            reversedStr += str.charAt(i) ; 
        }

        System.out.println("Reversed String : " + reversedStr); 
    }



     static void reverseString(String str) {
        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed: " + new String(chars));
    }
}
