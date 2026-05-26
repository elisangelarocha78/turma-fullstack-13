import java.util.Scanner;

public class CompraBolo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados
        System.out.print("Digite o preço da fatia de bolo: R$ ");
        double precoBolo = scanner.nextDouble();

        System.out.print("Digite o valor disponível: R$ ");
        double dinheiro = scanner.nextDouble();

        // Verificação
        if (dinheiro >= precoBolo) {
            System.out.println("Compra aprovada! Pode saborear o doce.");
        } else {
            double falta = precoBolo - dinheiro;
            System.out.printf("Saldo insuficiente. Faltam R$ %.2f%n", falta);
        }

        scanner.close();
    }
}

