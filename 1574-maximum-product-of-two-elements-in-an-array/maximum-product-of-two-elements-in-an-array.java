class Solution {
    public int maxProduct(int[] nums) {
        int a=0;        
        Arrays.sort(nums);
        a=(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        return a;
    }
}