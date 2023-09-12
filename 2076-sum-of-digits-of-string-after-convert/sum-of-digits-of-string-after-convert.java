class Solution {
    public int getLucky(String s, int k) {
        // Create a map to store sorting values for each character in the alphabet
        Map<Character, Integer> sortingValues = new HashMap<>();
        int num=0, e=0;
        String q="";
        // Assign sorting values from 1 to 26 based on character position
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sortingValues.put(ch, ch - 'a' + 1);
        }
        //traverse the character of string and get the value from hashmap then translate the value 
        //from integer to string for to concatenate them.
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            int c=sortingValues.get(b);
            q=q+Integer.toString(c);
        }
        //Convert the chars of string to integer and sum these values.
        for(int j=0;j<q.length();j++){
            num=num+(q.charAt(j)-'0');
        }
        System.out.println(num);
       
        for (int i = 1; i < k; i++) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num=sum;
        }
        return num;
    }
}