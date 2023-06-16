package exercicio02RetanguloCirculoQuadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Vamos calcular áreas, perímetros e comprimentos de algumas formas?");
        System.out.println("Impotante: eu não vou responder na ordem que você vai escrever!!\n");

        double[] formas = {0.0,0.0,0.0,0.0,0.0};//setando o array

        Scanner entrada = new Scanner(System.in);

        //Retângulo
        System.out.println("Digite o comprimento do retângulo");
        formas[0] = entrada.nextDouble();

        System.out.println("Digite a altura do retângulo");
        formas[1] = entrada.nextDouble();

        //Quadrado
        System.out.println("digite o lado do quadrado");
        formas[2] = entrada.nextDouble();
        formas[3] = formas[2];

        //Circulo
        System.out.println("Digite um raio para o círculo");
        formas[4] = entrada.nextDouble();

        double[] formasaleatorias = {0.0,0.0,0.0,0.0,0.0};

        //Gerando índice aleatório inicial
        int min = 0;
        int max = 4;
        int indiceAleatorio = (int)(Math.random()*(max-min+1)+min);

        int contadorForma = 0; //flag para percorrer o array original

        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();

        while(contadorForma < 5){//prenchendo o vetor de forma aleatória
            indiceAleatorio = (int)(Math.random()*(max-min+1)+min);

            if(formasaleatorias[indiceAleatorio] == 0.0){
                formasaleatorias[indiceAleatorio] = formas[contadorForma];
                contadorForma++;
            }
        }//fim while

        //exibindo as informações de forma aleatrória

        contadorForma = 0;

        while(contadorForma < 5){
            indiceAleatorio = (int)(Math.random()*(max-min+1)+min);
            if(formasaleatorias[indiceAleatorio] == formas[contadorForma]){
                switch (contadorForma){
                    case 0: //comprimento retângulo
                        retangulo.base = formas[contadorForma];
                        break;
                    case 1: //altura retângulo
                        retangulo.altura = formas[contadorForma];
                        retangulo.calcularArea();
                        retangulo.calcularPerimetro();
                        break;
                    case 2: //lado quadrado
                        quadrado.lado = formas[contadorForma];
                        quadrado.calcularArea();
                        break;
                    case 3: //lado quadrado
                        quadrado.lado = formas[contadorForma];
                        quadrado.calcularPerimetro();
                        break;
                    case 4: //raio círculo
                        circulo.raio = formas[contadorForma];
                        circulo.calcularArea();
                        circulo.calcularPerimetro();
                        break;
                } //fim switch
                contadorForma++;
            }else{System.out.println("Caçando o dado...");}
        }//fim while

    }//fim main
}
