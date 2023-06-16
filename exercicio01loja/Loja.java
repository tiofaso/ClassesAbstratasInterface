package exercicio01loja;

import java.util.ArrayList;

public class Loja{
   public static void main(String[] args){
       ArrayList<String> produtos = new ArrayList<String>();

       Livro livro = new Livro();
       Cd cd1 = new Cd();
       Cd cd2 = new Cd();
       Cd cd3 = new Cd();
       Dvd dvd = new Dvd();

       //Livro
       livro.autor = "Pablo Rangel";
       livro.preco = 69.80;
       livro.nome = "Sistemas Orientados a Objetos";

       //DVD
       dvd.nome = "Constantine";
       dvd.preco = 15.90;
       dvd.duracao = 1.45;

       //CD
       cd1.nome = "Korn - Requiem";
       cd1.preco = 18.50;
       cd1.faixas = 9;

       //CD
       cd2.nome = "Coal Chamber - Rivals";
       cd2.preco = 38.90;
       cd2.faixas = 13;

       //CD
       cd3.nome = "Heartlay - Sovereign Sore";
       cd3.preco = 60.35;
       cd3.faixas = 11;

       produtos.add(livro.nome + " " + livro.autor + " " + livro.preco);
       produtos.add(dvd.nome + " " + dvd.duracao + " " + dvd.preco);
       produtos.add(cd1.nome + " " + cd1.faixas + " " + cd1.preco);
       produtos.add(cd2.nome + " " + cd2.faixas + " " + cd2.preco);
       produtos.add(cd3.nome + " " + cd3.faixas + " " + cd3.preco);

       livro.mostrarDetalhesDoItem();

       dvd.mostrarDetalhesDoItem();

       cd1.mostrarDetalhesDoItem();

       cd2.mostrarDetalhesDoItem();

       cd3.mostrarDetalhesDoItem();

       System.out.println(produtos);
   }
}
