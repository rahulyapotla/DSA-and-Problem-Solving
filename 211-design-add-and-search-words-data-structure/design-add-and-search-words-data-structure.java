public class Node {
    Node[] children;
    boolean word;

    public Node() {
        children = new Node[26];
        word = false;
    }
}

class WordDictionary {
    public Node root;
    public WordDictionary() {
        root = new Node();
    }
    
    public void addWord(String word) {
        Node cur = root;
        for(char c: word.toCharArray()) {
            if(cur.children[c-'a'] == null) {
                cur.children[c-'a'] = new Node();
            }
            cur = cur.children[c-'a'];
        }
        cur.word = true;
    }
    
    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    public boolean dfs(String word, int j, Node root) {
        Node cur = root;
        for(int i=j;i<word.length();i++) {
            char c = word.charAt(i);
            if(c=='.') {
                for(Node child : cur.children) {
                    if(child != null && dfs(word, i+1, child)) {
                        return true;
                    }
                }
                return false;
            } else {
                if(cur.children[c-'a'] == null)
                    return false;
                cur = cur.children[c-'a'];
            }
        }
        return cur.word;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */