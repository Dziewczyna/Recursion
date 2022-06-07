package com.factorial;

import java.util.Scanner;

public class FactorialRecursion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę, dla której obliczyć silnię(liczba całkowita)");
    int num = scanner.nextInt();
    System.out.println("Silnia dla liczby " + num + " wynosi: " + factorialRecursion(num));
  }

  private static int factorialRecursion(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorialRecursion(n - 1);
    }
  }
}
