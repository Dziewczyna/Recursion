package com.factorial;

import java.util.Scanner;

public class FactorialIteration {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę, dla której obliczyć silnię(liczba całkowita)");
    int num = scanner.nextInt();
    System.out.println("Silnia dla liczby " + num + " wynosi: " + factorialIteration(num));
  }

  private static int factorialIteration(int n) {
    int result = 1;
    if (n == 0) {
      return result;
    } else {
      for (int i = 1; i <= n; i++) {
        result = result * i;
      }
    }
    return result;
  }
}
