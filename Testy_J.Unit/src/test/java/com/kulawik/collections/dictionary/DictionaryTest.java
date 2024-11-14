package com.kulawik.collections.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryTest {

    @Test
    public void testAddWord(){
        //given
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN,"stuck");
        //when
        dictionary.addWord(polishWord,englishWord);
        //then
        assertEquals(1, dictionary.size());
    }

    @Test
    public void testFindingEnglishWords(){
        //given
        Dictionary dictionary= new Dictionary();
        dictionary.addWord("stos",new EnglishWord(PartOfSpeech.NOUN,"stuck"));
        dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"play"));
        dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"game"));
        dictionary.addWord("grać",new EnglishWord(PartOfSpeech.VERB,"play"));
        //when
        List<EnglishWord>result = dictionary.findEnglishWords("gra");
        //then
        List<EnglishWord>expectedList = new ArrayList<>();
        dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"play"));
        dictionary.addWord("gra",new EnglishWord(PartOfSpeech.NOUN,"game"));
        assertEquals(expectedList,result);

    }
    @Test
    public void testFindingEnglishWords_withPartOfSpeech(){
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos",new EnglishWord(PartOfSpeech.NOUN,"stuck"));
        dictionary.addWord("brac",new EnglishWord(PartOfSpeech.NOUN,"brotherhood"));
        dictionary.addWord("brac",new EnglishWord(PartOfSpeech.VERB,"take"));
        dictionary.addWord("grać",new EnglishWord(PartOfSpeech.VERB,"play"));

        //when
        List<EnglishWord>result = dictionary.findEnglishWords("brac",PartOfSpeech.NOUN);
        //then
        List<EnglishWord>expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN,"brotherhood"));
        assertEquals(expectedList,result);
    }


}