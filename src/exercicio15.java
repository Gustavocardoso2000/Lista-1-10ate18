import java.util.Scanner;

public class exercicio15 {

    public static void main (String args []) {

     Scanner sc = new Scanner(System.in);
     // 1 Perguntar quando ganha por hora
     System.out.print("Quanto você ganha por hora: ");
     double valorHora = sc.nextDouble();
     // 2 Perguntar o número de horas trabalhadas no mês
     System.out.println("Quantas horas você trabalhou no mês");
     double qtdHoras = sc.nextDouble();
     // 3 Calcule o Salário bruto
     double salarioBruto = valorHora * qtdHoras;
     // Calcular 8% de INSS
     double INSS = salarioBruto * 0.08;
    // Desconto do Sindicato
     double sindicado = salarioBruto * 0.05;
     // Calcule o IR
     double IRRF = salarioBruto * 0.11;
     double totalDescontos = INSS + sindicado + IRRF;
     double salarioLiquido = salarioBruto - totalDescontos;

     System.out.println("+ salario Bruto : R$ " + salarioBruto);
     System.out.println("- IR (11%) : R$ " + INSS);
     System.out.println("- Sindicato (5%) : R$ " + sindicado);
     System.out.println("- Salário liquido : R$ " + salarioLiquido);
     sc.close();


    }
}
