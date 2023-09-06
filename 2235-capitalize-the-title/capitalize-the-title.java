class Solution {
    public String capitalizeTitle(String title) {
        //divide the title from spaces and add each words to array 
        String[] newStr = title.split("\\s+");
		//create an empty string 
        String b="";
		//traverse the array 
         for (int i = 0; i < newStr.length; i++) {
            String a=newStr[i];
			//change all the words to lower case
            a = a.toLowerCase();
			//change the first letter to upper case 
            a = Character.toUpperCase(a.charAt(0)) + a.substring(1);    
			//if length of the word smaller than 3 change the first case to lower
            if(a.length()<3){
                a=a.toLowerCase();
            }
		//add each word to empty string
          b=b+a+" ";
        }
        //delete the last space at the end of the b
        return b.replaceAll("\\s+$", "");
    }
}