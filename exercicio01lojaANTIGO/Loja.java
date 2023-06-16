package exercicio01lojaANTIGO;

public class Loja {
    public static void main(String[] args){
        System.out.println("+------------------------+");
        System.out.println("| Seja bem-vinde a Vnac! |");
        System.out.println("+------------------------+");

        FuncoesTeclado tecladoInt = new FuncoesTeclado();
        FuncoesCadastro carrinhoProdutos = new FuncoesCadastro();

        int tecladoDigitado = 3; //Flag para forçar o while a entrar na opção de inicial



        while(tecladoDigitado != 0){
            if(tecladoDigitado == 1){//Cadastrar produtos

            }
            else if(tecladoDigitado == 2){//Exibir produtos
                carrinhoProdutos.mostraEstoque();
                tecladoDigitado = 3;
            }
            else{//Forçar usuário a escolher uma opção
                String mensagem = "Você deseja fazer o que?" + "\n1 - Cadastrar produtos" + "\n2 - Exibir produtos" + "\n0 - Sair";
                tecladoDigitado = tecladoInt.leituraTecladoInt(mensagem);
            }

        }//Fim while


    }
}
