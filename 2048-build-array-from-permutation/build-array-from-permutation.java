class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=nums[a];
            ans[i]=b;
        }
        return ans;
    }
}