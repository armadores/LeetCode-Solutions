class Solution {
    public int minOperations(int n) {
        int sum=0;
        int i=0;
		//calculate the element of array and compare it with the n, if it is smaller then n, calculate the difference and add this to sum.
        while((2*i+1)<n){
            sum+=n-(2*i+1);
            ++i;    
        }
       return sum;
    }
}