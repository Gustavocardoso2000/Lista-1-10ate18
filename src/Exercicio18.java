//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
import java.util.Scanner;

class EstruturaSequencialExercise018 {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        System.out.print("Digite o tamanho do arquivo: ");
        double sizeFile = scan.nextDouble();

        System.out.print("Digite a velocidade da internet: ");
        double speedInternet = scan.nextDouble();

        double timeDownload = sizeFile/speedInternet;

        System.out.println("O tempo gasto foi : " + timeDownload);
    }
  }
}