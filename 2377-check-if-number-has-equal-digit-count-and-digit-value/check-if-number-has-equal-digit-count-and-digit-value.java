class Solution {
    public boolean digitCount(String num) {
        Map<Character, Integer>frequency=new HashMap<>(); 
        
        for(int i=0;i<num.length();i++){
            char myChar = num.charAt(i);
            if(!frequency.containsKey(myChar)){
                frequency.put(myChar,1);
            }else{
                frequency.put(myChar, frequency.get(myChar) + 1);
            }       
        }
        
        for(int i=0;i<num.length();i++){
            int a = Character.getNumericValue(num.charAt(i));
            char b = Character.forDigit(i, 10); 
            if (frequency.containsKey(b)) {
                if ( a != frequency.get(b)) {
                    return false ;
                }
            }else if (num.charAt(i) != '0'){
                return false ;
            }
        }
        return true;
    }
}