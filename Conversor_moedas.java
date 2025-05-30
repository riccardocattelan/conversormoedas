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

        //cria um objeto conversor da classe Conversor
        Conversor conversor = new Conversor(moedaatual, moedaconversao, qtd_moedaatual);
        conversor.verificador();

        scanner.close();
    }
}

//classe Conversor, aqui terá os atributos e métodos usados
class Conversor {
    //atributos usados para executar as conversões
    public String moedaatual;
    public String moedaconversao;
    public float qtd_moedaatual;

    //será pego as variáveis para serem usadas dentro da classe Conversor
    public Conversor(String moedaatual, String moedaconversao, float qtd_moedaatual) {
        this.moedaatual = moedaatual;
        this.moedaconversao = moedaconversao;
        this.qtd_moedaatual = qtd_moedaatual;
    }

    //metodo que irá verificar qual tipo de conversão será feita, os 3 primeiros são filtros para possíveis erros
    public void verificador() {
        if (moedaatual.equalsIgnoreCase(moedaconversao)) {
            System.out.println("Você tentou converter uma moeda para a mesma moeda. Você tem " + qtd_moedaatual + " " + moedaatual);
        } else if (!moedaatual.equalsIgnoreCase("real") && !moedaatual.equalsIgnoreCase("dolar") && !moedaatual.equalsIgnoreCase("euro") && !moedaatual.equalsIgnoreCase("libra")) {
            System.out.println("A moeda inicial que você possui não faz parte da lista de moedas disponíveis, as disponíveis são real, dólar, euro e libra.");
        } else if (!moedaconversao.equalsIgnoreCase("real") && !moedaconversao.equalsIgnoreCase("dolar") && !moedaconversao.equalsIgnoreCase("euro") && !moedaconversao.equalsIgnoreCase("libra")) {
            System.out.println("A moeda final que você deseja saber a conversão não faz parte da lista de moedas disponíveis, as disponíveis são real, dólar, euro e libra.");
        } else if (moedaatual.equalsIgnoreCase("real")) {
            conversorreal();
        } else if (moedaatual.equalsIgnoreCase("dolar")) {
            conversordolar();
        } else if (moedaatual.equalsIgnoreCase("euro")) {
            conversoreuro();
        } else if (moedaatual.equalsIgnoreCase("libra")) {
            conversorlibra();
        }
    }

    //metodo será executado se a moeda inicial for real brasileiro
    private void conversorreal() {
        if (moedaconversao.equalsIgnoreCase("dolar")) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.18 + " dólares");
        } else if (moedaconversao.equalsIgnoreCase("euro")) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.16 + " euros");
        } else if (moedaconversao.equalsIgnoreCase("libra")) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.13 + " libras");
        }
    }

    //metodo será executado se a moeda inicial for dolar
    private void conversordolar() {
        if (moedaconversao.equalsIgnoreCase("real")) {
            System.out.println("Você possui: " + qtd_moedaatual * 5.65 + " reais");
        } else if (moedaconversao.equalsIgnoreCase("euro")) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.88 + " euros");
        } else if (moedaconversao.equalsIgnoreCase("libra")) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.74 + " libras");
        }
    }

    //metodo será executado se a moeda inicial for euro
    private void conversoreuro() {
        if (moedaconversao.equalsIgnoreCase("real")) {
            System.out.println("Você possui: " + qtd_moedaatual * 6.44 + " reais");
        } else if (moedaconversao.equalsIgnoreCase("dolar")) {
            System.out.println("Você possui: " + qtd_moedaatual * 1.14 + " dólares");
        } else if (moedaconversao.equalsIgnoreCase("libra")) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.84 + " libras");
        }
    }

    //metodo será executado se a moeda inicial for libra
    private void conversorlibra() {
        if (moedaconversao.equalsIgnoreCase("real")) {
            System.out.println("Você possui: " + qtd_moedaatual * 7.63 + " reais");
        } else if (moedaconversao.equalsIgnoreCase("dolar")) {
            System.out.println("Você possui: " + qtd_moedaatual * 1.35 + " dólares");
        } else if (moedaconversao.equalsIgnoreCase("euro")) {
            System.out.println("Você possui: " + qtd_moedaatual * 1.19 + " euros");
        }
    }
}
