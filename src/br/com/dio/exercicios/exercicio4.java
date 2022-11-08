package br.com.dio.exercicios;

import java.util.Scanner;

public class exercicio4 {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("How many numbers should we seek?");
    int limit = scan.nextInt();

    int count = 0;
    int odd = 0;
    int even = 0;
    int numb;
    do {
      System.out.println("Tell me a number?");
      numb = scan.nextInt();

      count += 1;
      if (numb % 2 == 0) even += 1;
      else odd += 1;
    } while (count < limit);

    System.out.println("You gave me " + even + " even numbers.");
    System.out.println("And " + odd + " odd numbers.");

  }
}
