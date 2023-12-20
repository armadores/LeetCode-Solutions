class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character,Integer>charCounter=new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            charCounter.put(ch, charCounter.getOrDefault(ch, 0) + 1);
        }
        char retChar = '\0';
        for(Map.Entry<Character, Integer> entry : charCounter.entrySet()) {
            if (entry.getValue()==1) {
                retChar = entry.getKey();
                break;
            }
        }
        
        
        for (int i = 0; i < s.length(); i++) {
           if (charCounter.get(s.charAt(i)) == 1) {
                return i; 
            }
        }
        
        return -1;
    }
}