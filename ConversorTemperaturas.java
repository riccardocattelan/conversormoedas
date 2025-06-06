import java.util.Scanner;

class ConversorTemperaturas {
    public static void executar(Scanner scanner) {

        System.out.println("Escolha o tipo da temperatura:");
        System.out.println("1 - Celsius");
        System.out.println("2 - Fahrenheit");
        System.out.println("3 - Kelvin");
        System.out.print("Digite um número inteiro: ");
        int menu = scanner.nextInt();

        if (menu == 1) {
            System.out.println("Para qual temperatura quer converter?");
            System.out.println("1 - Fahrenheit");
            System.out.println("2 - Kelvin");
            System.out.print("Digite um número inteiro: ");
            int escolha = scanner.nextInt();

            System.out.print("Informe o grau em Celsius: ");
            int C = scanner.nextInt();

            if (escolha == 1) {
                double F = C * 1.8 + 32;
                System.out.println("De " + C + "°C para " + F + "°F");
            } else if (escolha == 2) {
                double K = C + 273.15;
                System.out.println("De " + C + "°C para " + K + "K");
            } else {
                System.out.println("Valor inválido!");
            }
        } else if (menu == 2) {
            System.out.println("Para qual temperatura quer converter?");
            System.out.println("1 - Celsius");
            System.out.println("2 - Kelvin");
            System.out.print("Digite um número inteiro: ");
            int escolha = scanner.nextInt();

            System.out.print("Informe o grau em Fahrenheit: ");
            int F = scanner.nextInt();

            if (escolha == 1) {
                double C = (F - 32) / 1.8;
                System.out.println("De " + F + "°F para " + C + "°C");
            } else if (escolha == 2) {
                double K = (F - 32) * 5 / 9 + 273.15;
                System.out.println("De " + F + "°F para " + K + "K");
            } else {
                System.out.println("Valor inválido!");
            }
        } else if (menu == 3) {
            System.out.println("Para qual temperatura quer converter?");
            System.out.println("1 - Celsius");
            System.out.println("2 - Fahrenheit");
            System.out.print("Digite um número inteiro: ");
            int escolha = scanner.nextInt();

            System.out.print("Informe o grau em Kelvin: ");
            int K = scanner.nextInt();

            if (escolha == 1) {
                double C = K - 273.15;
                System.out.println("De " + K + "K para " + C + "°C");
            } else if (escolha == 2) {
                double F = (K - 273.15) * 1.8 + 32;
                System.out.println("De " + K + "K para " + F + "°F");
            } else {
                System.out.println("Valor inválido!");
            }
        } else {
            System.out.println("Opção inválida!");
        }

    }
}