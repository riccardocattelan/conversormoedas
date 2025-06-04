import java.util.Scanner;

class conversorComprimentos {
    public void executar(Scanner scanner) {

        //será pego o comprimento inicial, o valor e a unidade de comprimento que deseja obter na conversão
        System.out.println("Digite com acentos, quando for necessário");
        System.out.println("Digite a unidade de comprimento que você possui; entre metros, centímetros, milímetros, polegadas e pés: ");
        String comprimentoatual = scanner.nextLine();
        System.out.println("Qual valor: ");
        float qtd_valoratual = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Digite a unidade de comprimento que você deseja; entre metros, centímetros, milímetros, polegadas e pés: ");
        String comprimentoconversao = scanner.nextLine();

        //Avisos para melhor utilização por parte do usuário
        System.out.println("A conversão pode ter uma pequena variação de precisão");
        System.out.println("Digite sem acentos");

        //cria um objeto conversor da classe Conversor
        ConversorC conversor = new ConversorC(comprimentoatual, comprimentoconversao, qtd_valoratual);
        conversor.verificador();

    }
}