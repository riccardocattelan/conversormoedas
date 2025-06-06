import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você quer converter moedas, comprimentos, massas ou temperaturas? ");
        String opcao = scanner.nextLine();
        if (opcao.equalsIgnoreCase("moedas")) {
            conversorMoedas moedas = new conversorMoedas();
            moedas.executar(scanner);
        } else if (opcao.equalsIgnoreCase("massas")) {
            conversorMassas massas = new conversorMassas();
            massas.executar(scanner);
        } else if (opcao.equalsIgnoreCase("temperaturas")) {
            ConversorTemperaturas temperaturas = new ConversorTemperaturas();
            temperaturas.executar(scanner);
        } else if (opcao.equalsIgnoreCase("comprimentos")) {
            ConversorComprimento comprimentos = new ConversorComprimento();
            comprimentos.executar(scanner);
        }



        scanner.close();

    }
}