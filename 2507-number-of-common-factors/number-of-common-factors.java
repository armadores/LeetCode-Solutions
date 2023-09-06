class Solution {
    public int commonFactors(int a, int b) {
        int min, count=0;
		//find the smallest number and assign it to integer min
        if(a>b){
            min=b;
        }else{
            min=a;
        }
		//find the common factors of two numbers and count them
        for(int i=1;i<=min;i++){
          if(a%i==0&&b%i==0){
              count++;
          }  
        }
        return count;
    }
}