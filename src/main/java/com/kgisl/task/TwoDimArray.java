package com.kgisl.task;

/**
 * TwoDimArray
 */
public class TwoDimArray {

  public static void main(String[] args) {
    String[][] deeparrayy = new String[][] { { "John", "Mary" }, { "Alice", "Bob" } };

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(deeparrayy[i][j] + " ");
      }
      System.out.println();
    }
  }
}