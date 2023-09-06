class Solution {
    public int maximum69Number (int num) {
        int max=0; 
        //create an array according to length of num 
        int[]digits=new int[Integer.toString(num).length()];
        int count=0;
        //seperate num integer to digits
        while(num>0){
            int digit=num%10;
            digits[count]=digit;
            num=num/10;
            count++;
        }
        //traverse digits (from reverse) and change the first 6 to 9 in digits
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==6){
             digits[i]=9;
             break;   
            }
        }
        //calculate the integer according to digits
        for(int i=digits.length-1;i>=0;i--){
           int a=digits[i]*(int)Math.pow(10, i);
           max+=a;
        }
        return max; 
    }
}