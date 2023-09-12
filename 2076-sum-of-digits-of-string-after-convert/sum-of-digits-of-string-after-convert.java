class Solution {
    public int getLucky(String s, int k) {
        int num = 0;

        // Convert characters to integers and sum them
        for (char c : s.toCharArray()) {
            int value = c - 'a' + 1;
            while (value > 0) {
                num += value % 10;
                value /= 10;
            }
        }

        // Sum the digits k-1 times
        for (int i = 1; i < k; i++) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum; // Update the sum of digits
        }

        return num;
    }
}

