package com.vetias.java.workshop.basics.string;
import org.junit.jupiter.api.Test;

import com.java.workshop.basics.WordCount;

import org.junit.jupiter.api.Assertions;


public class WordCountTest {
    @Test
    public void testWordCount() {
        WordCount wordCount = new WordCount();
        int count = wordCount.count("This is the end of this all of this");

        Assertions.assertEquals(9, count);
    }
    
    @Test
    public void testAnotherString(){
        WordCount wordCount = new WordCount();
        int count = wordCount.count("This is the world of jaava dast");
        Assertions.assertEquals(7, count);
    }
      
}
