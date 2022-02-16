package com.rfoliveira.anagramWord;

import java.util.Arrays;

public class CheckQuantityAnagrams {
    public static int checkAnagrams(String word) {
        String wordReverse = new StringBuilder(word).reverse().toString();
        int anagramsQuantity = 0;
        if(word.length() > 2 && wordReverse.equalsIgnoreCase(word))
            anagramsQuantity++;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                String substring = word.substring(i, j);
                for (int k = i + 1; k <= word.length() - substring.length(); k++) {
                    String substringCheck = word.substring(k, (k + substring.length()));

                    if(isAnagram(substring, substringCheck))
                        anagramsQuantity++;

                }
            }
        }
        return anagramsQuantity;
    }

    private static boolean isAnagram(String word, String word2){
        char[] wordChar = word.toCharArray();
        char[] wordChar2 = word2.toCharArray();
        Arrays.sort(wordChar);
        Arrays.sort(wordChar2);
        String wordOrder = new String(wordChar);
        String wordOrder2 = new String(wordChar2);
        if (wordOrder.equalsIgnoreCase(wordOrder2))
            return true;
        return false;
    }
}
