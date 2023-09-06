class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        //drinked bottles and empty bottles in the beginning
        int sum=numBottles;
        int empty=numBottles;
        
        while(empty>=numExchange){
            //increase the drinked bottle (empty/numExchange) in each cycle
            sum=sum+(empty/numExchange);
            //increase the empty bottle amount in each cycle so you can change the empty bottles with full bottles according to numExchange
            empty=(empty%numExchange)+(empty/numExchange);
        }
        return sum;
    }
}