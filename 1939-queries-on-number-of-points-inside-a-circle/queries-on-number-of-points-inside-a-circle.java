class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
    int[]counter=new int[queries.length];
    int count=0;
        for(int i=0;i<queries.length;i++){
                for(int j=0;j<points.length;j++){
                double distance=Math.sqrt(Math.pow(points[j][0]-queries[i][0],2)+Math.pow(points[j][1]-queries[i][1],2));
                    if(distance<=queries[i][2]){
                        count++;
                    }
                }
                counter[i]=count;
                count=0;
        } 
        return counter;
    }
}
