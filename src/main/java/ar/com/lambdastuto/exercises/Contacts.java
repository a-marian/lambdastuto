package ar.com.lambdastuto.exercises;

import java.util.Scanner;
import java.util.HashMap;

public class Contacts {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            TrieA trie = new TrieA();
            for (int i = 0; i < n; i++) {
                String operation = scan.next();
                String contact   = scan.next();
                if (operation.equals("add")) {
                    trie.add(contact);
                } else if (operation.equals("find")) {
                    System.out.println(trie.find(contact));
                }
            }
            scan.close();
        }
    }

    class TrieNodeA {
        private HashMap<Character, TrieNodeA> children = new HashMap<>();
        public int size = 0; // this was the main trick to decrease runtime to pass tests.

        public void putChildIfAbsent(char ch) {
            children.putIfAbsent(ch, new TrieNodeA());
        }

        public TrieNodeA getChild(char ch) {
            return children.get(ch);
        }
    }

    class TrieA {
        TrieNodeA root = new TrieNodeA();

        public void add(String str) {
            TrieNodeA curr = root;
            for (char ch : str.toCharArray()) {
                curr.putChildIfAbsent(ch);
                curr = curr.getChild(ch);
                curr.size++;
            }
        }

        public int find(String prefix) {
            TrieNodeA curr = root;

            for (char ch : prefix.toCharArray()) {
                curr = curr.getChild(ch);
                if (curr == null) {
                    return 0;
                }
            }
            return curr.size;
        }

}
