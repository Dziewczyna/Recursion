package com.fibonacci;

import java.util.Scanner;

public class FibonacciRecursion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj, który element ciągu Fibonacciego obliczyć(liczba całkowita)");
    int elementNo = scanner.nextInt();
    System.out.println(
        elementNo + " element ciągu fibonacciego to: " + fibonnaciRecursion(elementNo));
  }

  private static int fibonnaciRecursion(int n) {
    if ((n == 1) || (n == 2)) {
      return 1;
    } else {
      return fibonnaciRecursion(n - 1) + fibonnaciRecursion(n - 2);
    }
  }
}
