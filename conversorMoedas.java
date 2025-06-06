import java.util.Scanner;

class conversorMoedas {
    public void executar(Scanner scanner) {

        //será pego a moeda inicial, a quantidade e a moeda que deseja obter na conversão
        System.out.println("Digite com acentos, quando for necessário");
        System.out.printf("Escolha a opção da moeda que você possui: %n 1 - real %n 2 - dólar %n 3 - euro %n 4 - libra: %n");
        int moedaatual = scanner.nextInt();
        System.out.println("Quantos valor você possui: ");
        float qtd_moedaatual = scanner.nextInt();
        System.out.printf("Escolha a opção da moeda que você possui: %n 1 - real %n 2 - dólar %n 3 - euro %n 4 - libra: %n");
        int moedaconversao = scanner.nextInt();

        //Avisos para melhor utilização por parte do usuário
        System.out.println("A conversão pode ter uma pequena variação devido a precisão das conversões e a flutuação das cotações das moedas");

        //cria um objeto conversor da classe Conversor
        ConversorMo conversor = new ConversorMo(moedaatual, moedaconversao, qtd_moedaatual);
        conversor.verificador();


    }
}