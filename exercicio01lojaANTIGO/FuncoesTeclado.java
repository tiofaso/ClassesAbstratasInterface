package exercicio01lojaANTIGO;

import java.util.Scanner;

public class FuncoesTeclado{
    int conteudoDigitadoInt;
    String conteudoDigitadoString;
    double conteudoDigitadoDouble;
    String conteudoMensagem;
    public int leituraTecladoInt(String mensagem){//Lê instruções tipo int via teclado
        Scanner entrada = new Scanner(System.in);
        this.conteudoMensagem = mensagem;
        System.out.println(this.conteudoMensagem);

        this.conteudoDigitadoInt = entrada.nextInt();

        return(this.conteudoDigitadoInt);
    }

    public double leituraTecladoDouble(String mensagem){//Lê instruções tipo double via teclado
        Scanner entrada = new Scanner(System.in);
        this.conteudoMensagem = mensagem;
        System.out.println(this.conteudoMensagem);

        this.conteudoDigitadoDouble = entrada.nextDouble();

        return(this.conteudoDigitadoDouble);
    }

    public String leituraTecladoString(String mensagem){//Lê instruções tipo string via teclado
        Scanner entrada = new Scanner(System.in);
        this.conteudoMensagem = mensagem;
        System.out.println(this.conteudoMensagem);

        this.conteudoDigitadoString = entrada.nextLine();

        return(this.conteudoDigitadoString);
    }
}
