package com.binarySearch;

import java.util.Arrays;

public class BinarySearchRecursion {
  public static void main(String[] args) {
    int[] numArray = {5, 10, 15, 20, 25, 30, 35};
    System.out.println("Tablica: " + Arrays.toString(numArray));
    int key = 20;
    System.out.println("Wartosc do wyszukania = " + key);
    int n = numArray.length;

    int result = binarySearchRecursion(numArray, 0, n - 1, key);

    if (result == -1) System.out.println("Brak takiej wartości w tablicy");
    else System.out.println("Wartosc znaleziona pod indeksem: " + result);
  }

  public static int binarySearchRecursion(
      int[] tabToSearch, int left, int right, int numberToSearch) {

    if (right >= left && left <= tabToSearch.length - 1) {

      int mid = left + (right - left) / 2;

      if (tabToSearch[mid] == numberToSearch) return mid;
      if (tabToSearch[mid] > numberToSearch)
        return binarySearchRecursion(tabToSearch, left, mid - 1, numberToSearch);
      return binarySearchRecursion(tabToSearch, mid + 1, right, numberToSearch);
    }
    return -1;
  }
}
