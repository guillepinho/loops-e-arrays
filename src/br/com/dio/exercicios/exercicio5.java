package br.com.dio.exercicios;

import java.util.Scanner;

public class exercicio5 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Which number of the multiplication table you'd like to see (1-10)?");
    int number = scan.nextInt();

    for (int i = 1; i <=10; i += 1) {
      System.out.println(number + " x " + i + " = " + (number * i));
    }

  }
}
