import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> saltos = new ArrayList<>();

        System.out.print("Digite o nome do atleta (ou 'FIM' para encerrar): ");
        String nomeAtleta = scanner.nextLine();

        while (!nomeAtleta.equalsIgnoreCase("FIM")) {
            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite o " + getOrdinal(i) + " salto: ");
                double salto = scanner.nextDouble();
                saltos.add(salto);
            }

            Collections.sort(saltos);
            double melhorSalto = saltos.get(4);
            double piorSalto = saltos.get(0);
            double somaDemaisSaltos = saltos.get(1) + saltos.get(2) + saltos.get(3);
            double mediaDemaisSaltos = somaDemaisSaltos / 3.0;

            System.out.println("\nMelhor salto: " + melhorSalto + " m");
            System.out.println("Pior salto: " + piorSalto + " m");
            System.out.println("Média dos demais saltos: " + mediaDemaisSaltos + " m\n");

            saltos.clear(); // Limpa a lista para o próximo atleta

            System.out.print("Digite o nome do próximo atleta (ou 'FIM' para encerrar): ");
            scanner.nextLine(); // Limpa o buffer do scanner
            nomeAtleta = scanner.nextLine();
        }

        scanner.close();
    }

    public static String getOrdinal(int number) {
        String[] ordinais = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto"};
        return ordinais[number - 1];
    }
}
