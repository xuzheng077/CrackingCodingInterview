package ch16;

import java.util.HashMap;

/**
 * @author Xu Zheng
 * @description
 */
public class Second_WordFrequency {
    //single query
    int getFrequency(String[] book, String word) {
        word = word.trim().toLowerCase();
        int count = 0;
        for (String w : book) {
            if (w.trim().toLowerCase().equals(word)){
                count++;
            }
        }
        return count;
    }

    //multiple query
    //we can build a hash table first
    HashMap<String, Integer> setupDictionary(String[] book) {
        HashMap<String, Integer> table = new HashMap<String, Integer>();
        for (String word : book) {
            word = word.toLowerCase();
            if (word.trim().length() != 0) {
                if (!table.containsKey(word)) {
                    table.put(word, 0);
                }
                table.put(word, table.get(word) + 1);
            }
        }
        return table;
    }

    int getFrequency(HashMap<String, Integer> table, String word) {
        if (table == null || word == null) return -1;
        word = word.toLowerCase();
        if (table.containsKey(word)) {
            return table.get(word);
        }
        return 0;
    }
}
