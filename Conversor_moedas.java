import java.util.Scanner;

public class Conversor_moedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //será pego a moeda inicial, a quantidadde e a moeda que deseja obter na conversão
        System.out.println("Digite a moeda que você possui; entre real, dólar, euro e libra: ");
        String moedaatual = scanner.nextLine();
        System.out.println("Quantos " + moedaatual + " você possui: ");
        float qtd_moedaatual = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Digite a moeda que você deseja; entre real, dólar, euro e libra: ");
        String moedaconversao = scanner.nextLine();

        //Avisos para melhor utilização por parte do usuário
        System.out.println("A conversão pode ter uma pequena variação devido a precisão das conversões e a flutuação das cotações das moedas");
        System.out.println("Digite sem acentos");

        //será executado um IF de acordo com a moeda inicial, e quando encontrado, será chamado um módulo que fará a conversão. Os três primeiros IF são caso houver algum erro por parte do usuário.
        if (moedaatual.equalsIgnoreCase(moedaconversao)) {
            System.out.println("Você tentou converter uma moeda para a mesma moeda. Você tem " + qtd_moedaatual + moedaatual);
        } else if (!moedaatual.equalsIgnoreCase("real") && !moedaatual.equalsIgnoreCase("dolar") && !moedaatual.equalsIgnoreCase("euro") && !moedaatual.equalsIgnoreCase("libra")){
            System.out.println("A moeda inicial que você possui não faz parte da lista de moedas disponíveis, as disponíveis são real, dólar, euro e libra.");
        } else if (!moedaconversao.equalsIgnoreCase("real") && !moedaconversao.equalsIgnoreCase("dolar") && !moedaconversao.equalsIgnoreCase("euro") && !moedaconversao.equalsIgnoreCase("libra")){
            System.out.println("A moeda final que você deseja saber a conversão não faz parte da lista de moedas disponíveis, as disponíveis são real, dólar, euro e libra.");
        } else if (moedaatual.equalsIgnoreCase("real")) {
            conversorreal(qtd_moedaatual, moedaatual, moedaconversao);
        } else if (moedaatual.equalsIgnoreCase("dolar")) {
            conversordolar(qtd_moedaatual, moedaatual, moedaconversao);
        } else if (moedaatual.equalsIgnoreCase("euro")) {
            conversoreuro(qtd_moedaatual, moedaatual, moedaconversao);
        } else if (moedaatual.equalsIgnoreCase("libra")) {
            conversorlibra(qtd_moedaatual, moedaatual, moedaconversao);
        }
        scanner.close();
    }

    //módulo será executado se a moeda inicial for real brasileiro
    public static void conversorreal(float qtd_moedaatual, String moedaatual, String moedaconversao) {
        if (moedaatual.equalsIgnoreCase("real") && moedaconversao.equalsIgnoreCase("dolar")) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.18 + " dólares");
        } else if (moedaatual.equalsIgnoreCase("real") && moedaconversao.equalsIgnoreCase("euro")) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.16 + " euros");
        } else if (moedaatual.equalsIgnoreCase("real") && moedaconversao.equalsIgnoreCase("libra")) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.13 + " libras");
        }
    }

    //módulo será executado se a moeda inicial for dolar
    public static void conversordolar(float qtd_moedaatual, String moedaatual, String moedaconversao){
        if (moedaatual.equalsIgnoreCase("dolar") && moedaconversao.equalsIgnoreCase("real")) {
            System.out.println("Você possui: " + qtd_moedaatual * 5.65 + " reais");
        } else if (moedaatual.equalsIgnoreCase("dolar") && moedaconversao.equalsIgnoreCase("euro")) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.88 + " euros");
        } else if (moedaatual.equalsIgnoreCase("dolar") && moedaconversao.equalsIgnoreCase("libra")) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.74 + " libras");
        }
    }

    //módulo será executado se a moeda inicial for euro
    public static void conversoreuro(float qtd_moedaatual, String moedaatual, String moedaconversao) {
        if (moedaatual.equalsIgnoreCase("euro") && moedaconversao.equalsIgnoreCase("real")){
            System.out.println("Você possui: " + qtd_moedaatual*6.44 + " reais");
        } else if (moedaatual.equalsIgnoreCase("euro") && moedaconversao.equalsIgnoreCase("dolar")){
            System.out.println("Você possui: " + qtd_moedaatual*1.14 + " dólares");
        } else if (moedaatual.equalsIgnoreCase("euro") && moedaconversao.equalsIgnoreCase("libra")) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.84 + " libras");
        }
    }

    //módulo será executado se a moeda inicial for libra
    public static void conversorlibra(float qtd_moedaatual, String moedaatual, String moedaconversao) {
        if (moedaatual.equalsIgnoreCase("libra") && moedaconversao.equalsIgnoreCase("real")){
            System.out.println("Você possui: " + qtd_moedaatual*7.63 + " reais");
        } else if (moedaatual.equalsIgnoreCase("libra") && moedaconversao.equalsIgnoreCase("dolar")){
            System.out.println("Você possui: " + qtd_moedaatual*1.35 + " dólares");
        } else if (moedaatual.equalsIgnoreCase("libra") && moedaconversao.equalsIgnoreCase("euro")){
            System.out.println("Você possui: " + qtd_moedaatual*1.19 + " euros");
        }
    }


}