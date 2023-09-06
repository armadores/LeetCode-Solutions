class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        //create array of people
        int[]people=new int[num_people];
        int sum=0,i=1;
        do {

            for(int j=0;j<people.length;j++){ 
                //assign the candies to the people according the sharing rule   
                people[j]=people[j]+i;
                //sum the given candies (it is a consecutive decreasing serial 1+ 2 +3 ....)
                sum=sum+i;
                //if the sum of this serial becomes bigger then total candies
                //you should remove the last number (i) from the serial.
                if(candies<sum){
                    int a=sum-i;
                    //find the difference between serial and candies for example 1+2+...+10 =55 but serial is 56
                    int b=candies-a;
                    //then take the last number (11) from the people and give the difference to that people and stop
                    people[j]=people[j]-i+b;
                    break;
                } 
                i++;                
            }
        
        }while(candies>=sum);
      
        return people;
    }
}