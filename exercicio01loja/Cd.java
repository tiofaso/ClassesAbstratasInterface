package exercicio01loja;

public class Cd extends Estoque {
    @Override
    void mostrarDetalhesDoItem() {
        System.out.println("> CD");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Faixas: " + this.faixas);
    }
}
