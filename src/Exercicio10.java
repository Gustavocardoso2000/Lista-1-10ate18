//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
import java.util.Scanner;

class Exercicio10 {
    public static void main(String[] args) {
    
      try (var scan = new Scanner(System.in)) {
        System.out.print("Digite a temperatura em graus Celsius: ");
          double temperatureCelcius = scan.nextDouble();

          double convertTemperatureFarenheit = ((9*temperatureCelcius)/5) + 32;

          System.out.println("A temperatura " + temperatureCelcius + " em Farenheit é " + convertTemperatureFarenheit);
    }
  }
} 