class Solution {
    public int[] sumZero(int n) {
        int[]numbers=new int[n];
        if(n%2!=0){
            numbers[(n-1)/2]=0;
            for(int i=((n-1)/2)-1;i>=0;i--){
                numbers[i]=numbers[i+1]-1;
            }
            for(int i=((n-1)/2)+1;i<n;i++){
                numbers[i]=numbers[i-1]+1;
            }  
        }else{
            numbers[n/2]=1;
            numbers[(n/2)-1]=-1;
            for(int i=(n/2)+1;i<n;i++){
                numbers[i]=numbers[i-1]+1;
            }
            for(int i=(n/2)-2;i>=0;i--){
                numbers[i]=numbers[i+1]-1;
            }
        }
        return numbers;
    }
}