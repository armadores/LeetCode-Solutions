class Solution {
    public int minCostToMoveChips(int[] position) {
        HashMap<Integer,Integer>positions=new HashMap<>();
        HashSet<Integer> set = new HashSet<Integer>();
        int sum=0, b=0, sum1=0;
        Arrays.sort(position);
        int max=position[position.length-1];

        for (int element : position) {
            set.add(element);
        }
       
        for(int i:set){
            positions.put(i,0);
        }

        for(int i=0;i<position.length;i++){
            int a=position[i];
            if(positions.containsKey(a)){
                int temp=positions.get(a);
                positions.put(a, ++temp);
            }
        }

        for(int i:set){
            if(i%2==0){
                sum=sum+positions.get(i);
            }else{
                sum1=sum1+positions.get(i);
            }
        }

        if(sum1<sum){
            return sum1;
        }else{
            return sum;
        }
    }
        
}