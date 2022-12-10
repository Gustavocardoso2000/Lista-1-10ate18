//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
import java.util.Scanner;

class Exercicio12 {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Digite sua altura: ");
      double height = scan.nextDouble();

      double ideal_weight = (72.7 * height) - 58;
      
      System.out.println("O peso ideal é = " + ideal_weight + "kg");
    }
  }
}