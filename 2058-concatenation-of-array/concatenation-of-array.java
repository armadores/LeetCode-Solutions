class Solution {
    public int[] getConcatenation(int[] nums) {
        int[]ans=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            ans[i]=a;
        }
        int b=0;
        for(int j=nums.length;j<ans.length;j++){
            ans[j]=nums[b];
            b++;
        }
        return ans;
    }
}