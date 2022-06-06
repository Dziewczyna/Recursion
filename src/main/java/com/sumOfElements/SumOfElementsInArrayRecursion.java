package com.sumOfElements;

import java.util.Random;
import java.util.Scanner;

public class SumOfElementsInArrayRecursion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj, ile elementow ma miec tablica(liczba calkowita)");
    int elementNo = scanner.nextInt();
    int[] intNumbers = generateArrayOfNumbers(elementNo);
    for (int intNum : intNumbers) {
      System.out.println(intNum);
    }
    System.out.println(
        "Suma "
            + elementNo
            + " elementow tablicy wynosi: "
            + sumOfElementsInArrayRecursion(intNumbers, elementNo));
  }

  private static int sumOfElementsInArrayRecursion(int[] tab, int size) {
    if (size == 0) {
      return 0;
    }
    size--;
    return tab[size] + sumOfElementsInArrayRecursion(tab, size);
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
