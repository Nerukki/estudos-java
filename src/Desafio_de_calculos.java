public class Desafio_de_calculos {

    public static void main (String[] args) {
//desafios alura
//desafio 1
        double notaUm = 4.9;
        double notaDois = 7.45;
        double mediaNotas = (notaUm + notaDois) / 2;
        System.out.println(mediaNotas);

//desafio 2

        double variavelDouble = 5.6543;
        int variavelInt = (int) variavelDouble;
        System.out.println(variavelInt);

//desafio 3

        char letra = 'a';
        String palavras = "abacaxi começa com";
        System.out.println(palavras + " " + letra);

//desafio 4

        double precoProduto = 32.99;
        int quantidade = 3;
        double precoTotal = (precoProduto * quantidade);
        System.out.println("o preço total em R$ sera: " + precoTotal);

//desafio 5

        double valorEmDolares = 30;
        double valorParaConverter = 4.94;
        double valorEmReais = (valorEmDolares * valorParaConverter);
        String mensagemDeConversao = (String.format("o valor de %.2f dolares em reais é: %.2f", valorEmDolares, valorEmReais));
        System.out.println(mensagemDeConversao);

//desafio 6

        double precoOriginal = 59.99;
        double percentualDesconto = 10;
        double precoComDesconto = precoOriginal - ((precoOriginal / 100) * percentualDesconto );
        System.out.println (String.format("o preco com desconto é de: %.2f ",  precoComDesconto));
    }
}
