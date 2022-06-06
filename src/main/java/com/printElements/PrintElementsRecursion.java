package com.printElements;

import java.util.Arrays;
import java.util.List;

public class PrintElementsRecursion {
  public static void main(String[] args) {
    int i=0;
    List<String> elementsToPrint =
        Arrays.asList(
            "Polska", "USA", "Anglia", "Ukraina", "Litwa", "Lotwa", "Estonia", "Chorwacja");
    elementsToPrintIteration(elementsToPrint, i);
  }

  private static void elementsToPrintIteration(List<String> elementsToPrint, int count) {
    if(elementsToPrint.size()<0 || count>=elementsToPrint.size()){
      return;
    }
    System.out.println(elementsToPrint.get(count));
    elementsToPrintIteration(elementsToPrint, count+1);
  }
  }