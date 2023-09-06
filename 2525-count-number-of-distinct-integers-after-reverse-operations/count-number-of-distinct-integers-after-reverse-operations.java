class Solution {
    public int countDistinctIntegers(int[] nums) {   
    Set<Integer> diffNum = new HashSet<Integer>();
    Solution solution=new Solution();
        for(int i=0;i<nums.length;i++){
            diffNum.add(nums[i]);
            int b=solution.reverse(nums[i]);
            diffNum.add(b);
        }
        return diffNum.size();
    }
    public int reverse(int a){
        int rev=0;
        while(a!=0){
            int digit=a%10;
            rev=rev*10+digit;
            a /= 10;
        }
        return rev;
    }
}