// Question Name : Find Words Containing Character
// Question URL : https://leetcode.com/problems/find-words-containing-character/

import java.util.*;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains(""+x))
            ar.add(i);
        }
        return ar;
    }
}
