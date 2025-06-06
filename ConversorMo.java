//classe Conversor, aqui terá os atributos e métodos usados
class ConversorMo {
    //atributos usados para executar as conversões
    public int moedaatual;
    public int moedaconversao;
    public float qtd_moedaatual;

    //será pego as variáveis para serem usadas dentro da classe Conversor
    public ConversorMo(int moedaatual, int moedaconversao, float qtd_moedaatual) {
        this.moedaatual = moedaatual;
        this.moedaconversao = moedaconversao;
        this.qtd_moedaatual = qtd_moedaatual;
    }



    //metodo que irá verificar qual tipo de conversão será feita, os 3 primeiros são filtros para possíveis erros
    public void verificador() {
        if (moedaatual==moedaconversao) {
            System.out.println(moedaatual);
            System.out.println("Você tentou converter uma moeda para a mesma moeda.");
        } else if (moedaatual!=1 && moedaatual!=2 && moedaatual!=3 && moedaatual!=4) {
            System.out.println("A moeda inicial que você possui não faz parte da lista de moedas disponíveis, as disponíveis são real, dólar, euro e libra.");
            System.out.println("Verifique se digitou corretamente.");
        } else if (moedaconversao!=1 && moedaconversao!=2 && moedaconversao!=3 && moedaconversao!=4) {
            System.out.println("A moeda final que você deseja saber a conversão não faz parte da lista de moedas disponíveis, as disponíveis são real, dólar, euro e libra.");
            System.out.println("Verifique se digitou corretamente.");
        } else if (moedaatual==1) {
            conversorreal();
        } else if (moedaatual==2) {
            conversordolar();
        } else if (moedaatual==3) {
            conversoreuro();
        } else if (moedaatual==4) {
            conversorlibra();
        }
    }

    //metodo será executado se a moeda inicial for real brasileiro
    private void conversorreal() {
        if (moedaconversao==2) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.18 + " dólares");
        } else if (moedaconversao==3) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.16 + " euros");
        } else if (moedaconversao==4) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.13 + " libras");
        }
    }

    //metodo será executado se a moeda inicial for dolar
    private void conversordolar() {
        if (moedaconversao==1) {
            System.out.println("Você possui: " + qtd_moedaatual * 5.65 + " reais");
        } else if (moedaconversao==3) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.88 + " euros");
        } else if (moedaconversao==4) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.74 + " libras");
        }
    }

    //metodo será executado se a moeda inicial for euro
    private void conversoreuro() {
        if (moedaconversao==1) {
            System.out.println("Você possui: " + qtd_moedaatual * 6.44 + " reais");
        } else if (moedaconversao==2) {
            System.out.println("Você possui: " + qtd_moedaatual * 1.14 + " dólares");
        } else if (moedaconversao==4) {
            System.out.println("Você possui: " + qtd_moedaatual * 0.84 + " libras");
        }
    }

    //metodo será executado se a moeda inicial for libra
    private void conversorlibra() {
        if (moedaconversao==1) {
            System.out.println("Você possui: " + qtd_moedaatual * 7.63 + " reais");
        } else if (moedaconversao==2) {
            System.out.println("Você possui: " + qtd_moedaatual * 1.35 + " dólares");
        } else if (moedaconversao==3) {
            System.out.println("Você possui: " + qtd_moedaatual * 1.19 + " euros");
        }
    }
}