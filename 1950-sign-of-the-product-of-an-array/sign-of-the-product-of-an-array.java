class Solution {
    public int arraySign(int[] nums) {
        int negativeCount = 0;
        for (int x : nums) {
            if (x < 0) {
                negativeCount++;
            } else if (x == 0) {
                return 0;
            }
        }
        return (negativeCount % 2 == 0) ? 1 : -1;
    }
}