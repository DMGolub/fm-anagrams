package com.ua.foxminded.dmgolub.anagrams;

import java.util.StringJoiner;

public class LettersWordReverser implements Reverser {
    private String delimiter;
    
    public LettersWordReverser(String delimiter) {
        this.delimiter = delimiter;
    }
    
    @Override
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input must not be null!");
        }
        
        StringJoiner result = new StringJoiner(delimiter);
        String[] words = input.split(delimiter, -1);

        for (String word : words) {
            int leftIndex = 0;
            int rightIndex = word.length() - 1;
            char[] chars = word.toCharArray();
            
            while (leftIndex < rightIndex) {
                if (Character.isLetter(chars[leftIndex]) && Character.isLetter(chars[rightIndex])) {
                    swap(chars, leftIndex, rightIndex);
                    ++leftIndex;
                    --rightIndex;
                }
                if (!Character.isLetter(chars[leftIndex])) {
                    ++leftIndex;
                }
                   if (!Character.isLetter(chars[rightIndex])) {
                       --rightIndex;
                   }
            }
            result.add(new String(chars));
        }
        return result.toString();
    }
    
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
