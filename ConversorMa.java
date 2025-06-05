public class ConversorMa {

    public double converter(int origem, int destino, double valor) {
        double emQuilos;

        // Converter a unidade de origem para quilogramas
        switch (origem) {
            case 1: // Quilogramas
                emQuilos = valor;
                break;
            case 2: // Gramas
                emQuilos = valor / 1000;
                break;
            case 3: // Libras
                emQuilos = valor * 0.453592;
                break;
            default:
                System.out.println("Unidade de origem inválida.");
                return -1;
        }

        // Converter de quilogramas para a unidade de destino
        switch (destino) {
            case 1: // Quilogramas
                return emQuilos;
            case 2: // Gramas
                return emQuilos * 1000;
            case 3: // Libras
                return emQuilos / 0.453592;
            default:
                System.out.println("Unidade de destino inválida.");
                return -1;
        }
    }
}