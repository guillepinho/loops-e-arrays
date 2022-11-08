package br.com.dio.exercicios;

import java.util.Scanner;

public class exercicio6 {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Let's get a factorial! Gimme a number:");
    final int limit = scan.nextInt();

    int result = limit;

    for (int i = limit - 1; i >= 1; i -= 1) {
      result = result * i;
    }
    
    System.out.println("And the result is: " + result + ".");
  }
}
