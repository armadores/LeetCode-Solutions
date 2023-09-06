class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>minimums=new ArrayList<>();
        //sort the given array
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        //find the minimum absolute value
        for(int i=0;i<arr.length-1;i++){
            //find the absolute difference between the consecutive values of array
            int b=Math.abs(arr[i]-arr[i+1]);
            //assign the minimum value to min variable
            if(b<min){
               min=b; 
            }
        }
        //traverse the array 
        for(int i=0;i<arr.length-1;i++){
            //add the dual elements of arr as arraylist to minimums list.
            //each duals are changed to a list.
            int c=Math.abs(arr[i]-arr[i+1]);
            if(c==min){
                minimums.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
      return minimums;   
    }
}