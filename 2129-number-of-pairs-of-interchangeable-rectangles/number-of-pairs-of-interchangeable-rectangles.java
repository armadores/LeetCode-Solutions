class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long>ratios=new HashMap<>();
        long sum=0; 
        for(int i=0;i<rectangles.length;i++){
              double ratio=(double)rectangles[i][0]/rectangles[i][1];
             
              if(!ratios.containsKey(ratio)){
                ratios.put(ratio,Long.valueOf(0));
              }
              if(ratios.containsKey(ratio)){
                ratios.put(ratio,ratios.get(ratio)+1);
             }       
        }
        
        for (Map.Entry<Double, Long> entry : ratios.entrySet()) {
            if(entry.getValue()>=1){
                long b=(long)(entry.getValue()*(entry.getValue()-1))/2;
                sum =sum+b;
            }         
        }
        
        return sum;
    }
}