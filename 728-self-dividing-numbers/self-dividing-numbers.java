class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>numbers=new ArrayList<>();
        Self selfie=new Self();
        for(int i=left;i<=right;i++){
            if(selfie.helpDividing(i)==true){
                numbers.add(i);
            }
        }
        return numbers;
    }

}
class Self{
    public boolean helpDividing(int a){
        String b=Integer.toString(a);
        for(int i=0;i<b.length();i++){
            char c=b.charAt(i);
            if(c=='0'){
                return false;
            }
            int d=Character.getNumericValue(c);
            if(a%d!=0){
                return false;
            }
        }
        return true;
    }
}