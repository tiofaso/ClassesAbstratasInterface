package exercicio02RetanguloCirculoQuadrado;

public class Circulo extends Forma {
    @Override
    public void calcularArea() {
        this.area = 3.14 * (this.raio * this.raio);
        System.out.println("A área do cículo é: " + this.area);
    }

    @Override
    public void calcularPerimetro() {
        this.comprimento = 2 * 3.14 * this.raio;
        System.out.println("Comprimento do cículo é: " + this.comprimento);
    }
}
