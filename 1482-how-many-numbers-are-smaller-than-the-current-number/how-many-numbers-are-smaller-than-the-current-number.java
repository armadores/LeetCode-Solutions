class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[]counter=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            //traverse the array and take the first number which will be compared
            int a=nums[i];
            count =0;
            for(int j=0;j<nums.length;j++){
                //traverste the array again and take the second value which will be compared 
                int b=nums[j];
                //compare first and second number and increase the counter if the scond number is smaller than first number
                if(a>b){
                    ++count;
                }
            }
            //record the count to counter array for the first number
            counter[i]=count;
        }
        return counter;
    }
}