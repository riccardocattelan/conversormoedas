import java.util.Scanner;

class conversorMassas {
    public void executar(Scanner scanner) {
        ConversorMa conversor = new ConversorMa();
        int opcao;

        do {
            System.out.println("\n=== Conversor de Massa ===");
            System.out.println("Unidades disponíveis:");
            System.out.println("1 - Quilogramas (kg)");
            System.out.println("2 - Gramas (g)");
            System.out.println("3 - Libras (lb)");

            System.out.print("Digite a unidade de origem (1-kg, 2-g, 3-lb): ");
            int origem = scanner.nextInt();

            System.out.print("Digite a unidade de destino (1-kg, 2-g, 3-lb): ");
            int destino = scanner.nextInt();

            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            double resultado = conversor.converter(origem, destino, valor);

            if (resultado != -1) {
                System.out.println("Resultado da conversão: " + resultado);
            } else {
                System.out.println("Conversão não realizada devido a erro nas unidades.");
            }

            System.out.println("\nDeseja realizar outra conversão?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

        } while (opcao == 1);

        System.out.println("\nPrograma encerrado.");
    }

}