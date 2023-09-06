class Solution {
    public int smallestRangeI(int[] nums, int k) {
         //Find the min. number of array 
        int res = nums[0];
        for (int i = 1; i < nums.length; i++){
             res = Math.min(res, nums[i]);
        }
        //find the max. number of array
        int max=nums[0];
        for (int i = 1; i < nums.length; i++){
             max = Math.max(max, nums[i]);
        }
        //return 0 if min number + k > max number -k    
        if(res+k>=max-k){
            return 0;
        } 
        //otherwise return difference between min & max numbers    
         return max-k-(res+k);        
    }
}


