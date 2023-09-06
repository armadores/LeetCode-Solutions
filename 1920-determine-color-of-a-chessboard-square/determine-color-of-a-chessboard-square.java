class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a=coordinates.charAt(0);
        int b=Integer.valueOf(coordinates.charAt(1));
        if(a=='a'||a=='c'||a=='e'||a=='g'){
           if(b%2!=0){
               return false;
           }    
        }
        if(a=='b'||a=='d'||a=='f'||a=='h'){
            if(b%2==0){
               return false; 
            }  
        }
        return true;
    }
}