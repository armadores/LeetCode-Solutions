class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean>kids=new ArrayList<>();
        int maxNum = candies[0];
        for (int j : candies) {
            if (j > maxNum)
                maxNum = j;
        } 
        for(int i=0;i<candies.length;i++){
            int a=candies[i];
            if(a+extraCandies>=maxNum){
               kids.add(true);
            }else{
               kids.add(false);
            }
        }
        return kids;
    }
}