package br.com.dio.exercicios;

import java.util.Random;

public class exercicios10 {
  
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[4][4];

    for (int i = 0; i < matriz.length; i += 1) {
      for (int j = 0; j < matriz[i].length; j += 1) {
        matriz[i][j] = random.nextInt(9);
      }
    }

    for (int[] linha : matriz) {
      for (int elemenetoColuna : linha) {
        System.out.print(elemenetoColuna + " ");
      }
      System.out.print("\n");
    }

    // for (int[] linha : matriz) {
    //   int menor;
    //   for (int elemenetoColuna : linha) {
    //     if (menor <)
    //   }
    //   System.out.print("\n");
    // }
  }
}
