import java.util.Scanner;

//oão Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

class exercise014 {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println();

        int weightLimit = 50;
        System.out.print("Qual o peso(kg) do peixe do João? ");
        double weightFish = scan.nextDouble();

        System.out.println("O limite de peso é + weightLimit + kg");
        if (weightFish > weightLimit) {
          double weightExceeded = weightFish - weightLimit;
          double tax = weightExceeded * 4;
          System.out.println("João Papo-de-Pescador irá pagar uma multa de R$" + tax + " per " + weightExceeded + "kg exceedeed." );
        } else {
          System.out.println("João Papo-de-Pescador did not exceed the limit!");
        }
    }
    

  }
}