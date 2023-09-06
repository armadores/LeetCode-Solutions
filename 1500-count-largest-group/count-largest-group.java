class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer>maps=new HashMap<Integer, Integer>();
        int temp=0;    
        for(int i=1;i<=n;i++){
            //seperate numbers to digits between 1 to n 
            int a=sumdigitCounter(i);
            //add the seperated number to hashmap
            if(!maps.containsKey(a)){
                maps.put(a,1);
            }else{
                temp=maps.get(a);
                maps.put(a,++temp); 
            }
        }
        //find the maximum key value of hashmap
        /*
        int max = maps.values().stream()
                               .max(Comparator.naturalOrder()).get();
        */
        int max = (Collections.max(maps.values()));
        //count the elements of map which have the maximum value
        long number=maps.entrySet().stream()
                        .filter(entry -> entry.getValue() == max)
                        .count();
        /*                        
        int nums=(int)number;                            
        */
        return (int)number;
    }
    //convert the number to its digits and count them
    public int sumdigitCounter(int n){
         int b=0;
         int a=0;
         if(n<10){
             return n;
         }
         while(n>0){
            a=n%10;
            n=n/10;
            b=b+a;
        }
        return b;
    }  
}