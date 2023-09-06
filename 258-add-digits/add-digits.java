class Solution {
    public int addDigits(int num) {
              int sum=0;
        while(num>0){
           int b=num%10;
           num=num/10;
           sum=b+num;
           num=sum; 
           if(sum<10){
               return sum;
           } 
        }
        return sum;
    
    }
}