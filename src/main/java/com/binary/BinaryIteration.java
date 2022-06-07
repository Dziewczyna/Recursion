package com.binary;

import java.util.Scanner;

public class BinaryIteration {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Podaj liczbę, którą chcesz przedstawić w postaci binarnej(liczba całkowita)");
    int num = scanner.nextInt();
    System.out.println("Postać binarna dla liczby " + num + " wynosi: " + binaryIteration(num));
  }

  private static String binaryIteration(int n) {
    int[] binary = new int[40];
    String result = "";
    int index = 0;
    while (n > 0) {
      binary[index++] = n % 2;
      n = n / 2;
    }
    for (int i = index - 1; i >= 0; i--) {
      result = result + binary[i];
    }
    return result;
  }
}
