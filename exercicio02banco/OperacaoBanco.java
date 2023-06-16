package exercicio02banco;

public class OperacaoBanco implements CalculoTributos {
    double valorDinheiro;
    public double ContaPoupanca(double valor){
        this.valorDinheiro = valor;
        this.valorDinheiro = 0.0;
        return this.valorDinheiro;
    }

    public double ContaCorrente(double valor) {
        this.valorDinheiro = valor;
        this.valorDinheiro = valor * 0.01;
        return this.valorDinheiro;
    }


    public double SeguroDeVida(double valor){
        this.valorDinheiro = valor;
        this.valorDinheiro = 42.0;
        return this.valorDinheiro;
    }
}
