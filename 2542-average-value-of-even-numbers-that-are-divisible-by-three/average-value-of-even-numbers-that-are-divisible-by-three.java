class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(a%6==0){
                count=count+1;
                sum+=a;
            }
        }
        if(count==0){
            return 0;
        }
        return sum/count;
    }   
}