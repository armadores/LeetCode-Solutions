class Solution {
    public int secondHighest(String s) {
        //create an arraylist
        List<Integer>list1=new ArrayList<>();
        //traverse the string and seek the digits in string
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))==true){
                //record the digits to arraylist
                list1.add((s.charAt(i))-'0');
            }
        }
        //add unique digits to a new arraylist 
        List<Integer>uniqueNumbers=list1.stream().distinct().collect(
                Collectors.toList());
                
        if(uniqueNumbers.size()<=1){
            return -1;
        }
        //sort the new arraylist
        Collections.sort(uniqueNumbers); 

        if(uniqueNumbers.size()==2){
            return uniqueNumbers.get(0);
        }
        //return the second largest digit from the arraylist
        return uniqueNumbers.get(uniqueNumbers.size()-2);
    }
}