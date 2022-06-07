package com.printElements;

import java.util.Arrays;
import java.util.List;

public class PrintElementsIteration {
  public static void main(String[] args) {
    List<String> elementsToPrint =
        Arrays.asList(
            "Polska", "USA", "Anglia", "Ukraina", "Litwa", "Lotwa", "Estonia", "Chorwacja");
    elementsToPrintIteration(elementsToPrint);
  }

  private static void elementsToPrintIteration(List<String> elementsToPrint) {
    for (String element : elementsToPrint) {
      System.out.println(element);
    }
  }
}
