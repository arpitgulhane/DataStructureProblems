package section3_Day15_HashTables;

import java.util.Hashtable;
import java.util.LinkedList;

public class HashTables_problem {
    public static void main(String[] args) {
        // uc1
//        String sentence = "To be or not to be";
//        Hashtable<String, Integer> freq = new Hashtable<>();
//
//        // Split the sentence into words
//        String[] words = sentence.split(" ");
//
//        // Count the frequency of each word
//        for (String word : words) {
//            if (freq.containsKey(word)) {
//                freq.put(word, freq.get(word) + 1);
//            } else {
//                freq.put(word, 1);
//            }
//        }
//
//        // Print the frequency of each word
//        for (String word : freq.keySet()) {
//            System.out.println(word + ": " + freq.get(word));
//        }

// uc2
        String sentence = "To be or not to be";
        Hashtable<String, LinkedList<Integer>> wordFreq = new Hashtable<>();

        // Convert sentence to lowercase and split into array of words
        String[] words = sentence.toLowerCase().split("\\W+");

        // Iterate over each word and update the frequency in the Hashtable
        for (String word : words) {
            LinkedList<Integer> freqList = wordFreq.get(word);
            if (freqList == null) {
                freqList = new LinkedList<>();
                freqList.add(1);
                wordFreq.put(word, freqList);
            } else {
                freqList.add(freqList.getLast() + 1);
            }
        }

        // Print out the frequency of each word in the sentence
        for (String word : wordFreq.keySet()) {
            LinkedList<Integer> freqList = wordFreq.get(word);
            int frequency = freqList.getLast();
            System.out.println(word + ": " + frequency);
        }

    }
}
