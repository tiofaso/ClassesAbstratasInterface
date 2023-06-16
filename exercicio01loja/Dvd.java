package exercicio01loja;

public class Dvd extends Estoque {
    @Override
    void mostrarDetalhesDoItem() {
        System.out.println("> DVD");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Duração: " + this.duracao);
    }
}
