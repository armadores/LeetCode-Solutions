class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>numbers=new HashMap<>();
        int sum=0;
        for(int a: nums){
            if(!numbers.containsKey(a)){
                numbers.put(a,0);
            }
            if(numbers.containsKey(a)){
                numbers.put(a,numbers.get(a)+1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if(entry.getValue()>1){
                int b=(entry.getValue()*(entry.getValue()-1))/2;
                sum =sum+b;
            }
          
        }
        
        return sum;
    }
}