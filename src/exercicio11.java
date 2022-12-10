//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//o produto do dobro do primeiro com metade do segundo .
//a soma do triplo do primeiro com o terceiro.
//o terceiro elevado ao cubo.
import java.util.Scanner;

class exercise11 {
  public static void main(String[] args) {

    try (var scan = new Scanner(System.in)) {
        System.out.print("Digite o primeiro numero inteiro: ");
        int firtIntegerNumber = scan.nextInt();
        System.out.print("Digite o Segundo numero inteiro: ");
        int secondIntegerNumber = scan.nextInt();
        System.out.print("Digite o número real: ");
        double realNumber = scan.nextDouble();

        int alternativeA = (firtIntegerNumber*2) * (secondIntegerNumber/2);
        double alternativeB = (firtIntegerNumber*3) + realNumber;
        double alternaticeC = Math.pow(realNumber,3);

        System.out.println("O produto do dobro do primeiro com meio segundo = " + alternativeA);
        System.out.println("A soma do triplo do primeiro com o trio = " + alternativeB);
        System.out.println("O cubo de trinta = " + alternaticeC);
    }

  }
}