class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int start=0;
        for(String x:operations){
            if(x.equals("++X")||x.equals("X++")){
                start++;
            }else{
                start--;
            }
        }
        return start;
    }
}