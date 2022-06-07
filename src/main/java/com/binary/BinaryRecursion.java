package com.binary;

import java.util.Scanner;

public class BinaryRecursion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Podaj liczbę, którą chcesz przedstawić w postaci binarnej(liczba całkowita)");
    int num = scanner.nextInt();
    System.out.print("Postać binarna dla liczby " + num + " wynosi: ");
    binaryIteration(num);
  }

  private static void binaryIteration(int n) {
    if (n > 0) {
      binaryIteration(n / 2);
      System.out.print(n % 2);
    }
  }
}
