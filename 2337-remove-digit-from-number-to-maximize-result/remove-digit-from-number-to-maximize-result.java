//import BigInteger 
import java.math.BigInteger;
    class Solution {
    public String removeDigit(String number, char digit) {
    //create an arraylist     
    ArrayList<BigInteger> list = new ArrayList<>();
    //traverse the characters of string
    for(int i=0;i<number.length();i++){
        char a=number.charAt(i);
        if(a==digit){
            //divide the string two parts 
            String partBefore=number.substring(0,i);
            String partAfter=number.substring(i+1,number.length());
            //concatenate the sub strings 
            String number2=partBefore+partAfter;
            //convert the new string to biginteger and add to arraylist
            list.add(new BigInteger(number2));
        }
    }    
    //get the maximum value of arraylist
    BigInteger max = Collections.max(list);
    return max.toString();
    }
}
