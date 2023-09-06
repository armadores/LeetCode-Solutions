class Solution {
    public boolean checkPerfectNumber(int num) {
        int c=0;
        int a=0; 
        Prime check=new Prime();
        if(num%2!=0){
            return false;
        }
        for(int i=1;i<15;i++){
            double power = Math.pow(2, i-1); 
            double power2=Math.pow(2,i);
           
            if(power*(power2-1)==num && check.isPrime(i)==true &&i!=11){
                System.out.print(power);
                System.out.print(power2);
                System.out.print(i);
                return true;
            }
        }
       return false;
    }
}
class Prime{
 public static boolean isPrime(int number){
        if(number<2){
            return false;
        }
        if(number==2){
            return true;
        }else{
           for(int i=2; i<number; i++){
            if(number%i == 0){
                return false; //number is divisible so its not prime
            }
        } 
        }
        
        return true; //number is prime now
    }
}