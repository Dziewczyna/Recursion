package com.sumOfElements;

import java.util.Random;
import java.util.Scanner;

public class SumOfElementsInArrayIteration {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj, ile elementow ma miec tablica(liczba calkowita)");
    int elementNo = scanner.nextInt();
    System.out.println(
        "Suma "
            + elementNo
            + " elementow tablicy wynosi: "
            + sumOfElementsInArrayIteration(elementNo));
  }

  private static int sumOfElementsInArrayIteration(int n) {
    int wynik = 0;
    int[] intNumbers = generateArrayOfNumbers(n);
    for (int i = 0; i < n; i++) {
      System.out.println(intNumbers[i]);
      wynik = wynik + intNumbers[i];
    }
    return wynik;
  }

  private static int[] generateArrayOfNumbers(int amountOfInts) {
    Random rd = new Random();
    int[] arr = new int[amountOfInts];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rd.nextInt(100 - 1) + 1;
    }
    return arr;
  }
}
