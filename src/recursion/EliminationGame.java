package recursion;


/**
 * You have a list arr of all integers in the range [1, n] sorted in a strictly increasing order. Apply the following algorithm on arr:
 *
 * Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.
 * Repeat the previous step again, but this time from right to left, remove the rightmost number and every other number from the remaining numbers.
 * Keep repeating the steps again, alternating left to right and right to left, until a single number remains.
 * Given the integer n, return the last number that remains in arr.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 9
 * Output: 6
 * Explanation:
 * arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * arr = [2, 4, 6, 8]
 * arr = [2, 6]
 * arr = [6]
 * Example 2:
 *
 * Input: n = 1
 * Output: 1
 *
 *
 * Constraints:
 *
 * 1 <= n <= 109
 */
public class EliminationGame {
    public  int lastRemaining(int n) {
     if(n == 1) return 1;
     else{
         return 2 * (n/2 + 1 - lastRemaining(n/2));
     }



//        int[] newArray = removeFromLeft(array);
//        System.out.println(Arrays.toString(newArray));
//
//
//        int[] newArray2 = removeFromRight(newArray);
//        System.out.println(Arrays.toString(newArray2));
    }


    public static void main(String[] args) {
        EliminationGame eliminationGame = new EliminationGame();
        System.out.println(eliminationGame.lastRemaining(1));
        System.out.println(eliminationGame.lastRemaining(2));
        System.out.println(eliminationGame.lastRemaining(3));
        System.out.println(eliminationGame.lastRemaining(4));
        System.out.println(eliminationGame.lastRemaining(5));
        System.out.println(eliminationGame.lastRemaining(6));
        System.out.println(eliminationGame.lastRemaining(7));
        System.out.println(eliminationGame.lastRemaining(8));
        System.out.println(eliminationGame.lastRemaining(9));
        System.out.println(eliminationGame.lastRemaining(10));
    }

        // 1 -> 1
        // 2 -> 2
        // 3 -> 2
        // 4 -> 2
        // 5 -> 2
        // 6 -> 4
        // 7 -> 4
        // 8 -> 6
        // 9 -> 6
        // 10 -> 8

}
