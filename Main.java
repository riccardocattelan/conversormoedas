import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vôce quer converter moedas, comprimentos ou massas? ");
        String opcao = scanner.nextLine();
        if (opcao.equalsIgnoreCase("moedas")) {
            conversorMoedas moedas = new conversorMoedas();
            moedas.executar(scanner);
        } else if (opcao.equalsIgnoreCase("comprimentos")) {
            conversorComprimentos comprimentos = new conversorComprimentos();
            comprimentos.executar(scanner);
        } else if (opcao.equalsIgnoreCase("massas")) {
            conversorMassas massas = new conversorMassas();
            massas.executar(scanner);
        }



        scanner.close();

    }
}