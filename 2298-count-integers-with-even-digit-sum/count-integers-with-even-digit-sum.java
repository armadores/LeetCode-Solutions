class Solution {
    public int countEven(int num) {
        int count=0;
        //list the numbers 2 to num
        for(int i=2;i<=num;i++){
            //call the sum of digits function and increase the 
            //counter if the result of method returns true
            if(sumOfDigits(i)==true){ 
                count++;
            }
        }
        return count;
    }
    public boolean sumOfDigits(int num){
        int a=0;
        int sum=0;
        //seperate the num to it's digits and sum them 
        while(num>0){
            a=num%10;
            num=num/10;
            sum=sum+a;
        }
        //return true if the sum of digits even else return false
        if(sum%2==0){
            return true;
        }
        return false;
    }
}