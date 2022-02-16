package com.rfoliveira.anagramWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckQuantityAnagramsTests {
    @Test
    public void checkWordOneLetter(){
        int anagramNumbers;
        anagramNumbers = CheckQuantityAnagrams.checkAnagrams("a");
        assertEquals(0,anagramNumbers);
    }

    @Test
    public void checkWordTwoEqualsLetter(){
        int anagramNumbers;
        anagramNumbers = CheckQuantityAnagrams.checkAnagrams("aa");
        assertEquals(1,anagramNumbers);
    }

    @Test
    public void checkWordTwoDifferentLetter(){
        int anagramNumbers;
        anagramNumbers = CheckQuantityAnagrams.checkAnagrams("ab");
        assertEquals(0,anagramNumbers);
    }

    @Test
    public void checkWordUppercaseLowercase(){
        int anagramNumbers;
        anagramNumbers = CheckQuantityAnagrams.checkAnagrams("aA");
        assertEquals(1,anagramNumbers);
    }

    @Test
    public void checkWordExample01(){
        int anagramNumbers;
        anagramNumbers = CheckQuantityAnagrams.checkAnagrams("ovo");
        assertEquals(3,anagramNumbers);
    }

    @Test
    public void checkWordExample02(){
        int anagramNumbers;
        anagramNumbers = CheckQuantityAnagrams.checkAnagrams("ifailuhkqq");
        assertEquals(3,anagramNumbers);
    }

    @Test
    public void checkWordEmpty(){
        int anagramNumbers;
        anagramNumbers = CheckQuantityAnagrams.checkAnagrams("");
        assertEquals(0,anagramNumbers);
    }
}
