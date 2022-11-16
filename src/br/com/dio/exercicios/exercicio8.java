package br.com.dio.exercicios;

import java.util.Scanner;

public class exercicio8 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] consoantes = new String[6];
    int consoantesLidas = 0;

    int count = 0;
    do {
      System.out.println("Letra: ");
      String letra = scan.next();

      if (  !(letra.equalsIgnoreCase("a") |
              letra.equalsIgnoreCase("e") |
              letra.equalsIgnoreCase("i") |
              letra.equalsIgnoreCase("o") |
              letra.equalsIgnoreCase("u")))  {
            consoantes[count] = letra;
            consoantesLidas += 1;
      };

      count += 1;

    } while(count < consoantes.length);

    System.out.println("Consoantes " + consoantesLidas + ".");
    for ( String consoante : consoantes ) {
      if (consoante != null) System.out.print(consoante + " ");
    }

    scan.close();
  }
}
