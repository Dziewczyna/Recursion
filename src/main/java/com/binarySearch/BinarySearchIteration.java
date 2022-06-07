package com.binarySearch;

import java.util.Arrays;

public class BinarySearchIteration {
  public static void main(String[] args) {
    int[] numArray = {5, 10, 15, 20, 25, 30, 35};
    System.out.println("Tablica: " + Arrays.toString(numArray));
    int key = 20;
    System.out.println(" Wartosc do wyszukania =" + key);

    int result = binarySearchIteration(numArray, key);
    if (result == -1) System.out.println("Brak takiej wartości w tablicy");
    else System.out.println("Wartosc znaleziona pod indeksem: " + result);
  }

  public static int binarySearchIteration(int[] tabToSearch, int szukanaLiczba) {
    int lewo = 0, prawo = tabToSearch.length - 1, srodek = 0;
    while (lewo <= prawo) {
      srodek = (lewo + prawo) / 2;
      if (tabToSearch[srodek] == szukanaLiczba) return srodek;
      else if (tabToSearch[srodek] < szukanaLiczba) lewo = srodek + 1;
      else prawo = srodek - 1;
    }
    return -1;
  }
}
