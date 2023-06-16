package exercicio01lojaANTIGO;

import java.util.ArrayList;

public class FuncoesCadastro extends FuncoesTeclado{
    ArrayList<String> produtoEstoque = new ArrayList<String>();

    public void mostraEstoque(){//Cria estoque dinâmico de produtos
        if(produtoEstoque.size() != 0){System.out.println(produtoEstoque);}
        else if(produtoEstoque.size() == 0){System.out.println("\n- Estoque de produtos vazio -\n");}
    }

    //public void cadastraEstoque

}
