class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int d=numBottles/numExchange;
        int r=numBottles%numExchange;
        int s=numBottles+d;
        int exc=d+r;
        while(exc>=numExchange)
        {
            exc=0;
            exc=d+r;
            d=exc/numExchange;
            r=exc%numExchange;
            s+=d;
        }
        return s;
    }
}
