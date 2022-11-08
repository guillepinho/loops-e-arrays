package br.com.dio.exercicios;

import java.util.Scanner;

public class exercicio1 {
  
  public static void main(String[] args) {
    
    
    Scanner scan = new Scanner(System.in);
    String name;
    int age;

    while (true)  {
      System.out.println("What's your name?");
      name = scan.next();

      if (name.equals("0")) break;

      System.out.println("What's your age?");
      age = scan.nextInt();

      System.out.println("Hello, " + name + ". You're " + age + " years old.");
    }
  }
}
