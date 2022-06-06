package com.fibonacci;

import java.util.Scanner;

public class FibonacciIteration {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj, który element ciągu Fibonacciego obliczyć(liczba całkowita)");
    int elementNo = scanner.nextInt();
    System.out.println(
        elementNo + " element ciągu fibonacciego to: " + fibonnaciIteration(elementNo));
  }

  private static int fibonnaciIteration(int n) {
    int element0 = 0;
    int element1 = 1;
    int wynik = 0;
    if ((n == 0) || (n == 1)) {
      return n;
    } else {
      for (int i = 2; i <= n; i++) {
        wynik = element0 + element1;
        element0 = element1;
        element1 = wynik;
      }
      return wynik;
    }
  }
}
