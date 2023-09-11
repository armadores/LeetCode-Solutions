public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //convert the integer n to a binary string 
         String strNum = Integer.toBinaryString(n);
         int count=0;
         //traverse the string "n" & decrease the count +1 if char equals '1'
         for (int i = 0; i < strNum.length(); i++) {
            if(strNum.charAt(i)=='1'){
                count++;
            }
         }
        return count;
    }
}