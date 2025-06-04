//classe Conversor, aqui terá os atributos e métodos usados
class ConversorC {
    //atributos usados para executar as conversões
    public String comprimentoatual;
    public String comprimentoconversao;
    public float qtd_valoratual;

    //será pego as variáveis para serem usadas dentro da classe Conversor
    public ConversorC(String comprimentoatual, String comprimentoconversao, float qtd_valoratual) {
        this.comprimentoatual = comprimentoatual;
        this.comprimentoconversao = comprimentoconversao;
        this.qtd_valoratual = qtd_valoratual;
    }

    //metodo que irá verificar qual tipo de conversão será feita, os 3 primeiros são filtros para possíveis erros
    public void verificador() {
        if (comprimentoatual.equalsIgnoreCase(comprimentoconversao)) {
            System.out.println("Você tentou converter de um comprimento para o mesmo comprimento. Você tem " + qtd_valoratual + " " + comprimentoatual);
        } else if (!comprimentoatual.equalsIgnoreCase("metros") && !comprimentoatual.equalsIgnoreCase("centímetros") && !comprimentoatual.equalsIgnoreCase("milímetros") && !comprimentoatual.equalsIgnoreCase("polegadas") && !comprimentoatual.equalsIgnoreCase("pés")) {
            System.out.println("A unidade de comprimento que você possui não faz parte da lista das disponíveis; podem ser entre metros, centímetros, milímetros, polegadas e pés");
            System.out.println("Verifique se digitou corretamente.");
        } else if (!comprimentoconversao.equalsIgnoreCase("metros") && !comprimentoconversao.equalsIgnoreCase("centímetros") && !comprimentoconversao.equalsIgnoreCase("milímetros") && !comprimentoconversao.equalsIgnoreCase("polegadas") && !comprimentoconversao.equalsIgnoreCase("pés")) {
            System.out.println("A unidade de comprimento que você deseja não faz parte da lista das disponíveis; podem ser entre metros, centímetros, milímetros, polegadas e pés");
            System.out.println("Verifique se digitou corretamente.");
        } else if (comprimentoatual.equalsIgnoreCase("metros")) {
            conversormetro();
        } else if (comprimentoatual.equalsIgnoreCase("centímetros")) {
            conversorcm();
        } else if (comprimentoatual.equalsIgnoreCase("milímetros")) {
            conversormm();
        } else if (comprimentoatual.equalsIgnoreCase("polegadas")) {
            conversorpl();
        } else if (comprimentoatual.equalsIgnoreCase("pés")) {
            conversorpes();
        }
    }

    //metodo será executado se a unidade de comprimento for metro
    private void conversormetro() {
        if (comprimentoconversao.equalsIgnoreCase("centímetros")) {
            System.out.println("Você possui: " + qtd_valoratual * 100 + " centímetros");
        } else if (comprimentoconversao.equalsIgnoreCase("milímetros")) {
            System.out.println("Você possui: " + qtd_valoratual * 1000 + " milímetros");
        } else if (comprimentoconversao.equalsIgnoreCase("polegadas")) {
            System.out.println("Você possui: " + qtd_valoratual * 39.37 + " polegadas");
        } else if (comprimentoconversao.equalsIgnoreCase("pés")) {
            System.out.println("Você possui: " + qtd_valoratual * 3.281 + " pés");
        }
    }

    //metodo será executado se a unidade de comprimento for centimetro
    private void conversorcm() {
        if (comprimentoconversao.equalsIgnoreCase("metros")) {
            System.out.println("Você possui: " + qtd_valoratual / 100 + " metros");
        } else if (comprimentoconversao.equalsIgnoreCase("milímetros")) {
            System.out.println("Você possui: " + qtd_valoratual * 10 + " milímetros");
        } else if (comprimentoconversao.equalsIgnoreCase("polegadas")) {
            System.out.println("Você possui: " + qtd_valoratual * 2.54 + " polegadas");
        } else if (comprimentoconversao.equalsIgnoreCase("pés")) {
            System.out.println("Você possui: " + qtd_valoratual * 30.48 + " pés");
        }
    }

    //metodo será executado se a unidade de comprimento for milimetro
    private void conversormm() {
        if (comprimentoconversao.equalsIgnoreCase("centímetros")) {
            System.out.println("Você possui: " + qtd_valoratual / 10 + " centímetros");
        } else if (comprimentoconversao.equalsIgnoreCase("metros")) {
            System.out.println("Você possui: " + qtd_valoratual /1000 + " metros");
        } else if (comprimentoconversao.equalsIgnoreCase("polegadas")) {
            System.out.println("Você possui: " + qtd_valoratual / 25.4 + " polegadas");
        } else if (comprimentoconversao.equalsIgnoreCase("pés")) {
            System.out.println("Você possui: " + qtd_valoratual / 304.8 + " pés");
        }
    }

    //metodo será executado se a unidade de comprimento for polegada
    private void conversorpl() {
        if (comprimentoconversao.equalsIgnoreCase("centímetros")) {
            System.out.println("Você possui: " + qtd_valoratual * 2.54 + " centímetros");
        } else if (comprimentoconversao.equalsIgnoreCase("milímetros")) {
            System.out.println("Você possui: " + qtd_valoratual * 25.4 + " milímetros");
        } else if (comprimentoconversao.equalsIgnoreCase("metros")) {
            System.out.println("Você possui: " + qtd_valoratual / 39.37 + " metros");
        } else if (comprimentoconversao.equalsIgnoreCase("pés")) {
            System.out.println("Você possui: " + qtd_valoratual / 12 + " pés");
        }
    }

    //metodo será executado se a unidade de comprimento for pés
    private void conversorpes() {
        if (comprimentoconversao.equalsIgnoreCase("centímetros")) {
            System.out.println("Você possui: " + qtd_valoratual * 30.48 + " centímetros");
        } else if (comprimentoconversao.equalsIgnoreCase("milímetros")) {
            System.out.println("Você possui: " + qtd_valoratual * 304.8 + " milímetros");
        } else if (comprimentoconversao.equalsIgnoreCase("polegadas")) {
            System.out.println("Você possui: " + qtd_valoratual * 12 + " polegadas");
        } else if (comprimentoconversao.equalsIgnoreCase("metros")) {
            System.out.println("Você possui: " + qtd_valoratual / 3.281 + " metros");
        }
    }
}