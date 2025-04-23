package fundamental.LevelOne;

public class StarPattern {
    public static void main(String[] args) {
        // PyramidStar(50);

        // SolidRectangle(4, 5);
        
        // HollowRectangle(4, 5) ; 

        // HalfPyramid(4, 5) ; 

        // InvertedPyramid(4) ; 

        // InvertedPyramidWithOneEightyRotated(7) ; 

        // HalfPyramidWithNumber(8) ;
        
        // InvertedHalfPyramidWithNumbers(8)   ; 

        // FloyedTriangle(7) ; 

        // ZeroOneTriangle(7) ; 

        // ButterflyPattern(5) ; 

        // Rohumbuspattern(5) ; 
        
        // NumberPyramidPattern(5) ; 

        // PalindromeNumberPattern(9) ; 

        // DimondPattern(15) ; 

        HollowRohumbusPattern(7) ; 
        
    }

    static void SolidRectangle(int height, int NumberOfStars) {
        for(int i = 1 ; i <= height ; i++){
            for(int j = 1 ; j <= NumberOfStars ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void PyramidStar(int height) {
        for(int i = 1 ; i <= height ; i++) { // the outer loop is basically dealing with the each row ; 

            for(int j = 1 ; j <= height - i ; j++){ // this loop is printing the spaces here ; 
                System.out.print(" ");
            }

            for(int k = 1 ; k <= (2 * i - 1) ; k++){ // this loop is printing the starts over here ; 
                System.out.print("*");
            }

            System.out.println();
        }
    
  
    }

    static void HalfPyramid(int n , int m ){
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    static void InvertedPyramid(int n ) {
        for(int i = n ; i >= 1 ; i--) {
            for(int j = 1 ; j <= i  ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void InvertedPyramidWithOneEightyRotated(int n ) {
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print(" ");
            }

            for(int k = 1 ; k <= i ; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void HollowRectangle(int height, int NumberOfStars){
        for(int i = 1 ; i <= height ; i++){
            for(int j = 1 ; j <= NumberOfStars ; j++){
                if(i == 1 || j == 1 || i == height || j == NumberOfStars){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    } 

    static void HalfPyramidWithNumber(int n ) {
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j + " ");
            } 
            System.out.println();
        }
    }

    static void InvertedHalfPyramidWithNumbers(int n ) {
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= (n - i + 1) ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void FloyedTriangle(int n ) {
        int count = 1 ; 
        for(int i = 1 ; i<= n  ; i++){
            // int count = 1 ; 
            for(int j = 1 ; j <= i ; j++){
                System.out.print(count + " ");
                count++ ; 
            }
            System.out.println();
        }
    }

    static void ZeroOneTriangle(int n ) {
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                int sum = i + j ; 
                if(sum % 2 == 0){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    static void ButterflyPattern(int n) {
        // first half 
        for(int i = 1 ; i<=n ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*") ; 
            }

            // spaces 

            for(int j = 1 ; j <= 2 * (n - i) ; j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half 
        for(int i = n ; i >= 1 ; i--) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*") ; 
            }

            // spaces 

            for(int j = 1 ; j <= 2 * (n - i) ; j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Rohumbuspattern(int n) {
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print(" ") ; 
            }
            for(int j = 1 ; j <= n ; j++){
                System.out.print("*") ; 
            }
            System.out.println();
        }
    }

    static void HollowRohumbusPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
    
            // Print hollow structure
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
    
            System.out.println();
        }
    }
    
    static void NumberPyramidPattern(int n ) {
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n - i ; j++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void PalindromeNumberPattern(int n ) {
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n - i ; j++){
                System.out.print(" ");
            }

            // first half 
            for(int j = i ; j >= 1 ; j--){
                System.out.print(j);
            }
            
            // second half 
            for(int j = 2 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void DimondPattern(int n ) {
        for (int i = 1 ; i <=n  ; i++){

            for(int j = 1 ; j<= n - i ; j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j <= (2 * i - 1) ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = n ; i >= 1 ; i--){

            for(int j = 1 ; j<= n - i ; j++){
                System.out.print(" ");
            }

            for(int j = 1 ; j <= (2 * i - 1) ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
