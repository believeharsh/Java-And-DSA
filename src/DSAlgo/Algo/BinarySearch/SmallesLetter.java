package DSAlgo.Algo.BinarySearch;

public class SmallesLetter {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'd', 'g', 'j' , 'l'};
        char target = 'j';
        char ans = smallesLetter(arr, target);
        System.out.println(ans); // this should print d ; 
        
    } 
    // this function will return the smallest letter > target ; 
    static char smallesLetter(char[] arr, char target) {
       
        int start = 0;
        int end = arr.length - 1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            } 
        }
 
        return arr[start % arr.length] ; 
    }
    
}

