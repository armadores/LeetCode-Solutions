class Solution {
    public boolean isHappy(int n) {
        int sum=0;
      do{
            //set (sum variable) zero to each step of the loop
            sum=0;
            //seperate "integer n" to it's digits.
            while(n>0){
                int a=n%10;
                n/=10;
                sum+=a*a;
                if(sum==n && n!=1){
                    break;
                }
            }
            if(sum==1){
                return true;
            //break the loop if it loops endlessly in a cycle   
            }else if(sum==n){
                break;
            }
            //set the  sum of the square of the digits of n (sum variable) to new n 
            n=sum;           
        }while(sum!=1);
     return false;
    }
}