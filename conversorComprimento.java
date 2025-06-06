import java.util.Scanner;

class ConversorComprimento {
    public static void executar(Scanner scanner) {

        System.out.println("Escolha uma unidade:");
        System.out.println("1 - Metros ");
        System.out.println("2 - Centímetros ");
        System.out.println("3 - Milímetros ");
        System.out.println("4 - Polegadas (in)");
        System.out.println("5 - Pés (ft)");
        System.out.print("Digite uma opção: ");
        int unidade_Origem = scanner.nextInt();

        System.out.print("Digite o valor para ser convertido: ");
        double valor = scanner.nextDouble();

        System.out.println("Qual unidade deseja converter?");
        System.out.println("1 - Metros ");
        System.out.println("2 - Centímetros ");
        System.out.println("3 - Milímetros ");
        System.out.println("4 - Polegadas (in)");
        System.out.println("5 - Pés (ft)");
        System.out.print("Digite uma opção: ");
        int unidade_Destino = scanner.nextInt();

        double valorMetros = 0;

        if (unidade_Origem == 1) {
            valorMetros = valor;
        } else if (unidade_Origem == 2) {
            valorMetros = valor / 100;
        } else if (unidade_Origem == 3) {
            valorMetros = valor / 1000;
        } else if (unidade_Origem == 4) {
            valorMetros = valor * 0.0254;
        } else if (unidade_Origem == 5) {
            valorMetros = valor * 0.3048;
        } else {
            System.out.println("Valor inválido");
            return;
        }

        double resultado = 0;

        if (unidade_Destino == 1) {
            resultado = valorMetros;
        } else if (unidade_Destino == 2) {
            resultado = valorMetros * 100;
        } else if (unidade_Destino == 3) {
            resultado = valorMetros * 1000;
        } else if (unidade_Destino == 4) {
            resultado = valorMetros / 0.0254;
        } else if (unidade_Destino == 5) {
            resultado = valorMetros / 0.3048;
        } else {
            System.out.println("Valor inválido");
            return;
        }

        System.out.println("Resultado da conversão: " + resultado);

    }
}
