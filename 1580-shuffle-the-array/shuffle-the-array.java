class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]shuffle1=new int[nums.length];
        for(int i=0;i<n;i++){
            shuffle1[2*i]=nums[i];
        }
        for(int i=1;i<nums.length;i+=2){
            shuffle1[i]=nums[n];
            ++n;
        }
        return shuffle1;
    }
}