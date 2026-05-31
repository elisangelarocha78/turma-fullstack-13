import java.util.Scanner;

public class FaturamentoSaneamento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o volume consumido (m³): ");
        double consumo = scanner.nextDouble();

        System.out.print("Digite o valor do m³: ");
        double valorM3 = scanner.nextDouble();

        System.out.print("Digite o valor da tarifa fixa: ");
        double tarifaFixa = scanner.nextDouble();

        System.out.print("Digite o percentual da taxa de esgoto: ");
        double percentualEsgoto = scanner.nextDouble();

        double custoAgua = consumo * valorM3;
        double subtotal = custoAgua + tarifaFixa;
        double tarifaEsgoto = subtotal * (percentualEsgoto / 100);
        double total = subtotal + tarifaEsgoto;

        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.printf("Total a pagar: R$ %.2f%n", total);

        scanner.close();
    }
}
