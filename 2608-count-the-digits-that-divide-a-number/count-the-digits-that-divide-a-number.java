class Solution {
    public int countDigits(int num) {
        int a=num;     
        int b=0;
        int count=0;
        if(num<10){
            return 1;
        }else if(num>9){
            while(num>0){
                //seperate the number to it's digits    
                b=num%10;
                //reduce the number according to mod 10
                num=num/10;
                //if the digit divides increase the counter
                if(a%b==0){
                    ++count;
                }
            }

        }
        return count;      
    }
}