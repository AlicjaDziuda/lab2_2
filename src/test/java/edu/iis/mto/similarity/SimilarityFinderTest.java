package edu.iis.mto.similarity;

import edu.iis.mto.search.MockForSequenceSearcher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityFinderTest {
    int[] seq1={2};
    int[] seq2={3};
    int[] seq3={2,3,5,6};
    int[] seq4={9,7,4,1};
    int[] seq5={3};
    int[] seq6={4,5,6};
    int[]seq7={5,6,4};
    SimilarityFinder similarityFinder = new SimilarityFinder(new MockForSequenceSearcher());

    @Test void return_zero_if_two_single_element_sequences_dont_have_the_same_element() {
        assertEquals(0.0,similarityFinder.calculateJackardSimilarity(seq1,seq2));
    }

    @Test void  return_one_if_two_single_element_sequences_have_the_same_element() {
        assertEquals(1.0,similarityFinder.calculateJackardSimilarity(seq5,seq2));
    }

    @Test void  return_zero_if_two_multi_elements_sequences_dont_have_the_same_element() {
        assertEquals(0.0,similarityFinder.calculateJackardSimilarity(seq3,seq4));
    }

    @Test void  return_one_if_two_multi_elements_sequences_have_the_same_elements() {
        assertEquals(1.0,similarityFinder.calculateJackardSimilarity(seq6,seq7));
    }

}
