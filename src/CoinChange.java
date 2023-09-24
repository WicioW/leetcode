/**
 * 322. Coin Change
 *
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 *
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 *
 *
 *
 * Example 1:
 *
 * Input: coins = [1,2,5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * Example 2:
 *
 * Input: coins = [2], amount = 3
 * Output: -1
 * Example 3:
 *
 * Input: coins = [1], amount = 0
 * Output: 0
 *
 *
 * Constraints:
 *
 * 1 <= coins.length <= 12
 * 1 <= coins[i] <= 231 - 1
 * 0 <= amount <= 104
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;

        int[] dp = new int[amount+1];

        for (int i = 1; i < amount+1; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int coin : coins) {
                System.out.println("I:" + i + ", Coin:" + coin);

                if((i-coin)>=0) {
                    int a = dp[i];
                    int b = dp[i - coin]+1;

                    System.out.println("A:" + a + ", B:" + b);
                    dp[i] = Math.min(a, b);
                }
            }
        }

        if(dp[amount] == Integer.MAX_VALUE) return -1;
        return dp[amount];
    }

    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
        System.out.println(cc.coinChange(new int[]{1, 5,6,9},11));
        System.out.println(cc.coinChange(new int[]{2},3));
    }

}
