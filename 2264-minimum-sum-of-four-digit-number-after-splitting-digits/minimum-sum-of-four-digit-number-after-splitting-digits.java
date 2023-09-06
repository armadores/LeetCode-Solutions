class Solution {
    public int minimumSum(int num) {
        int[]digits=new int[4];
        int count=0;
		//divide the num to digits and add them to array
        while (num>0){  
            int digit=num%10;  
            digits[count]=digit; 
            num=num/10;  
            count++;
        }
		//sort the array 
        Arrays.sort(digits);
		//calculate the minimum value
        int a=10*digits[0]+10*digits[1]+digits[2]+digits[3];
        return a;
    }
}