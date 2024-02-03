// Question Name : Insert and Search In A Trie
// Question URL : https://www.geeksforgeeks.org/problems/trie-insert-and-search0651/1

class Solution
{
    static final int ALPHABET_SIZE = 26;

    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
        }
    };
    static void insert(TrieNode root, String key) 
    {
        int length=key.length();
        for( int level=0 ; level < length ; level++ )
        {
            int index = key.charAt(level) - 'a' ;
            if(root.children[index]==null)
            {
                root.children[index]=new TrieNode();
            }
            root=root.children[index];
        }
        root.isEndOfWord=true;
    }

    //Function to use TRIE data structure and search the given string.
    static boolean search(TrieNode root, String key)
    {
        int length=key.length();
        for( int level=0 ; level < length ; level++ )
        {
            int index = key.charAt(level) - 'a' ;
            if(root.children[index]==null)
            {
                return false;
            }
            root=root.children[index];
        }
        if(root.isEndOfWord==true)
        return true;
        return false;
    }
}