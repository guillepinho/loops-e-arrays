package br.com.dio.exercicios;

import java.util.Scanner;

public class exercicio3 {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number;
    int high = 0;
    int sum = 0;
    int avg = 0;
    int count = 0;
    do {
      System.out.println("Tell me a number: ");
      number = scan.nextInt();
      sum = sum + number;
      count += 1;
      if (number > high) high = number;
      if (count == 5) avg = sum / 5;
    } while (count < 5);

    System.out.println("Highest num: " + high);
    System.out.println("Sum of nums: " + sum);
    System.out.println("Average of nums: " + avg);
  }
}
