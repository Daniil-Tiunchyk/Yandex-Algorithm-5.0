package homework_3;

import java.util.*;

public class F_InkSaver {

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEndOfWord = false;
    }

    static class Trie {
        TrieNode root = new TrieNode();

        void insert(String word) {
            TrieNode node = root;
            for (char ch : word.toCharArray()) {
                if (node.isEndOfWord) break;
                node = node.children.computeIfAbsent(ch, c -> new TrieNode());
            }
            node.isEndOfWord = true;
        }

        String getShortestPrefix(String word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                node = node.children.get(word.charAt(i));
                if (node == null) return word;
                if (node.isEndOfWord) return word.substring(0, i + 1);
            }
            return word;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trie trie = new Trie();
        StringBuilder output = new StringBuilder();

        String[] dictionaryWords = scanner.nextLine().split(" ");
        for (String word : dictionaryWords) {
            trie.insert(word);
        }

        String[] textWords = scanner.nextLine().split(" ");
        for (String word : textWords) {
            output.append(trie.getShortestPrefix(word)).append(" ");
        }

        System.out.println(output.toString().trim());
        scanner.close();
    }
}