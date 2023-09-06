class Solution {
    public int pivotInteger(int n) {
        int sum=0;
        int sum1=0;
        int i=1;
        while(i<=n){
           sum+=i;
           for(int j=i;j<=n;j++){
               sum1+=j;
               if(sum1>sum){
                   break;
               }
           }
           if(sum1==sum){
               return i;
           }
            sum1=0;
            ++i;
        }
        return -1;
    }
}