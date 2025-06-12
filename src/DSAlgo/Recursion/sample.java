public static void main(String args[]) {
   int[] arr = {7, 2, 3, 4, 5, 1} ; 
        int[] ans = mergeSort(arr) ; 
        System.out.println(Arrays.toString(ans)) ; 
    }
    
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr ; 
        }
        
        int mid = arr.length / 2 ; 
        int[] left  = mergeSort(Arrays.copyOfRange(arr, 0, mid)) ;
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)) ; 
        
        return merge(left, right) ;
    }
    
static int[] merge(int[] first, int[] second){
    int i = 0 ; 
    int j = 0 ; 
    int k = 0 ;
    int[] mix = new int[first.length + second.length] ; 
    
    while(i < first.length && j < second.length){
        if(first[i] < second[j]){
            mix[k++] = first[i++] ; 
        } else {
            mix[k++] = second[j++] ; 
        }
    }
    
    while(i < first.length){
        mix[k++] = first[i++] ; 
    }
    
    while(j < second.length){  // fixed this line
        mix[k++] = second[j++] ; 
    }
    
    return mix ; 
}