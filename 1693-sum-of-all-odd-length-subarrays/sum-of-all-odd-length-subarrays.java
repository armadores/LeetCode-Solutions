class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0; 
        //traverse the odd length subarrays
        for(int q=1;q<arr.length+1;q+=2){
         //traverse according the first odd length subarrays   
            for(int i=0;i<q;i++){ 
                //get the numbers from the array according to odd length
                //for example if the sub array length is 3, and the length of the array is 9
                //then it starts to collect first 6 numbers of arr and sums these numbers.
                //then iterates the second numbers of subarrays and finally third numbers of subarrays.
               for(int j=i;j<=arr.length-q+i;j++){
                   sum+=arr[j];
               }
           }        
       }
       return sum; 
    }
}