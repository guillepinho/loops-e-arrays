package br.com.dio.exercicios;

import java.util.Scanner;

public class exercicio2 {

  public static void main(String[] args) {

    int grade;
    Scanner scan = new Scanner(System.in);

    System.out.println("Rate me, friend. 0 to 10");
    grade = scan.nextInt();

    while (grade < 0 || grade > 10) {
        System.out.println("Invalid input, let's try it again. 0 to 10, okay?");
        grade = scan.nextInt();
    }
  }

}
