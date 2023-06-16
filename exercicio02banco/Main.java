package exercicio02banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Digite um valor abaixo para saber os tributos:");

        Scanner entrada = new Scanner(System.in);

        double valorDinheiro = entrada.nextDouble();

        OperacaoBanco imposto = new OperacaoBanco();

        System.out.println("Para R$" + valorDinheiro + " temos:");
        System.out.println("> POUPANÇA");
        System.out.println("Na poupança você vai pagar R$" + imposto.ContaPoupanca(valorDinheiro) +  " de imposto\n");
        System.out.println("> CONTA CORRENTE");
        System.out.println("Na poupança você vai pagar R$" + imposto.ContaCorrente(valorDinheiro) + " de imposto\n");
        System.out.println("SEGURO DE VIDA");
        System.out.println("Na poupança você vai pagar R$" + imposto.SeguroDeVida(valorDinheiro) + " de taxa fixa");
    }
}
