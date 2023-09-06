class Solution {
    public String defangIPaddr(String address) {
           char b='.';
           //create a new string 
           StringBuilder string = new StringBuilder();
           for (int i = 0; i < address.length(); i++) {
              //divide to address strings to chars  
              char d=address.charAt(i);
              //if char equals to .  then put the [.] to new string  
              if(d==b){
                  string.append("[.]");
              //if not put the char directly from adress string to new string     
              }else{
                  string.append(address.charAt(i));
              }
           }
        // return the new string by using toString method
           return string.toString();
    }
}