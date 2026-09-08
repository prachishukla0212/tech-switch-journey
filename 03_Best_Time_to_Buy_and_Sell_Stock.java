// LeetCode 121 — Best Time to Buy and Sell Stock
public static int maxProfit(int[] prices) {
  int buy = Integer.MAX_VALUE;
  int profit = 0;
  for(int num: prices){
      if(num< buy){ buy= num; }
      if(num-buy> profit){ profit= num-buy; }
  }
  return profit;
}
