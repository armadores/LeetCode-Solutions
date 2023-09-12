class Solution {
    public int getLucky(String s, int k) {
        // Create a map to store sorting values for each character in the alphabet
        Map<Character, Integer> sortingValues = new HashMap<>();
        
        // Assign sorting values from 1 to 26 based on character position
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sortingValues.put(ch, ch - 'a' + 1);
        }

        int num = 0;

        // Convert characters to integers and sum them
        for (char c : s.toCharArray()) {
            int value = sortingValues.get(c);
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