class Solution {
    public int minimumCost(int[] cost) {
      Arrays.sort(cost);
     int sum=0;
	 //return directly the first element of array if the length of the array 1
     if(cost.length==1){
         return cost[0];
     }   
	 //return two elements of array if the array s length 2 or  3 
     if(cost.length<4 && cost.length!=1){
         return cost[cost.length-1]+cost[cost.length-2];	 
     }else if(cost.length>=4){
	 //start traversing array from the biggest number
         for(int i=cost.length-1;i>=0;i-=3){
		 //if you reach the first element of array decrease the sum wıth the fırst element of array 
             if(i==0){
                 sum+=cost[0];
                 break;
			//if you reach the third element of array decrease the sum with third and second element of array 	 
             }else if(i==2){
                 sum+=cost[i]+cost[i-1];
                 break;
             }else{
                 sum+=cost[i]+cost[i-1]; 
             }
         }
     }    
     return sum;
    }
}