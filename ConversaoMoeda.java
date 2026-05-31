import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor que deseja comprar em dólares (USD):");
        double valorDolares = scanner.nextDouble();

        System.out.println("Digite a cotação atual do dólar:");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite o percentual de spread do banco:");
        double taxaSpread = scanner.nextDouble();

        double valorSpread = cotacaoDolar * (taxaSpread / 100);
        double cotacaoAplicadaUSD = cotacaoDolar + valorSpread;
        double valorBRL = valorDolares * cotacaoAplicadaUSD;

        System.out.printf("Cotação aplicada BRL: R$ %.2f%n ", cotacaoAplicadaUSD);
        System.out.printf("Total BRL: R$ %.2f%n",valorBRL);

        scanner.close();

        //Questão 3 (Nível: Intermediário) - Conversão de Moeda

    }
}
