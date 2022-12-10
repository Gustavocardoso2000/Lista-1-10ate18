//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7

import java.util.Scanner;

class Exercicio13 {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Digite seu sexo: [M/W] ");
      String gender = scan.next();
      System.out.print("Digite com sua altura: ");
      double height = scan.nextDouble();


      if (gender.equalsIgnoreCase("m")) {
        double idealWeight = (72.7 * height) - 58;
        System.out.println("Sua altura ideal é " + idealWeight);
      } else if (gender.equalsIgnoreCase("w")) {
        double idealWeight = (62.1 * height) - 44.7;
        System.out.println("A altura ideal é " + idealWeight);
      } else {
        System.out.println("Entrada inválida!");
      }
    }    
  }
}