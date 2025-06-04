import java.util.Scanner;

class conversorMoedas {
    public void executar(Scanner scanner) {

        //será pego a moeda inicial, a quantidade e a moeda que deseja obter na conversão
        System.out.println("Digite com acentos, quando for necessário");
        System.out.println("Digite a moeda que você possui; entre real, dólar, euro e libra: ");
        String moedaatual = scanner.nextLine();
        System.out.println("Quantos " + moedaatual + " você possui: ");
        float qtd_moedaatual = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Digite a moeda que você deseja; entre real, dólar, euro e libra: ");
        String moedaconversao = scanner.nextLine();

        //Avisos para melhor utilização por parte do usuário
        System.out.println("A conversão pode ter uma pequena variação devido a precisão das conversões e a flutuação das cotações das moedas");

        //cria um objeto conversor da classe Conversor
        Conversor conversor = new Conversor(moedaatual, moedaconversao, qtd_moedaatual);
        conversor.verificador();

    }
}