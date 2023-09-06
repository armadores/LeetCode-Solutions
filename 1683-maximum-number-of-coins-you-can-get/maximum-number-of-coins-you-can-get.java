class Solution {
    public int maxCoins(int[] piles) {
        int sum=0;
        Arrays.sort(piles);
        int a=piles.length/3;
        for(int i=a;i<piles.length;i+=2){
            sum+=piles[i];
        }
        
        return sum;
    }
}