class Solution {
    public int maxProfit(int[] prices) {
//8/30/2026
//took  19.30min

        int profit=0;
        boolean sold=false;
        int value = prices[0];
/*
        for(int i=1; i<prices.length; i++){
            if(value<prices[i]){
                sold=true;
            }
*/

        int buyVal=0;
        int buyIndex=0;
        int index=0;
       // int profit=0;
while(index<prices.length-1){
    buyVal=prices[index];
        for(int i=index+1; i<prices.length; i++){
            if(prices[i]>buyVal){
                profit=Math.max(profit, prices[i]-buyVal);
            }
        }
        index++;
}


        

        return profit;
    }
}
