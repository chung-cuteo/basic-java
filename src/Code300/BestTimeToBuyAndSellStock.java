package Code300;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int current = Integer.MAX_VALUE;
        int profit = 0;
        // 7, 1, 5, 3, 6, 4
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < current) {
                current = prices[i];
            } else if ((prices[i] - current) > profit) {
                profit = prices[i] - current;
            }
        }
        // vong 1:
        /*
         * VONG1 prices[0]=7 < Integer.MAX_VALUE => true => current = 7
         * VONG2 prices[1]=1 < current(7) => true => current = 1
         * VONG3 prices[2]=5 < current(1) => false => nhay else
         * VONG4 prices[3]=3 =>prices[3] - current(1) = 2 > profit(0) => true => profit
         * = prices[3] - current(1) = 2
         * VONG4 prices[4]=6 =>prices[4] - current(1) = 5 > profit(2) => true => profit
         * = prices[6] - current(1) = 5
         * VONG5 prices[5]=4 =>prices[5] - current(1) = 4 > profit(5) => false => ko lam
         * gi
         */

        return profit;
    }
}
