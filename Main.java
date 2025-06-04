import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vôce quer converter moeda ou comprimento? ");
        String opcao = scanner.nextLine();
        if (opcao.equalsIgnoreCase("moeda")) {
            conversorMoedas moedas = new conversorMoedas();
            moedas.executar(scanner);
        } else if (opcao.equalsIgnoreCase("comprimento")) {
            conversorComprimentos comprimentos = new conversorComprimentos();
            comprimentos.executar(scanner);
        }




        scanner.close();

    }
}