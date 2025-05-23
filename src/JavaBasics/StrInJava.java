package JavaBasics;

public class StrInJava {
    public static void main(String[] args) {
        // String str = new String("Hello Dahiya, tu machayega for sure") ;
        String str1 = "Hello Dahiya, tu machayega for sure";
        String str2 = "Hello Dahiya, tu machayega for sure";

        // System.out.println(str == str1); // this will give false becasue the
        // reference is the different
        // System.out.println(str2 == str1); // but this will give true since the
        // reference is same

        // equals method or the == operator
        System.out.println(str1.equals(str2));

        // String str4 = new String("Hello Dahiya, tu machayega for sure") ;

        // System.out.println(str.equals(str4)) ;

        // equals method : this method doesn't care about how string are being created,
        // it will just compare the values of two strings if both have the same values
        // then it will return true otherwise it will return false ;

        // whereas the == operator will compare the reference of the strings, so if the
        // strings are pointing out to the same reference then it will return true
        // otherwise false ;

    }

    // what is the string pool in java?
    // string pool is a space that is present in the java heap memory, this has the
    // strings values. whenever the new string is being created by the user, JVM
    // first checks that this is present in the string pool or not, if the value is
    // already present, then the new string will be pointing to the same value.
    // this helps java to do better memory optimization and no duplicated values
    // will be created
    // Strings are immuetable in the java for the securting reasons

    // how println works in java??
    // println is always going to print the String, doesn't matter what input you
    // are giving to it!! ( like arrays, string, boolean, or the numbers) ;

}
