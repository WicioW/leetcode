package arraysandhashing;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/
 * 128. Longest Consecutive Sequence
 *
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 *
 * Example 2:
 *
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 *
 *
 *
 * Constraints:
 *
 *     0 <= nums.length <= 105
 *     -109 <= nums[i] <= 109
 */
public class LongestConsecutive {

    public static void main(String[] args) {
//        int[] nums = {0,3,7,2,5,8,4,6,0,1};
//        System.out.println(longestConsecutive(nums));//[0, 0, 1, 2, 3, 4, 5, 6, 7, 8]
//
//
//
//        int[] nums2 = {100,4,200,1,3,2}; //1, 2, 3, 4, 100, 299
//        System.out.println(longestConsecutive(nums2));


        int[] num3={9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(num3)); //[-1, 0, 1, 3, 4, 5, 6, 7, 8, 9]

    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length ==0) return 0;
        List<Integer> list = Arrays.stream(nums).boxed().distinct().sorted().toList();
        int counter = 0;
        int longestCount = 0;

        for (int i = 1; i < list.size(); i++) {
            if(sameOrOneLess(list.get(i),list.get(i-1))){
                counter++;
                if(counter>longestCount){
                    longestCount=counter;
                }
            }else {
                counter=0;
            }
        }

        return longestCount+1;
    }

    private static boolean sameOrOneLess(int bigger, int smaller){
        if(bigger==smaller) return true;
        if(bigger-smaller==1) return true;
        return false;
    }
}
