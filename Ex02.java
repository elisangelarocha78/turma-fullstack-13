import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int volumeDia;
        int total = 0;

        // Laço para os 5 dias
        for (int dia = 1; dia <= 5; dia++) {
            System.out.print("Digite o volume de água bombeada no dia " + dia + " (em litros): ");
            volumeDia = scanner.nextInt();

            total += volumeDia; // soma ao total
        }

        // Resultado final
        System.out.println("\nVolume total distribuído no período: " + total + " litros");

        scanner.close();
    }
}

