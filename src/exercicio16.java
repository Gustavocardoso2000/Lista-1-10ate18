//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
import java.util.Scanner;

class exercicio16 {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println();

      System.out.print("Qual o tamanho da parede a ser pintada?? (m2) ");
      
      double sizeWall = scan.nextDouble();
      System.out.println("O tamanho da parede é " + sizeWall + "m2");

      double calculateTint = sizeWall/3;
      System.out.println("Será necessário " + 
      calculateTint + "L da tonalidade.");
      
      double canTint = Math.round(calculateTint/18);
      System.out.println("Total de " + canTint + " Latas");

      double priceTotal = canTint*80;
      System.out.println("Preço total R$" + priceTotal);
    }

  }
}