class BestTimetoBuyandSellStock{
  public int maxProfit(int[] prices) {
    //    int smallerPrice=Integer.MAX_VALUE;
        int small=0;
       int  highest=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                 small=prices[j]-prices[i];
                 if(small>highest){
                    highest=small;
                 }
               
               
            }
             System.out.println(highest);
        }
       return highest; 
    }
}
