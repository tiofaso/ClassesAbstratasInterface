package exercicio01lampada;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        System.out.println("Você está entrando no quarto. Tá sem lâmpada no bocal.\n");

        Scanner entrada = new Scanner(System.in);

        int tipoLampada = 0;

        while(tipoLampada == 0){
            System.out.println("Qual lâmpada você deseja colocar?");
            System.out.println("1 - Lâmpada incandescente \n2 - Lâmpada fluorescenmte");

            tipoLampada = entrada.nextInt();

           if(tipoLampada != 1 && tipoLampada != 2){tipoLampada = 0;}
        }

        FabricaLampada minhaLampada = new FabricaLampada();

        minhaLampada.construir(tipoLampada);
    }// fim main
}
