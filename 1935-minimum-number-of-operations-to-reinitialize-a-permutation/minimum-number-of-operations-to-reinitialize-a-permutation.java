class Solution {
    public int reinitializePermutation(int n) {
        int[]perm=new int[n];
        int count=1;
        for(int i=0;i<n;i++){
            perm[i]=i;
        }
        int[] storage = Arrays.copyOf(perm, perm.length);
        storage=reviseArray(storage);
        for(int i=1;i<n;i++){
            if(storage[1]!=perm[1]){
                if(storage[1]%2==0){
                    storage[1]=storage[1]/2;
                }else{
                    storage [1]=(n/2)+((storage[1]-1)/2);
                }
                count++;
            }
            
            if(storage[1]==perm[1]){
                break;
            }
        }
            
        return count;
    }
    public int[]reviseArray(int[]array){
        for(int i=1;i<array.length;i++){
            if(array[i]%2==0){
                array[i]=array[i]/2;
            }else if(array[i]%2==1){
                array[i]=(array.length/2)+((i-1)/2);
            }
        }
        return array;
    }
}