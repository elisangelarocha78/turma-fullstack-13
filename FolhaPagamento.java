import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horas = scanner.nextInt();

        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        double salarioBruto = horas * valorHora;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);

        scanner.close();
    }
}












