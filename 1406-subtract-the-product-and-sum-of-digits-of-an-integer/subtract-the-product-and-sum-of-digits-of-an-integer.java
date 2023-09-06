class Solution {
    public int subtractProductAndSum(int n) {
        int count=0, sum=0, mult=1;
		//divide the n to it's digits
        while (n>0){  
            int digit=n%10; 
			//calculate the sum of digits
            sum=sum+digit;
			//calculate the multiple of digits
            mult=mult*digit;
            n=n/10;  
        }
        int last=mult-sum;
		//return the difference between sum and multiple of digits
        return last;
    }
}