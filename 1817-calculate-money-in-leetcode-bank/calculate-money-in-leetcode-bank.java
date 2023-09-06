class Solution {
    public int totalMoney(int n) {
        int b=28, sum=0, c=n/7;
        if(c<1){
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            return sum;
        }
        if(c>=1){
            for(int i=0;i<c;i++){
                sum+=b;
                b+=7;
            }
            int f=n-(7*c);
            c=c+1;
            for(int j=0;j<f;j++){
                sum+=c;
                ++c;
            }
        } 
        return sum;
    }
}