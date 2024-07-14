package SimpleProblems;

    // Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
    // A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums [middleIndex+2] + ... + nums[nums.length-1].
    // If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the     right side sum is considered to be 0.

public class MiddleInd {
    public static void main(String[] args) {
        int[] case1 = {2,3,-1,8,4};
        int[] case2 = {1,-1,4}; 
        int[] case3 = {2,5};

       int ans1 =  FindMidInd(case1);
       System.out.println(ans1);
       int ans2 =  FindMidInd(case2);
       System.out.println(ans2);
       int ans3 =  FindMidInd(case3);
       System.out.println(ans3);
    }
    static int FindMidInd(int[] nums) {
        int sum  = 0 ; 
        int temp = 0 ; 

        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i]; 
        }
        for(int j = 0 ; j < nums.length ; j++) {
            sum -= nums[j] ; 
            if(sum == temp){
                System.out.println("The Middle Index is " + j );
                return j ; 
                
            } ;
            temp += nums[j]; 
        }
        System.out.println("No Index is found" );
        return -1 ; 
    }
}
