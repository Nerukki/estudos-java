public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme novo");
        } else{
            System.out.println("Filme antigo");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        }else {
            System.out.println("Deve pagar a locação");}


        if (notaDoFilme > 7.5) {
            System.out.println("Filme com nota acima da média");
        }
    }
}
