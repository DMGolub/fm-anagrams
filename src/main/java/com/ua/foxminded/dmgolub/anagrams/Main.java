package com.ua.foxminded.dmgolub.anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*      Write an application that reverses all the words of input text:
        E.g. "abcd efgh" => "dcba hgfe"
        All non-letter symbols should stay on the same places:
        E.g. "a1bcd efg!h" => "d1cba hgf!e"
        Use Latin alphabet for test only.                            */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        LettersWordReverser reverser = new LettersWordReverser(" ");
        System.out.print(reverser.reverse(input));
    }
}
