package edu.calpoly.csc305.debugging;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thesaurus {
  private Map<String, List<String>> synonyms;

  public Thesaurus() {
    synonyms = new HashMap<>();
  }

  /**
   * adds word to Hash if not already in HashMap.
   * Otherwise adds Alternatives to Thesaurus.
   */
  public void addAlternatives(String word, String ... alternatives) {
    if (!synonyms.containsKey(word)) {
      synonyms.put(word, Arrays.asList(alternatives));
    } else {
      synonyms.get(word).addAll(Arrays.asList(alternatives));
    }

  }

  public List<String> alternatives(String word) {
    return synonyms.get(word);
  }
}
