class Solution {
    public int removeElement(int[] nums, int val) {
      int b=0;
      int c=0; 
      //traverse the array and search if a value equals to val   
      for(int i=0;i<nums.length;i++){
          b=nums[i];
          //check the equality and assign the value
          if(b!=val){
            nums[c]=b;
            c=c+1;  
          }   
      }
      return c;  
    }               
}