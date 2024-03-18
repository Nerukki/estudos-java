public class Conversao_Celsio_Fahrenheit {
    public static void main(String[] args) {

        double celciusTemp = 23.0;
        double convertidoFahrenheitTemp = (celciusTemp * 1.8) + 32;
        String mensagem = String.format("o valor de %f celcius em fahrenheit é: %f", celciusTemp, convertidoFahrenheitTemp);
        System.out.println(mensagem);

        int convertidoInteiroFahrenheit = (int) convertidoFahrenheitTemp;
        System.out.println("o valor de fahrenheit inteiro é: " + convertidoInteiroFahrenheit);
    }
}

//(temperatura * 1.8) + 32
