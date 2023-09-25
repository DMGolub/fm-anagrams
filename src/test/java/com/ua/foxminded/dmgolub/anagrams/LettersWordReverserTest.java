package com.ua.foxminded.dmgolub.anagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LettersWordReverserTest {
    LettersWordReverser reverser = new LettersWordReverser(" ");

    @Test
    void reverse_shouldThrowIllegalArgumentException_whenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> reverser.reverse(null));
    }
    
    @Test
    void reverse_shouldReturnEmptyString_whenInputIsEmpty() {
        assertEquals("", reverser.reverse(""));
    }
    
    @Test
    void reverse_shouldReturnOneLetter_whenOneLetterIsInput() {
        assertEquals("a", reverser.reverse("a"));
    }
    
    @Test
    void reverse_shouldReverseAllWord_whenOnlyLettersAreInput_evenCount() {
        assertEquals("dcba", reverser.reverse("abcd"));
    }
    
    @Test
    void reverse_shouldReverseAllWord_whenOnlyLettersAreInput_oddCount() {
        assertEquals("edcba", reverser.reverse("abcde"));
    }
    
    @Test
    void reverse_shouldReturnOneDigit_whenOneDigitIsInput() {
        assertEquals("1", reverser.reverse("1"));
    }
    
    @Test
    void reverse_shouldNotMakeChanges_whenOnlyDigitsAreInput_evenCount() {
        assertEquals("1234", reverser.reverse("1234"));
    }
    
    @Test
    void reverse_shouldNotMakeChanges_whenOnlyDigitsAreInput_oddCount() {
        assertEquals("12345", reverser.reverse("12345"));
    }
    
    @Test 
    void reverse_shouldNotMoveDigits_whenMixedWordIsInput() {
        assertEquals("d1cba", reverser.reverse("a1bcd"));
    }
    
    @Test
    void reverse_shouldNotMoveWords_whenMixedSentenceIsInput() {
        assertEquals("d1cba hgf!e", reverser.reverse("a1bcd efg!h"));
    }
    
    @Test
    void reverse_shouldPreserveLeadingSpace_whenOnlyLettersAreInput() {
        assertEquals(" cba", reverser.reverse(" abc"));
    }
    
    @Test
    void reverse_shouldPreserveLeadingSpaces_whenOnlyLettersAreInput() {
        assertEquals("   cba", reverser.reverse("   abc"));
    }
    
    @Test
    void reverse_shouldPreserveTrailingSpace_whenOnlyLettersAreInput() {
        assertEquals("cba ", reverser.reverse("abc "));
    }
    
    @Test
    void reverse_shouldPreserveTrailingSpaces_whenOnlyLettersAreInput() {
        assertEquals("cba   ", reverser.reverse("abc   "));
    }
    
    @Test
    void reverse_shouldPreserveLeadingSpace_whenOnlyDigitsAreInput() {
        assertEquals(" 123", reverser.reverse(" 123"));
    }
    
    @Test
    void reverse_shouldPreserveLeadingSpaces_whenOnlyDigitsAreInput() {
        assertEquals("   123", reverser.reverse("   123"));
    }
    
    @Test
    void reverse_shouldPreserveTrailingSpace_whenOnlyDigitsAreInput() {
        assertEquals("123 ", reverser.reverse("123 "));
    }
    
    @Test
    void reverse_shouldPreserveTrailingSpaces_whenOnlyDigitsAreInput() {
        assertEquals("123   ", reverser.reverse("123   "));
    }
    
    @Test
    void reverse_shouldPreserverAllSpaces_whenMixedSentenceIsInput() {
        assertEquals(" eh oll 13   dlrow  ", reverser.reverse(" he llo 13   world  "));
    }
}
