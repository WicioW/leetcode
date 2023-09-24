package arraysandhashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 139. Word Break
 * <p>
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
 * <p>
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 * Example 2:
 * <p>
 * Input: s = "applepenapple", wordDict = ["apple","pen"]
 * Output: true
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 * Note that you are allowed to reuse a dictionary word.
 * Example 3:
 * <p>
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 300
 * 1 <= wordDict.length <= 1000
 * 1 <= wordDict[i].length <= 20
 * s and wordDict[i] consist of only lowercase English letters.
 * All the strings of wordDict are unique.
 */
public class WordBreak {

//    public boolean wordBreak(String s, List<String> wordDict) {
//        Map<String, Integer> mapOfUsedWords = new HashMap<>();
//        int before;
//        boolean shouldGoOn = true;
//        while(shouldGoOn) {
//            for (String string : wordDict) {
//                before = s.length();
//                s = s.replaceAll(string, "");
//                if (before > s.length()) {
//                    Integer count = mapOfUsedWords.getOrDefault(string, 0);
//                    mapOfUsedWords.put(string, count + 1);
//                } else {
//                    mapOfUsedWords.put(string, 0);
//                }
//            }
//            shouldGoOn=false;
//        }
//        return s.isEmpty();
//    }

    public boolean wordBreak(String s, List<String> wordDict) {
        String temp = s;
        String substring;
        int start = 0;
        for (int i = 1; i <= s.length(); i++) {
            substring = s.substring(start, i);
            if (wordDict.contains(substring)) {
                start = start + substring.length();
                temp = temp.replaceAll(substring, "");
            }
        }
        return temp.isEmpty();
    }

    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        System.out.println(wordBreak.wordBreak("leetcode", List.of("leet", "code"))); //true

        System.out.println(wordBreak.wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat"))); //false

        System.out.println(wordBreak.wordBreak("bb", List.of("a", "b", "bbb", "bbbb"))); //true

        System.out.println(wordBreak.wordBreak("cars", List.of("car", "ca", "rs"))); //true

        System.out.println(wordBreak.wordBreak("aaaaaaa", List.of("aaaa","aaa"))); //true
    }
}
