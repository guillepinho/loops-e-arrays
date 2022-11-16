package br.com.dio.exercicios;

public class exercicio7 {
  
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6};

    // for (int i = array.length - 1; i >= 0; i -= 1) {
    //   System.out.println(array[i]);
    // }

    int count = array.length - 1;
    while(count >= 0) {
      System.out.print(array[count] + " ");
      count--;
    }
  }
}
