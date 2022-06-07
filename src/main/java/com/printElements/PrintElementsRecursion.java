package com.printElements;

import java.util.Arrays;
import java.util.List;

public class PrintElementsRecursion {
  public static void main(String[] args) {
    int i = 0;
    List<String> elementsToPrint =
        Arrays.asList(
            "Polska", "USA", "Anglia", "Ukraina", "Litwa", "Lotwa", "Estonia", "Chorwacja");
    elementsToPrintRecursion(elementsToPrint, i);
  }

  private static void elementsToPrintRecursion(List<String> elementsToPrint, int count) {
    if (elementsToPrint.size() < 0 || count >= elementsToPrint.size()) {
      return;
    }
    System.out.println(elementsToPrint.get(count));
    elementsToPrintRecursion(elementsToPrint, count + 1);
  }
}
