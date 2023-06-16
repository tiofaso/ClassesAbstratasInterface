package exercicio01loja;

abstract class Estoque {
    String nome;
    double preco;
    String autor;
    double duracao;
    int faixas;

    abstract void mostrarDetalhesDoItem();
}
