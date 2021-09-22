package edu.calpoly.csc305.debugging;

public class DebuggerMain {
  /**
   * If not in Hash, adds word and alternatives.
   * if in hash, adds new alternatives.
  */
  public static void main(String[] args) {
    Thesaurus thesaurus = new Thesaurus();

    thesaurus.addAlternatives("interesting",
         "absorbing", "consuming", "engaging", "fascinating");

    System.out.println(thesaurus.alternatives("interesting"));
  }
}
