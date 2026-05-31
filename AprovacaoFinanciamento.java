import java.util.Scanner;

public class AprovacaoFinanciamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua renda mensal: ");
        double rendaMensal = scanner.nextDouble();

        System.out.print("Informe o Valor da Parcela: ");
        double valorParcela = scanner.nextDouble();

        double comprometimento = (valorParcela/rendaMensal)*100;

        if (comprometimento <= 30) {
            System.out.printf("APROVADO. Comprometimento: %.2f%%%n", comprometimento);
        } else {
            System.out.printf("REPROVADO. Comprometimento: %.2f%%%n", comprometimento);
        }
        scanner.close();
        
    }
}
