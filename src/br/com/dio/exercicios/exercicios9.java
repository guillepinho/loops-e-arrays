package br.com.dio.exercicios;

import java.util.Random;

public class exercicios9 {
  
  public static void main(String[] args) {
    Random random = new Random();

    int[] numAleatorios = new int[20];

    for(int i = 0; i < numAleatorios.length; i += 1) {
      int numero = random.nextInt(100);
      numAleatorios[i] = numero;
    }

    System.out.print("Números Aleatórios: ");
    for (int num : numAleatorios) {
      System.out.print(num + " ");
    }

    System.out.print("\nSucessores dos Números Aleatórios: ");
    for (int num : numAleatorios) {
      System.out.print((num + 1) + " ");
    }
  }
}
