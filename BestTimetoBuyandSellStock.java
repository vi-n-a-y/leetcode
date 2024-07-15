class BestTimetoBuyandSellStock{
    public int maxProfit(int[] prices) {
        int largePrice=0;
        int smallerPrice=Integer.MAX_VALUE;
        int day=0;
        for(int i=0;i<prices.length;i++){
           if(prices[i]<smallerPrice){
            smallerPrice=prices[i];
            day=i;
           }

        }
        if(smallerPrice==prices[prices.length-1]){
            return 0;
        }
        for(int j=day+1;j<prices.length;j++){
            if(prices[j]>largePrice){
                largePrice=prices[j];
            }


        }
      return largePrice-smallerPrice;
        
    }
}
