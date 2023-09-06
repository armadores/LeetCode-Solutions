class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum =0; 
        for(int i=points.length-1;i>=1;i--){ 
            sum+=Math.max(Math.abs(points[i][1]-points[i-1][1]),Math.abs(points[i][0]-points[i-1][0]));
        }   
        return sum;  
    }       
}    