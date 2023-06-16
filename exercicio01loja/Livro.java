package exercicio01loja;

public class Livro extends Estoque {
    @Override
    void mostrarDetalhesDoItem() {
        System.out.println("> LIVRO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Autor: " + this.autor);

    }
}
