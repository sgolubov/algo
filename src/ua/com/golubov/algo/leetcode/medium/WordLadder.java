package ua.com.golubov.algo.leetcode.medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }

        Set<String> used = new HashSet<>();
        used.add(beginWord);

        String prevWord = beginWord;
        String nextWord;

        for (int i = 0; i < wordList.size(); i++) {
            nextWord = findNextWord(prevWord, endWord, wordList, used);
            if (nextWord.equals(endWord)) {
                return used.size() - 1;
            }
            if (nextWord.equals(prevWord)) {
                return 0;
            }
            prevWord = nextWord;
        }

        return 0;
    }

    private String findNextWord(String prevWord, String endWord, List<String> wordList, Set<String> used) {
        int currDiff = diff(prevWord, endWord);
        for (String curWord : wordList) {
            if (!used.contains(curWord)) {
                int diffToCur = diff(prevWord, curWord);
                int diffToEnd = diff(endWord, curWord);
                // if this world diff from prev for one char and
                // is more similar to end word than previous than do the step
                if (diffToCur == 1 && diffToEnd <= currDiff) {
                    used.add(curWord);
                    return curWord;
                }
            }
        }
        return prevWord;
    }

    private int diff(String wordOne, String wordTwo) {
        int diff = wordOne.length();
        for (int i = 0; i < wordOne.length(); i++) {
            if (wordOne.charAt(i) == wordTwo.charAt(i)) {
                diff--;
            }
        }
        return diff;
    }

}
