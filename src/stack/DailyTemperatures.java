package stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * https://leetcode.com/problems/daily-temperatures/
 *739. Daily Temperatures
 *
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
 *
 * Example 1:
 *
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 *
 * Example 2:
 *
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 *
 * Example 3:
 *
 * Input: temperatures = [30,60,90]
 * Output: [1,1,0]
 *
 * Constraints:
 *     1 <= temperatures.length <= 105
 *     30 <= temperatures[i] <= 100
 */
public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        if (temperatures == null || temperatures.length == 0)
            return temperatures;

        final int[] warmer = new int[temperatures.length];

        final Stack<Integer> stack = new Stack<>();
        stack.push(0); //index

        int j = 1;
        while (j < temperatures.length) {

            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[j]) {
                int i = stack.pop();
                warmer[i] = j - i;
            }
            stack.push(j);
            j++;
        }
        return warmer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

}
