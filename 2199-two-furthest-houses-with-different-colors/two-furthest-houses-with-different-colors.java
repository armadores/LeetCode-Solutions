class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        for(int i=0;i<colors.length;i++){
            int a=colors[i];
            for(int j=i+1;j<colors.length;j++){
                int b=colors[j];
                if(a!=b){
                    int ans=Math.abs(i-j);
                    if(max<ans){
                        max=ans;
                    }
                }
            }
        }
        return max;
    }
}